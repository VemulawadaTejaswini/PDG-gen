import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[][] G = new int [size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				G[i][j] = scanner.nextInt();
			}
		}
		boolean[] isVisites = new boolean[size];
		int[] costs = new int[size];
		Arrays.fill(costs, Integer.MAX_VALUE);
		costs[0] = 0;
		int cost = 0;
		for (int i = 0; i < size; i++) {
			int minCost = Integer.MAX_VALUE;
			int minEm = -1;
			for (int j = 0; j < size; j++) {
				if (!isVisites[j] && costs[j] < minCost) {
					minCost = costs[j];
					minEm = j;
				}
			}
			isVisites[minEm] = true;
			cost += costs[minEm];
			for (int k = 0; k < size; k++) {
				costs[k] = Math.min(costs[k], G[minEm][k] < 0 ? Integer.MAX_VALUE : G[minEm][k]);
			}
		}
		System.out.println(cost);
	}
}