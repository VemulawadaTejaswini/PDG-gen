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
			int[][] dp = new int[S + 1][N + 1];
			dp[0][0] = 1;
			for (int i = 1; i <= M; ++i) {
				for (int j = S - i; j >= 0; --j) {
					for (int k = N - 1; k >= 0; --k) {
						dp[j + i][k + 1] += dp[j][k];
						if (dp[j + i][k + 1] >= MOD) dp[j + i][k + 1] -= MOD;
					}
				}
			}
			System.out.println(dp[S][N]);
		}
	}
}