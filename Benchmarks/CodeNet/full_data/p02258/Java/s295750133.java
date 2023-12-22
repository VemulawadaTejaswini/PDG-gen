import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numVals = in.nextInt();
		int[] curVals = new int[numVals];
		for(int i = 0; i < numVals; i++) {
			curVals[i] = in.nextInt();
		}
		in.close();
		
		System.out.println(computeMax(numVals, curVals));
	}
	
	private static int computeMax(int n, int[] R) {
		int maxProfit = Integer.MIN_VALUE;
		int minCurrVal = Integer.MAX_VALUE;
	      for(int i = 0; i < n; i ++) {
	    	  	if(i > 0)maxProfit = Math.max(maxProfit, R[i]-minCurrVal);
	    	  	if(R[i] < minCurrVal)minCurrVal = R[i];
	    	  	//System.out.println("Max Profit: " + maxProfit);
	    	  	//System.out.println("Min Value: " + minCurrVal);
	         }
	     return maxProfit;
	}
}
