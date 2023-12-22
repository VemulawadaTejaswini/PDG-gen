import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Modular Query
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int N = parseInt(line.substring(0, line.indexOf(' ')));
			int Q = parseInt(line.substring(line.indexOf(' ') + 1));
			boolean[] cs = new boolean[300001];
			int max = 0;

			StringTokenizer st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				int c = parseInt(st.nextToken());
				cs[c] = true;
				max = Math.max(max, c);
			}

			for (int i = 0; i < Q; i++) {
				int q = parseInt(br.readLine());
				int j = q - 1;
				found:
				for (; j >= 0; j--) {
					for (int k = j; k <= max; k += q) {
						if (cs[k]) break found;
					}
				}
				System.out.println(j);
			}
		}
	}
}