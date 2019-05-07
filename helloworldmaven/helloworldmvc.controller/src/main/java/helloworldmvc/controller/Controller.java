package helloworldmvc.controller;

import helloworldmvc.contract.IMODEL;
import helloworldmvc.contract.IVIEW;

public class Controller {

		private final IVIEW view;
		private final IMODEL model;
	
	public Controller(final IVIEW view , final IMODEL model) {
		this.view = view;
		this.model = model;
	}
		public void run() {
			this.view.displayMessage(this.model.getHelloWorld());
		}
}
