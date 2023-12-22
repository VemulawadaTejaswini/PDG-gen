import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

/**
 * RUPC
 */
public class Main {

	static final int MAX = 1_000_001;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		//
		int N = parseInt(br.readLine());
		long[] sum = new long[MAX];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			int a = parseInt(st.nextToken());
			sum[a]++;
		}

		for (int i = 1; i < MAX; i++) {
			sum[i] = sum[i] * i + sum[i - 1];
		}

		//
		int M = parseInt(br.readLine());
		int[] b = new int[M];
		long[] c = new long[M];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < M; i++) {
			b[i] = parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < M; i++) {
			c[i] = parseLong(st.nextToken());
		}

		//
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < M; i++) {
			if (sum[b[i]] >= c[i]) {
				sb.append("Yes\n");
			} else {
				sb.append("No\n");
			}
		}

		System.out.print(sb.toString());

	}
}