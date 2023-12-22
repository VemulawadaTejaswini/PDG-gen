import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Social
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N, K;
		N = parseInt(st.nextToken());
		K = parseInt(st.nextToken());

		int[][] bs = new int[N + 1][2];

		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			int m = parseInt(st.nextToken());
			for (int j = 0; j < m; j++) {
				int b = parseInt(st.nextToken());
				bs[b][0] = i;
			}
		}

		int R = parseInt(br.readLine());

		for (int i = 0; i < R; i++) {
			st = new StringTokenizer(br.readLine());
			int p, q;
			p = parseInt(st.nextToken());
			q = parseInt(st.nextToken());
			if (bs[p][0] == bs[q][0]) {
				bs[p][1] = 1;
				bs[q][1] = 1;
			}
		}

		int count = 0;

		for (int i = 1; i <= N; i++) {
			if (bs[i][1] == 1) count++;
		}

		System.out.println(count);
	}
}