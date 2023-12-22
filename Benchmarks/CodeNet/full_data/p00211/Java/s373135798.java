import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Jogging
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == 0) break;

			long[] d = new long[n];
			long[] v = new long[n];

			for (int i = 0; i < n; i++) {
				line = br.readLine();
				d[i] = parseInt(line.substring(0, line.indexOf(' ')));
				v[i] = parseInt(line.substring(line.indexOf(' ') + 1));
			}

			//?´????
			for (int i = 0; i < n; i++) {
				long gcd = gcd(d[i], v[i]);
				d[i] /= gcd;
				v[i] /= gcd;
			}

			//??????
			long lcm = lcm(d[0], d[1]);
			for (int i = 2; i < n; i++) {
				lcm = lcm(lcm, d[i]);
			}

			for (int i = 0; i < n; i++) {
				v[i] *= lcm / d[i];
			}

			//
			long gcd = gcd(v[0], v[1]);
			for (int i = 2; i < n; i++) {
				gcd = gcd(gcd, v[i]);
			}

			for (int i = 0; i < n; i++) {
				System.out.println(v[i] / gcd);
			}
		}
	}

	static long gcd(long a, long b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}

	static long lcm(long a, long b) {
		return a * (b / gcd(a, b));
	}
}