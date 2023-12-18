
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextLong();
		}
		long[][] dp = new long[n][n];
		for (int i = 0; i < n; i++)
			Arrays.fill(dp[i], Long.MIN_VALUE);
		System.out.println(rec(arr, 0, n - 1, dp));
	}

	public static long rec(long[] arr, int i, int j, long[][] dp) {
		if (i == j) {
			dp[i][j] = arr[i];
			return dp[i][j];
		}
		if (dp[i][j] != Integer.MIN_VALUE)
			return dp[i][j];

		dp[i][j] = Math.max(arr[i] - rec(arr, i + 1, j, dp), arr[j] - rec(arr, i, j - 1, dp));
		return dp[i][j];
	}
}
