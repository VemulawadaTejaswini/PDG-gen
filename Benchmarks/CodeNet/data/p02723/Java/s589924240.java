public class Main {
	public static void main(String args[]) {
    	String strBase = "coffee";
      	Scanner scanInputs =  new Scanner(System.in);
      	String strInput =  "";
      
      for(scanInput : scanInputs) {
		  strInput = String.valueOf(scanInput);      
          String strBaseChk = strBase.substring(2, 5);
          String strInputChk = strInput.substring(2, 5);

          if(strBaseChk.equals(strInputChk)) {
              System.out.plintln("Yes");
          } else {
              System.out.plintln("No");
          }
      }
    }
}