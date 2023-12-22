import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Lightest Mobile
 */
public class Main {

	static int[][] bars;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == 0) break;

			bars = new int[n + 1][4];
			int top = n * (n + 1) / 2;

			for (int i = 1; i <= n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 4; j++) {
					bars[i][j] = parseInt(st.nextToken());
				}
				top -= bars[i][2];
				top -= bars[i][3];
			}

			System.out.println(solve(bars[top]));

		}
	}

	static long solve(int[] bar) {

		int p, q, r, b;
		p = bar[0];
		q = bar[1];
		r = bar[2];
		b = bar[3];

		long lcm, _r, _b;

		if (r == 0 && b == 0) {
			return (p + q) / gcd(p, q);
		} else if (r != 0) {
			lcm = lcm(p, lcm(p, solve(bars[r])));
		} else {
			lcm = lcm(p, lcm(p, solve(bars[b])));
		}

		_r = (lcm / p + q) * q;
		_b = (lcm / p + q) * p;

		return _r + _b;
	}

	static long gcd(long a, long b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}

	static long lcm(long a, long b) {
		return a * (b / gcd(a, b));
	}
}