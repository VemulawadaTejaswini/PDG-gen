

import java.util.Scanner;

public class Main {
	
	/*
	at time i, there are only two possible choices, sell or don't sell. 
	So, the maximum profit up to time i is the higher value of these two: 
	a) the maximum profit realized before time i, and 
	b) the max profit when sell happens at time i 
	(which is R[j] - #minimum currency prior to time i). 
	The maximum profit at the last time point is the solution of the original problem.
	*/
	
	public static int max(int x, int y) {
		if(x >= y) {
			return x;
		}
		else {
			return y;
		}
	}
	
	//given n times, and R, an array of currencies/rates
		public static int compute_maxprofit(int n, int[] R) {
			int max_profit = -1000000000;
			int min_val = 1000000000;
	    	for(int i = 0; i < n - 1; i++) {
		    	
	    		// check if i is new min
	    		if(R[i] < min_val) {
	    			min_val = R[i];
	    		}
	    		// other code here
	    		max_profit = max(max_profit, R[i + 1] - min_val);
				
		    }
		      return max_profit;
		}
		
		
		      

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			int first = in.nextInt();
			int[] arry = new int[first];
			for(int i = 0; i < first; i++) {
				arry[i] = in.nextInt();
			}
			
			System.out.println( compute_maxprofit(first,arry) );
			
		}

}

