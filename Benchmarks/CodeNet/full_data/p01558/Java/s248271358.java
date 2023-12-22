import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

import static java.lang.Integer.parseInt;

/**
 * Substring
 */
public class Main {

	static final long B =  37;
	static final long Binv = 1495681951922396077L;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

//		long st, et;
//		st = System.nanoTime();

		line = br.readLine();
		int n, m;
		n = parseInt(line.substring(0, line.indexOf(' ')));
		m = parseInt(line.substring(line.indexOf(' ') + 1));

		char[] s = br.readLine().toCharArray();
		int l = 0, r = 0;
		long hash = s[0];
		Set<Long> hashs = new HashSet<>();

		for (int i = 0; i < m; i++) {
			switch (br.readLine()) {
				case "L++":
					hash -= s[l] * power(B, r - l);
					l++;
					break;
				case "L--":
					l--;
					hash += s[l] * power(B, r - l);
					break;
				case "R++":
					r++;
					hash = hash * B + s[r];
					break;
				case "R--":
					hash = (hash - s[r]) * Binv;
					r--;
					break;
			}
			hashs.add(hash);
		}
		System.out.println(hashs.size());

//		et = System.nanoTime();
//		System.out.println((et - st) / 1000 / 1000);
	}

	static long power(long m, long n) {
		if (n == 0) return 1;
		if (n % 2 == 0) {
			return power(m * m, n / 2);
		} else {
			return power(m * m, n / 2) * m;
		}
	}
}