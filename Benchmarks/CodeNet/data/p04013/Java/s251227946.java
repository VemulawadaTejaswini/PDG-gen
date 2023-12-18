import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int[] x = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			x[i] = sc.nextInt();
		}
		long[][][] dp = new long[N + 1][N + 1][N * A + 1];
		dp[0][0][0] = 1;

		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= N; j++) {
				for (int k = 0; k <= N * A; k++) {
					if (i != 0) {
						dp[i][j][k] = dp[i - 1][j][k];
					}
					if (i > 0 && j > 0 && k >= x[i]) {
						dp[i][j][k] += dp[i - 1][j - 1][k - x[i]];
					}
				}
			}
		}
		long ans = 0;

		for (int i = 1; i <= N; i++) {
			ans += dp[N][i][i * A];
		}

		System.out.println(ans);
	}

}