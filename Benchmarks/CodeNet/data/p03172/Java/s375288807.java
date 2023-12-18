
import java.util.Scanner;

public class Main{
	public static long stoneGame(int[] piles) {
		long[][] dp = new long[piles.length + 1][piles.length];

		for (int gap = 0; gap < piles.length; gap++) {
			for (int i = 0, j = i + gap; j < piles.length; j++, i++) {
				if (gap == 0) {
					dp[i][j] = piles[i];
				} else {
					dp[i][j] = Math.max(piles[i] - dp[i + 1][j], piles[j] - dp[i][j - 1]);
				}

			}

		}

		return dp[0][piles.length - 1];
	}

	static long mod = (long) (1e9 + 7);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();

		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scn.nextInt();
		}
		long dp[][] = new long[n + 1][k + 1];
		long sum[][] = new long[n + 1][k + 1];
		for (int j = 0; j <= k; j++) {
			sum[0][j] = 1;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= k; j++) {
				if (j - a[i - 1] > 0) {
					dp[i][j] = (sum[i - 1][j] - sum[i - 1][j - a[i - 1] - 1] + mod) % mod;
				} else {
					dp[i][j] = sum[i - 1][j];
				}
				sum[i][j] = (dp[i][j]) % mod;
				if (j > 0) {
					sum[i][j] = (sum[i][j - 1] + sum[i][j]) % mod;
				}
			}
		}

		System.out.println(dp[n][k] % mod);

	}

}
