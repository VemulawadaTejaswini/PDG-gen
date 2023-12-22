import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Rhythm Machine
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String words;

		int D = parseInt(br.readLine());

		for (int i = 0; i < D; i++) {

			List<int[]> rhythms = new ArrayList<>();

			int N = parseInt(br.readLine());
			for (int j = 0; j < N; j++) {
				rhythms.add(reduce(decode(br.readLine())));
			}

			long lcm = 1;
			for (int[] r : rhythms) {
				lcm = lcm(lcm, r.length);
			}

			if (lcm < 0 || 1024 < lcm) {
				System.out.println("Too complex.");
				continue;
			}

			int[] chord = new int[(int) lcm];
			for (int[] r : rhythms) {
				int div = (int) lcm / r.length;
				for (int j = 0, k = 0; j < r.length; j++, k += div) {
					chord[k] |= r[j];
				}
			}

			chord = reduce(chord);

			if (chord.length <= 1024) {
				System.out.println(encode(chord));
			} else {
				System.out.println("Too complex.");
			}

		}
	}

	private static int[] decode(String rhythm) {
		int[] ret = new int[rhythm.length() / 2];
		for (int i = 0; i < rhythm.length(); i += 2) {
			String _r = rhythm.substring(i, i + 2);
			ret[i / 2] = Integer.valueOf(_r, 16);
		}
		return ret;
	}

	private static String encode(int[] chord) {
		StringBuilder sb = new StringBuilder();
		for (int i : chord) {
			sb.append(String.format("%02X", i));
		}
		return sb.toString();
	}

	private static int[] reduce(int[] chord) {

		List<Integer> divs = divisors(chord.length);
		Collections.sort(divs, Comparator.reverseOrder());

		int[] ret = null;

		outer:
		for (int div : divs) {
			ret = new int[chord.length / div];
			int zero = 0;
			int same = 0;
			for (int i = 0; i < chord.length; i++) {
				if (i % div == 0) {
					ret[i / div] = chord[i];
					same = chord[i];
				} else {
					zero += chord[i];
				}
			}
			if (zero == 0) {
				break outer;
			}
		}

		return ret;
	}

	private static long gcd(long a, long b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}

	private static long lcm(long a, long b) {
		return a * (b / gcd(a, b));
	}

	private static List<Integer> divisors(int n) {
		List<Integer> ret = new ArrayList<>();
		if (n == 0) {
			ret.add(1);
			return ret;
		}
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				if (i * i != n) ret.add(n / i);
				ret.add(i);
			}
		}
		Collections.sort(ret);
		return ret;
	}
}