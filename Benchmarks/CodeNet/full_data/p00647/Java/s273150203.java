import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Problem A: It's our delight!!
 */
public class Main {

	static final int Lmin = 660;
	static final int Lmax = 900;
	static final int Dmin = 1080;
	static final int Dmax = 1260;
	static final int Mmin = 1260;
	static final int Mmax = 120;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == 0) break;

			int L, D, M, Lsum, Dsum, Msum;
			L = D = M = 0;
			Lsum = Dsum = Msum = 0;

			for (int i = 0; i < n; i++) {
				words = br.readLine().split("[: ]");

				int s = parseInt(words[0]) * 60 + parseInt(words[1]);
				int t = parseInt(words[0]) * 60 + parseInt(words[2]);
				if (t < s) t += 60;

				if (Lmin <= s && s < Lmax) {
					Lsum++;
					if (s + 8 >= t) L++;
				} else if (Dmin <= s && s < Dmax) {
					Dsum++;
					if (s + 8 <= t) D++;
				} else if (Mmin <= s && s < Mmax) {
					Msum++;
					if (s + 8 <= t) M++;
				}
			}

			System.out.println("lunch " + (L == 0 ? "no guest" : L * 100 / Lsum));
			System.out.println("dinner " + (D == 0 ? "no guest" : D * 100 / Dsum));
			System.out.println("midnight " + (M == 0 ? "no guest" : M * 100 / Msum));

		}
	}
}