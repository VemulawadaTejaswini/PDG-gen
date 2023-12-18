import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		try {
		    
		      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		      String nLine = br.readLine();
		      String hLine = br.readLine();
		      String aLine = br.readLine();
		      int n = Integer.parseInt(nLine);
		      String[] heights = hLine.split(" ");
		      String[] beautyLine = aLine.split(" ");
		      
		      int[] dp = new int[n];
		      long[] beautyDP = new long[n];
		      Arrays.fill(dp, 1);
		      
		      for(int i = 0 ; i < beautyLine.length ; i++) {
		    	  beautyDP[i] = Integer.parseInt(beautyLine[i]);
		      }
		      for(int i = 0 ; i < n; i++) {
		    	  int heightOfI = Integer.parseInt(heights[i]);
		    	  int beautyOfI = Integer.parseInt(beautyLine[i]);
		    	  for(int j = 0 ; j < i ; j++) {
		    		  int heightOfJ = Integer.parseInt(heights[j]);
		    		  if(heightOfI > heightOfJ && 1 + dp[j] >= dp[i] && beautyDP[i] < beautyDP[j] + beautyOfI) {
		    			  dp[i] = dp[j] + 1;
		    			  beautyDP[i] = beautyDP[j] + beautyOfI;
		    		  }
		    	  }
		    	  //System.out.println("i is " + i + " beauty is " + beautyDP[i]);
		      }
		      
		      long maxBeautySum = 0;
		      
		      for(int i = n-1; i >= 0 ; i--) {
		    	  maxBeautySum = Math.max(maxBeautySum, beautyDP[i]);
		      }

		      System.out.println(maxBeautySum);
		      
		    } catch(Exception ex) {
		    	System.out.println("Error is " + ex);
		    }

	}
	
	/*private static long findMaxBeautySum(String[] beautyLine, int[] prev, int maxHeightPosition) {
		long maxBeautySum = 0;
	    while(maxHeightPosition != -1)
	    {
	    	System.out.print(" maxHeightPosition is " + maxHeightPosition);
	    	 maxBeautySum += Integer.parseInt(beautyLine[maxHeightPosition]);
	    	 maxHeightPosition = prev[maxHeightPosition];
	    }
	    return maxBeautySum;
	}*/
}
