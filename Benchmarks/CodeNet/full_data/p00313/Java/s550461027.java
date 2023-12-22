import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Secret Investigation
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int N = parseInt(br.readLine());

		boolean[] A = new boolean[N];
		boolean[] B = new boolean[N];
		boolean[] C = new boolean[N];

		boolean[][] sets = {A, B, C};

		for (boolean[] set : sets) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			st.nextToken();

			while (st.hasMoreTokens()) {
				int i = parseInt(st.nextToken());
				set[i - 1] = true;
			}
		}

		int count = 0;

		for (int i = 0; i < N; i++) {
			if ((!A[i] && C[i]) || (B[i] && C[i])) count++;
		}

		System.out.println(count);
	}
}