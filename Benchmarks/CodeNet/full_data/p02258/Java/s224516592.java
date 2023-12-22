import java.util.*;

public class Main {

	public static void compute_maxprofit(int n, int[] prices) {
		int[] table = new int[n];
		int min = prices[0];
		table[0] =Integer.MIN_VALUE;
		
		
		for(int i = 1; i < n; i ++) {
			
			 table[i] = Math.max(prices[i] - min, table[i-1]);
			 
			 if (prices[i] < min) {
				 min = prices[i];
			 }
	}
		System.out.println(table[n-1]);
		
	}
		
		      

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] prices = new int[n];

		
		
		for (int z =0; z < n; z++) {
			
		int temp = scan.nextInt();
		prices[z] = temp;
			
		}
		
		

		compute_maxprofit(n, prices);
		
	}
}

