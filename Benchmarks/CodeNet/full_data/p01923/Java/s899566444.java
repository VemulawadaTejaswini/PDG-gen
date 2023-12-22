import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

/**
 * JAG Practice Contest
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int N, M;
			N = parseInt(line.substring(0, line.indexOf(' ')));
			M = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((N | M) == 0) break;

			int[] vs = new int[M + 1];

			for (int i = 0; i < N; i++) {
				line = br.readLine();
				int d, v;
				d = parseInt(line.substring(0, line.indexOf(' ')));
				v = parseInt(line.substring(line.indexOf(' ') + 1));
				vs[d] = Math.max(vs[d], v);
			}

			System.out.println(Arrays.stream(vs).sum());
		}
	}
}