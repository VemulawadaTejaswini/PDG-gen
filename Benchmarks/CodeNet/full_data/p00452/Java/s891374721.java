import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

import static java.lang.Integer.parseInt;

/**
 * Darts
 * JOI 2008 ??¬???3
 */
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int N, M;
			int[] P;

			N = parseInt(line.substring(0, line.indexOf(' ')));
			M = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((N | M) == 0) break;

			P = new int[N + 1];
			for (int i = 1; i <= N; i++) {
				P[i] = parseInt(br.readLine());
			}

			Set<Integer> ps = new HashSet<>();
			for (int i = 0; i < P.length; i++) {
				for (int j = 0; j < P.length; j++) {
					if (P[i] + P[j] <= M) ps.add(P[i] + P[j]);
				}
			}

			P = new int[ps.size()];
			int _i = 0;
			for (int p : ps) {
				P[_i] = p;
				_i++;
			}

			ps = new HashSet<>();
			for (int i = 0; i < P.length; i++) {
				for (int j = 0; j < P.length; j++) {
					if (P[i] + P[j] <= M) ps.add(P[i] + P[j]);
				}
			}
			int max = 0;
			for (int p : ps) max = Math.max(max, p);
			System.out.println(max);
		}
	}//end main
}