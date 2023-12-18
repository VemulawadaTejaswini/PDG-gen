

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws java.lang.Exception {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      String input[] = br.readLine().split(" ");
	      double a = Double.parseDouble(input[0]);
	      double b = Double.parseDouble(input[1]);
	      double c = Double.parseDouble(input[2]);
	      if(c < a || c < b) {
	    	  System.out.println("No");
	    	  return;
	      }
	      double lhs = Math.sqrt(a) + Math.sqrt(b);
	      double rhs = Math.sqrt(c);
	      System.out.println((lhs < rhs)?"Yes":"No");
	}

}
