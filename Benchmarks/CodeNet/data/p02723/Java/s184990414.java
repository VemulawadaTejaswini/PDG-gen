public class Main {
	public static void main(String args[]) {
    	String strBase = "coffee";
      	String strInput =  new Scanner(System.in);
      
      	String strBaseChk = strBase.substring(2, 5);
      	String strInputChk = strInput.substring(2, 5);
      
      	if(strBaseChk.equals(strInputChk)) {
        	System.out.plintln("Yes");
        } else {
        	System.out.plintln("No");
        }
    }
}