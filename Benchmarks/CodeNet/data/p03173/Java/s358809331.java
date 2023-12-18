import java.util.Scanner;

public class Main {

	static long[][][] dp;
	static long[] largeArray;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		largeArray = new long[n];

		for (int i = 0; i < n; i++) {

			largeArray[i] = scan.nextLong();
		}

		dp = new long[n + 1][n + 1][2];

		for (int end = 1; end <= n; end++) {

			for (int start = n; start > 0; start--) {

				dpMethod(start, end);

			}
		}

		println(dp[1][n][1]);
	}

	public static void dpMethod(int start, int end) {

		if (start > end) {

			return;

		} else if (start == end) {

			dp[start][end][0] = largeArray[start - 1];

		} else {

			long costResult = Long.MAX_VALUE;

			for (int i = 1; i <= end - start; i++) {

				long target = dp[start + i][end][0]
						+ dp[start + i][end][1]
						+ dp[start][start + i - 1][0]
						+ dp[start][start + i - 1][1];

				costResult = Math.min(costResult, target);
			}

			long resultLarge = dp[start + 1][end][0] + dp[start][start][0];

			dp[start][end][0] = resultLarge;
			dp[start][end][1] = costResult;
		}
	}

	public static void println(Object target) {
		System.out.println(target);
	}
}
