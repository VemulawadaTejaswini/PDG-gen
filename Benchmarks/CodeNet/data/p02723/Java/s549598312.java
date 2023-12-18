import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
      	Scanner scanInputs =  new Scanner(System.in);
      	String strInput =  "";
      
      while(scanInputs.hasNext()) {
		  strInput = String.valueOf(scanInputs.next()).substring(2);
          String strBase = "";
          for(int i=0; i<=strInput.length(); i++) {
            if(i<strInput.length()-1) {
              strBase = strInput.substring(0, i);
              String strNext = strInput.substring(0, i+1);
              if(strBase.equals(strNext)) {
                  System.out.println("Yes");
              } else {
                  System.out.println("No");
              }
          	}
          }
      }
    }
}