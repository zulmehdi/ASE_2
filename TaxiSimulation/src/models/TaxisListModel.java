package models;

import java.util.List;

public class TaxisListModel {
	private List<TaxiModel> taxis;
	
	public List<TaxiModel> getTaxis() {
		return taxis;
	}
	
	public void setTaxis(List<TaxiModel> taxis) {
		this.taxis = taxis;
	}
	
	public String displayTaxisListInfo() {
		String s = "";
		
		for(TaxiModel taxi : taxis) {
			s += taxi.displayTaxiInfo();
		}
		
		return s;
	}
}