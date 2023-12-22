import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * Calling Extraterrestrial Intelligence Again
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		boolean[] _primes = primes(50_000);
		List<Integer> primes = new ArrayList<>();

		for (int i = 0; i < _primes.length; i++) {
			if (_primes[i]) primes.add(i);
		}

		int[][] multis = new int[100_001][2];

		for (int p1 : primes) {
			for (int p2 : primes) {
				if (p1 <= p2) {
					long multi = p1 * p2;
					if (0 <= multi && multi < 100_001) {
						multis[(int) multi][0] = p1;
						multis[(int) multi][1] = p2;
					}
				}
			}
		}

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			words = line.split(" ");

			int m, a, b;
			m = parseInt(words[0]);
			a = parseInt(words[1]);
			b = parseInt(words[2]);
			if ((m | a | b) == 0) break;

			for (int i = m; i >= 4; i--) {
				if (multis[i][0] != 0) {
					int p = multis[i][0];
					int q = multis[i][1];
					if (a * q <= p * b) {
						System.out.println(p + " " + q);
						break;
					}
				}
			}

		} //end while
	} //end main

	static boolean[] primes(int limit) {

		boolean[] ps = new boolean[limit + 1];
		int _limit = (int) Math.sqrt(ps.length) + 1;

		//2..
		Arrays.fill(ps, 2, ps.length, true);

		for (int i = 2; i <= _limit; i++) {
			if (ps[i]) {
				for (int j = i * 2; j < ps.length; j += i) {
					if (ps[j]) ps[j] = false;
				}
			}
		}
		return ps;
	}
}