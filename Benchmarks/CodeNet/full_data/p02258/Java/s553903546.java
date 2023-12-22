import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] R = new int[n];
		for(int i = 0 ; i < n ; i++) {
			R[i] = input.nextInt();
		}
		Main test = new Main();
		System.out.println(test.dynMaxProfit(n, R));
	}
	
	int dynMaxProfit(int n, int[] R) { 
		int[] maxProfit = new int[n];
		maxProfit[0] = Integer.MIN_VALUE; 
		int min = R[0];
		for(int i = 1; i < n; i ++)  {
			int sell = R[i] - min;
			int notSell = maxProfit[i-1];
	        if(min > R[i]) {
	        	min = R[i];
	        }
	        maxProfit[i] = Math.max(sell, notSell);
		}
	return maxProfit[n-1];
	}
}
