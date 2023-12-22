import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int MOD = 100000;

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			N *= N;
			int M = sc.nextInt();
			int S = sc.nextInt();
			if (N == 0) break;
			S -= N * (N + 1) / 2;
			M -= N;
			int turn = 1;
			int[][][] dp = new int[2][S + 1][M + 1];
			dp[0][S][0] = 1;
			for (int i = 0; i < N; ++i) {
				int maxM = M / (N - i);
				for (int[] a : dp[turn]) {
					for (int j = 0; j <= maxM; ++j) {
						a[j] = 0;
					}
				}
				int maxK = Math.min(M, S / (N - i));
				for (int j = 0; j <= S; ++j) {
					for (int k = 0; k <= maxK; ++k) {
						if (dp[1 - turn][j][k] == 0) continue;
						for (int l = 0; k + l <= M; ++l) {
							int ns = j - l * (N - i);
							if (ns < 0) break;
							dp[turn][ns][k + l] += dp[1 - turn][j][k];
							if (dp[turn][ns][k + l] >= MOD) dp[turn][ns][k + l] -= MOD;
						}
					}
				}
				turn = 1 - turn;
			}
			int ans = 0;
			for (int i = 0; i <= M; ++i) {
				ans += dp[1 - turn][0][i];
			}
			System.out.println(ans % MOD);
		}
	}
}