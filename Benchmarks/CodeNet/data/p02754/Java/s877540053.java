

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

		public static void main(String[] args) throws java.lang.Exception {
		      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		      String input[] = br.readLine().split(" ");
		      int n = Integer.parseInt(input[0]);
		      int a = Integer.parseInt(input[1]);
		      int b = Integer.parseInt(input[2]);
		      String res = "";
		      if(a == 0) {
		    	  System.out.println("0");
		    	  System.exit(0);
		      }
		      int copy = n;
		      while(n > 0) {
		    		  for(int i = 0; i < a; i++) {
		    			  res += 'b';
		    			  n--;
		    		  }
		    		  for(int i = 0; i < b; i++) {
		    			  res += 'r';
		    			  n--;
		    		  }
		    	  
		      	}
		      int count = 0;
		      for(int i = 0; i < copy; i++) {
		    	  if(res.charAt(i) == 'b')
		    		  count++;
		      }
		      System.out.println(count);
		}
}