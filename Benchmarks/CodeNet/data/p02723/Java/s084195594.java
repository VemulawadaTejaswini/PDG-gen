import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
    	String strBase = "coffee";
      	Scanner scanInputs =  new Scanner(System.in);
      	String strInput =  "";
      
      while(scanInputs.hasNext()) {
		  strInput = String.valueOf(scanInputs.next());      
          String strBaseChk = strBase.substring(2, 5);
          String strInputChk = strInput.substring(2, 5);

          if(strBaseChk.equals(strInputChk)) {
              System.out.println("Yes");
          } else {
              System.out.println("No");
          }
      }
    }
}