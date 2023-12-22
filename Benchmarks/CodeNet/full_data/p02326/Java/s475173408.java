import java.util.Scanner;

/**
 * Pattern - Largest Square
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H, W;
		H = sc.nextInt();
		W = sc.nextInt();

		int[][] dp = new int[H + 1][W + 1];

		for (int i = 1; i <= H; i++) {
			for (int j = 1; j <= W; j++) {
				dp[i][j] = sc.nextInt() == 1 ? 0 : 1;
			}
		}

		int max = 0;

		for (int i = 1; i <= H; i++) {
			for (int j = 1; j <= W; j++) {
				if (dp[i][j] == 1) {
					dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
					max = Math.max(max, dp[i][j]);
				}
			}
		}

		System.out.println(max * max);

	}
}