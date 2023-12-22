import java.util.*;

class Main {

	static Scanner sc = new Scanner(System.in);
	static int N, M;
	static long ans, K;

	private static void fuc(long[][] dp, long[] A, long[] B, int a, int b, int w) {
		if (dp[a][b] > K || w == 3) {
			ans = Math.max(ans, a + b);
			return;
		}
		if (w == 2) {
			fuc(dp, A, B, 0, 0, 0);
			fuc(dp, A, B, 0, 0, 1);
		} else {
			if (w == 0) {
				if (a < N) {
					dp[a + 1][b] = dp[a][b] + A[a];
					fuc(dp, A, B, a + 1, b, 0);
				} else {
					while (dp[a][b] < K) {
						dp[a][b + 1] = dp[a][b] + B[b];
						b++;
					}
					fuc(dp, A, B, a, b, 3);
				}
			} else {
				if (b < M) {
					dp[a][b + 1] = dp[a][b] + B[b];
					fuc(dp, A, B, a, b + 1, 1);
				} else {
					while (dp[a][b] < K) {
						dp[a + 1][b] = dp[a][b] + A[a];
						a++;
					}
					fuc(dp, A, B, a, b, 3);
				}
			}
		}
	}

	public static void main(String[] args) {
		N = sc.nextInt();
		M = sc.nextInt();
		K = sc.nextLong();
		long dp[][] = new long[N + 1][M + 1], A[] = new long[N], B[] = new long[M];
		for (int i = 0; i < N; i++)
			A[i] = sc.nextInt();
		for (int i = 0; i < M; i++)
			B[i] = sc.nextInt();
		fuc(dp, A, B, 0, 0, 2);
		System.out.println(ans);
	}
}