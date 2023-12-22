/**
 * Combinatorial - Coin Changing Problem
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = parseInt(line.substring(0, line.indexOf(' ')));
			int m = parseInt(line.substring(line.indexOf(' ') + 1));

			int[] ns = new int[n + 1];
			int[] cs = new int[m];

			Arrays.fill(ns, Integer.MAX_VALUE);
			ns[0] = 0;

			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < m; i++) cs[i] = parseInt(st.nextToken());

			//solve
			for (int i = 0; i < m; i++) {
				for (int j = cs[i]; j < n + 1; j++) {
					ns[j] = Math.min(ns[j], ns[j - cs[i]] + 1);
				}
			}
			System.out.println(ns[n]);
		}//end while
	}//end main
}