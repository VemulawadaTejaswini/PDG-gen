import java.util.Arrays;
import java.util.Scanner;

/**
 * Silk Road
 * JOI 14th, Pre 4
 */
public class Main {

	static final int INF = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line;
		String[] words;

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] D = new int[N + 1];
		int[] C = new int[M + 1];
		int[][] DC = new int[D.length][C.length];

		for (int i = 1; i <= N; i++) {
			D[i] = sc.nextInt();
		}
		for (int i = 1; i <= M; i++) {
			C[i] = sc.nextInt();
		}
		for (int i = 0; i < D.length; i++) {
			for (int j = 0; j < C.length; j++) {
				DC[i][j] = D[i] * C[j];
			}
		}

		//
		int[][] dp = new int[N + 1][M + 1];

		for (int i = 1; i < dp.length; i++) {
			Arrays.fill(dp[i], INF);
		}

		for (int i = 1; i <= N; i++) {
			for (int j = i; j <= M; j++) {
				dp[i][j] = Math.min(dp[i][j - 1], dp[i - 1][j - 1] + DC[i][j]);
			}
		}
		System.out.println(dp[N][M]);
	}
}