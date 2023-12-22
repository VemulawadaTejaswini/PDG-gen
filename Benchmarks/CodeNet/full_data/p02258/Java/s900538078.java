import java.util.Scanner;

public class Main{
	
	public static int maxProfitQuadratic(int[] prices) {
		int maxProfit = prices.length > 1 ? prices[1] - prices[0] : 0;
		for(int i = 0; i < prices.length - 1; i++) {
			for(int j = i + 1; j < prices.length; j++) {
				if(prices[j] - prices[i] > maxProfit)
					maxProfit = prices[j] - prices[i];
			}
		}
		
		return maxProfit;
	}
	
	public static int maxProfitLinear(int[] prices) {
		int maxProfit = prices.length > 1 ? prices[1] - prices[0] : 0;
		int minValue = Math.min(prices[1], prices[0]);
		for(int i = 2; i < prices.length; i++) {
			maxProfit = Math.max(maxProfit,  prices[i] - minValue);
			minValue = Math.min(minValue,  prices[i]);
		}
		return maxProfit;
	}
	
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] prices = new int[size];
		for(int i = 0; i < size; i++)
			prices[i] = scan.nextInt();
		
		System.out.println(maxProfitLinear(prices));
	}
}

