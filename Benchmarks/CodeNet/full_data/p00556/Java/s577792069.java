import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

/**
 * Plush Toys
 */
public class Main {

	static final int INF = 1 << 29;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		line = br.readLine();

		int N, M;
		N = parseInt(line.substring(0, line.indexOf(' ')));
		M = parseInt(line.substring(line.indexOf(' ') + 1));

		int[] P = new int[N];
		int[] C = new int[M];
		int[] S = new int[1 << M];

		for (int i = 0; i < N; i++) {
			P[i] = parseInt(br.readLine()) - 1;
			C[P[i]]++;
		}

		for (int i = 0; i < 1 << M; i++) {
			for (int j = 0; j < M; j++) {
				if ((i >> j & 1) == 1) {
					S[i] += C[j];
				}
			}
		}

		int[] dp = new int[1 << M];

		Arrays.fill(dp, INF);
		dp[0] = 0;

		for (int i = 0; i < 1 << M; i++) {
			for (int j = 0; j < M; j++) {
				if ((i >> j & 1) == 0) {
					int diff = 0;
					for (int k = 0; k < C[j]; k++) {
						if (P[S[i] + k] != j) diff++;
					}
					dp[i | 1 << j] = Math.min(dp[i | 1 << j], dp[i] + diff);
				}
			}
		}

		System.out.println(dp[(1 << M) - 1]);
	}
}