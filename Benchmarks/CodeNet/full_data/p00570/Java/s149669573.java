import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

/**
 * Stove
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		line = br.readLine();

		int N, K;
		N = parseInt(line.substring(0, line.indexOf(' ')));
		K = parseInt(line.substring(line.indexOf(' ') + 1));

		int[] T = new int[N];
		int[] interval = new int[N - 1];

		for (int i = 0; i < N; i++) {
			T[i] = parseInt(br.readLine());
			if (i > 0) {
				interval[i - 1] = T[i] - T[i - 1] - 1;
			}
		}

		int ans = T[N - 1] - T[0] + 1;

		Arrays.sort(interval);

		for (int i = 0, j = N - 2; i < K - 1; i++, j--) {
			ans -= interval[j];
		}

		System.out.println(ans);
	}
}
