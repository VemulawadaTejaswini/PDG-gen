import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

/**
 * Knocker of the Gigas Cedar
 * PCK2013 ??¬???4
 */
public class Main {

	static final int INF = 1 << 29;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int D, N;
			D = parseInt(line.substring(0, line.indexOf(' ')));
			N = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((D | N) == 0) break;

			int[] A = new int[N];
			int[] E = new int[N];
			int[] R = new int[N];

			for (int i = 0; i < N; i++) {
				words = br.readLine().split(" ");
				A[i] = parseInt(words[0]);
				E[i] = parseInt(words[1]);
				R[i] = parseInt(words[2]);
			}

			//?¨?????????????????????????, ????¨????
			int[][] dp = new int[D + 1][101];

			for (int i = 0; i < dp.length; i++) {
				Arrays.fill(dp[i], INF);
			}

			dp[0][0] = 0;

			for (int i = 0; i <= D; i++) {
				for (int j = 0; j <= 100; j++) {
					for (int k = 0; k < N; k++) {
						int nd = Math.min(i + A[k], D);
						int ne = Math.min(j + E[k], 100);
						if (j >= R[k]) {
							dp[nd][ne] = Math.min(dp[nd][ne], dp[i][j] + 1);
						}
					}
				}
			}

			int ans = INF;

			for (int i = 0; i <= 100; i++) {
				ans = Math.min(ans, dp[D][i]);
			}

			System.out.println(ans != INF ? ans : "NA");
		}
	}
}