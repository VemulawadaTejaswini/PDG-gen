import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int w = s.nextInt();
		
		long[] values = new long[n];
		int[] weights = new int[n];
		
		for(int i = 0; i < n; i++) {
			weights[i] = s.nextInt();
			values[i] = s.nextLong();
		}
		
		long[][] knapsack = new long[n + 1][w + 1];

		for(int r = 1; r < knapsack.length; r++) {
			for(int c = 1; c < knapsack[0].length; c++) {
				long ifChosen = c < weights[r - 1] ? 0 : values[r - 1] + knapsack[r-1][c - weights[r - 1]];
				knapsack[r][c] = Math.max(knapsack[r - 1][c], ifChosen);
//				System.out.prlongln(" hello " );
			}
		}
		System.out.println(knapsack[knapsack.length - 1][knapsack[0].length - 1]);
	}
}
