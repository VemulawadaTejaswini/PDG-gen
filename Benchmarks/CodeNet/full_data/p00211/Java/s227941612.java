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

			long[] ds = new long[n];
			long[] vs = new long[n];
			for (int i = 0; i < n; i++) {
				line = br.readLine();
				ds[i] = parseInt (line.substring(0, line.indexOf(' ')));
				vs[i] = parseInt(line.substring(line.indexOf(' ') + 1));
			}

			//solve
			long lcm1 = 1;
			for (int i = 0; i < n; i++) lcm1 = lcm(lcm1, vs[i]);
			for (int i = 0; i < n; i++) ds[i] *= lcm1 / vs[i];

			//
			long lcm2 = 1;
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n; i++) lcm2 = lcm(lcm2, ds[i]);
			for (int i = 0; i < n; i++) sb.append(lcm2 / ds[i]).append('\n');
			System.out.print(sb.toString());
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