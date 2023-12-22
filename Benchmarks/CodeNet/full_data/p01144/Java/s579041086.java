import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

import static java.lang.Integer.parseInt;

/**
 * Princess's Marriage - Accepted
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int N, M;
			N = parseInt(line.substring(0, line.indexOf(' ')));
			M = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((N | M) == 0) break;

			int[] ps = new int[11];

			for (int i = 0; i < N; i++) {
				line = br.readLine();
				int D, P;
				D = parseInt(line.substring(0, line.indexOf(' ')));
				P = parseInt(line.substring(line.indexOf(' ') + 1));
				ps[P] += D;
			}

			for (int i = ps.length - 1; i >= 0; i--) {
				if (ps[i] > 0) {
					if (ps[i] <= M) {
						M -= ps[i];
						ps[i] = 0;
					} else {
						ps[i] -= M;
						M = 0;
					}
				}
			}

			int expected = 0;
			for (int i = 0; i < ps.length; i++) {
				if (ps[i] > 0) expected += i * ps[i];
			}
			System.out.println(expected);

		} //end while
	} //end main
}