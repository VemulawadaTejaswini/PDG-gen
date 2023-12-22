import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Hot days - Accepted
 * JOI 12th, Pre 4
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		line = br.readLine();

		int D = parseInt(line.substring(0, line.indexOf(' ')));
		int N = parseInt(line.substring(line.indexOf(' ') + 1));

		int[] T = new int[D];
		int[][] ABC = new int[N][3];
		int[][] CC = new int[N][N];

		for (int i = 0; i < D; i++) {
			T[i] = parseInt(br.readLine());
		}

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++) {
				ABC[i][j] = parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				CC[i][j] = Math.abs(ABC[i][2] - ABC[j][2]);
			}
		}

		//solve
		int[][] dp = new int[D][N];

		for (int i = 0; i < dp.length; i++) {
			Arrays.fill(dp[i], -1);
		}

		for (int i = 0; i < N; i++) {
			if (ABC[i][0] <= T[0] && T[0] <= ABC[i][1]) {
				dp[0][i] = 0;
			}
		}

		for (int i = 1; i < D; i++) {
			for (int j = 0; j < N; j++) {
				if (ABC[j][0] <= T[i] && T[i] <= ABC[j][1]) {
					for (int k = 0; k < N; k++) {
						if (dp[i - 1][k] != -1) {
							dp[i][j] = Math.max(dp[i][j], dp[i - 1][k] + CC[j][k]);
						}
					}
				}
			}
		}

		int max = -1;
		for (int i = 0; i < N; i++) {
			max = Math.max(max, dp[D - 1][i]);
		}

		System.out.println(max);

	}
}