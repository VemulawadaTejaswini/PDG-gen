import java.util.Scanner;

/**
 * Combinatorial - Knapsack Problem
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line;

		int N = sc.nextInt();
		int W = sc.nextInt();
		int[] vs = new int[N + 1];
		int[] ws = new int[N + 1];
		int[] dp = new int[W + 1];

		for (int i = 1; i <= N; i++) {
			vs[i] = sc.nextInt();
			ws[i] = sc.nextInt();
		}

		for (int i = 1; i <= N; i++) {
			for (int j = ws[i]; j <= W; j++) {
				dp[j] = Math.max(dp[j], dp[j - ws[i]] + vs[i]);
			}
		}

		System.out.println(dp[W]);
	}
}