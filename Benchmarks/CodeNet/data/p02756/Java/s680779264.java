

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

		public static void main(String[] args) throws java.lang.Exception {
		      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		      String s1 = br.readLine();
		      StringBuilder s = new StringBuilder(s1);
		      int q = Integer.parseInt(br.readLine());
		      while(q-->0) {
		    	  
		    	  String input[] = br.readLine().split(" ");
		    	  int t = Integer.parseInt(input[0]);
		    	  if(t == 1) {
		    		  s.reverse();
		    	  }
		    	  if(t == 2) {
		    		  int f = Integer.parseInt(input[1]);
		    		  String c = input[2];
		    		  if( f == 1) {
		    			  StringBuilder temp = new StringBuilder("");
		    			  temp.append(c);
		    			  temp.append(s);
		    			  s = temp;
		    			  
		    		  }
		    		  else
		    			  s.append(c);
		    	  }
		      }
		      System.out.println(s);
		}
}