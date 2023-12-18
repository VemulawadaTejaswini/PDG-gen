import java.util.Scanner;

public class Main {

	static long[][] dp;
	static int[][] matchingArray;

	static final long DIVIDE_NUMBER = 1000000007;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		matchingArray = new int[n][n];

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				matchingArray[i][j] = scan.nextInt();
			}
		}

		int allPattern = (int) Math.pow(2, n);

		dp = new long[n + 1][allPattern];

		dp[0][0] = 1;

		for (int i = 1; i < n + 1; i++) {

			for (int j = 0; j < n; j++) {

				if (matchingArray[i - 1][j] == 1) {

					for (int k = 0; k < allPattern; k++) {

						if (dp[i - 1][k] > 0) {

							int target = k | 1 << j;

							dp[i][target] += dp[i - 1][k];

							if (dp[i][target] > DIVIDE_NUMBER) {

								dp[i][target] = dp[i][target] % DIVIDE_NUMBER;
							}
						}
					}
				}
			}
		}

		println(dp[n][allPattern - 1]);
	}

	public static void println(Object target) {
		System.out.println(target);
	}
}
