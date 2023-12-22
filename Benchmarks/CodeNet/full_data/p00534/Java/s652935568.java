import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Silk Road
 * JOI 14th, Pre 4
 */
public class Main {

	static final long INF = (long) Math.pow(1000, 3) + 1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		line = br.readLine();
		int N, M;
		N = parseInt(line.substring(0, line.indexOf(' ')));
		M = parseInt(line.substring(line.indexOf(' ') + 1));

		long[][] dp = new long[N + 1][M + 1];
		int[] ds = new int[N + 1];
		int[] cs = new int[M + 1];

		for (int i = 1; i <= N; i++) ds[i] = parseInt(br.readLine());
		for (int i = 1; i <= M; i++) cs[i] = parseInt(br.readLine());

		int[][] _dp = new int[ds.length][cs.length];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				_dp[i][j] = ds[i] * cs[j];
			}
		}

		for (int i = 1; i <= N; i++) {
			int _i = i;
			for (int j = i; j <= M - N + _i; j++) {
				long min = INF;
				for (int k = i - 1; k <= j - 1; k++) {
					dp[i][j] = Math.min(min, dp[i - 1][k] + _dp[i][j]);
				}
			}
		}

		long min = INF;
		for (int i = 1; i <= M; i++) {
			if (dp[N][i] != 0) min = Math.min(min, dp[N][i]);
		}
		System.out.println(min);
	}
}