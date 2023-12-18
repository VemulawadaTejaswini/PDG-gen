
import java.util.Scanner;

public class Main {

	static int n;
	static int[] stones;
	static int memo[][];

	public static void main(String[] args) {

		String input1 = "";
		String input2 = "";
		Scanner scanner = new Scanner(System.in);
		input1 = scanner.nextLine();
		input2 = scanner.nextLine();

		n = Integer.parseInt(input1);

		String[] array = input2.split(" ");
		stones = new int[n];
		for (int i = 0; i < array.length; i++) {
			stones[i] = Integer.parseInt(array[i]);
		}

		memo = new int[n][n];
		for (int i = 0; i < memo.length; i++) {
			for (int j = 0; j < memo.length; j++) {
				memo[i][j] = -1;
			}
		}
		System.out.println(getMinCostStone(0, 1));
		scanner.close();
	}

	/**
	 * This method allows to find the min hi
	 * 
	 * @param i from the current stone
	 * @param j the possible next stone
	 * @return the min distance
	 */
	public static int getMinCostStone(int i, int j) {
		if (j == n && i == n - 1) {
			return 0;
		}
		if (j == n - 1 && i == n - 2) {
			return memo[i][j] = Math.abs(stones[i] - stones[j]);
		}
		if (stones[i] == stones[j]) {
			return 0;
		}
		if (memo[i][j] != -1) {
			return memo[i][j];
		}
//		ans1 += "|" + stones[i] + "-" + stones[j] + "| + ";
		int cost1 = Math.abs(stones[i] - stones[j]) + getMinCostStone(j, j + 1);
		memo[i][j] = cost1;
//		ans1 += " = "+cost1;
//		ans2 += "|" + stones[i] + "-" + stones[j+1] + "| + ";
//		System.out.println((i+1)+" "+(j+1));
		int cost2 = Math.abs(stones[i] - stones[j + 1]) + getMinCostStone(j + 1, j + 2);

		memo[i][j] = cost2;
//		ans2 += " = "+cost2;
		return memo[i][j] = Integer.min(cost1, cost2);
	}

}
