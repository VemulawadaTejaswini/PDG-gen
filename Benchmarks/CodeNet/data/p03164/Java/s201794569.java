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
		
		
		long[][] knapsack = new long[2][w + 1];

		for(int r = 1; r < n + 1; r++) {
			for(int c = 1; c < w + 1; c++) {
				long ifChosen = c < weights[r - 1] ? 0 : values[r - 1] + knapsack[0][c - weights[r - 1]];
				knapsack[1][c] = Math.max(knapsack[0][c], ifChosen);
			}
			// shift all elements one row up
			knapsack[0] = knapsack[1].clone();
			//System.out.println(Arrays.toString(knapsack[1]));
			//knapsack[1] = new long[w + 1];
		}
		System.out.println(knapsack[1][knapsack[0].length - 1]);
	}
}
