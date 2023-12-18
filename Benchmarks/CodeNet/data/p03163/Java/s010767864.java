import java.util.Arrays;
import java.util.Scanner;

public class Knapsack {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int w = s.nextInt();
		
		int[] values = new int[n];
		int[] weights = new int[n];
		
		for(int i = 0; i < n; i++) {
			weights[i] = s.nextInt();
			values[i] = s.nextInt();
		}
		
		int[][] knapsack = new int[n + 1][w + 1];

		for(int r = 1; r < knapsack.length; r++) {
			for(int c = 1; c < knapsack[0].length; c++) {
				int ifChosen = c < weights[r - 1] ? 0 : values[r - 1] + knapsack[r-1][c - weights[r - 1]];
				knapsack[r][c] = Math.max(knapsack[r - 1][c], ifChosen);
//				System.out.println(" hello " );
			}
		}
		System.out.println(knapsack[knapsack.length - 1][knapsack[0].length - 1]);
	}
}
