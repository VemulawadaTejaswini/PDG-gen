import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		sc.close();

		int n2 = 1 << n;
		long[] dp = new long[n2];
		dp[0] = 1;
		for (int i = 0; i < n2 - 1; i++) {
			int j = Integer.bitCount(i);
			for (int j2 = 0; j2 < n; j2++) {
				if (a[j][j2] == 0 || (i >> j2 & 1) == 1) {
					continue;
				}
				int next = i + (1 << j2);
				dp[next] += dp[i];
				dp[next] %= 1000000007;
			}
		}
		System.out.println(dp[n2 - 1]);
	}
}
