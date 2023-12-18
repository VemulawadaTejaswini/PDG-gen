

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

		public static void main(String[] args) throws java.lang.Exception {
		      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		      String input[] = br.readLine().split(" ");
		      int n = Integer.parseInt(input[0]);
		      int a = Integer.parseInt(input[1]);
		      int b = Integer.parseInt(input[2]);
		      int sum = 0;
		      if(a == 0) {
		    	  System.out.println("0");
		    	  System.exit(0);
		      }
		      while(n >= (a+b)) {
		    	  n = n - (a + b);
		    	  sum += a;
		      }
		      sum += n;
		      System.out.println(sum);
		}
}