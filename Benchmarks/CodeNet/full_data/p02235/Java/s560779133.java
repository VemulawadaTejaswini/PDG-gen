import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int n = in.nextInt();

			for (int i = 0; i < n; i++) {
				String x = in.next();
				String y = in.next();

				System.out.printf("%d\n", lcs(x, y));
			}
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	private static int lcs(final String x, final String y) {
		int n = x.length();
		int m = y.length();

		int[][] dp = new int[n+1][m+1];
		for (int i = 0; i < n+1; i++) {
			for (int j = 0; j < m+1; j++) 
				dp[i][j] = 0;
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);

				if (x.charAt(i-1) == y.charAt(j-1))
					dp[i][j] = Math.max(dp[i][j], dp[i-1][j-1]+1);
			}
		}

		return dp[n][m];
	}
}