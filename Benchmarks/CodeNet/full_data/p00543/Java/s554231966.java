import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Swapping Bibs
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		line = br.readLine();

		int N, M;
		N = parseInt(line.substring(0, line.indexOf(' ')));
		M = parseInt(line.substring(line.indexOf(' ') + 1));
		int[] zs = new int[N];

		for (int i = 0; i < N; i++) {
			zs[i] = parseInt(br.readLine());
		}

		for (int k = 1; k <= M; k++) {
			for (int i = 0; i < N - 1; i++) {
				if (zs[i] % k > zs[i + 1] % k) {
					int tmp = zs[i];
					zs[i] = zs[i + 1];
					zs[i + 1] = tmp;
				}
			}
		}

		for (int i = 0; i < N; i++) {
			System.out.println(zs[i]);
		}
	}
}