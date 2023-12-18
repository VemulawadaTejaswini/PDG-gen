

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws java.lang.Exception {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      int n = Integer.parseInt(br.readLine());
	      char input[] = br.readLine().toCharArray();
	      int x[][] = new int[n][n];
	      for(int i = 0; i < n; i++) {
	    	  x[0][i] = (int)(input[i]) - 48;
	      }
      
	      for(int i = 1; i < n; i++) {
	    	  for(int j = 0; j < n - i; j++) {
	    		  x[i][j] = Math.abs(x[i-1][j] - x[i-1][j+1]);
	    	  }
	      }
	      
	      System.out.println(x[n-1][0]);
	}

}
