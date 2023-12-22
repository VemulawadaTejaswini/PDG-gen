import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Unit Fraction Partition
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			if (line.equals("0 0 0 0")) break;
			words = line.split(" ");

			int p, q, a, n;
			p = parseInt(words[0]);
			q = parseInt(words[1]);
			a = parseInt(words[2]);
			n = parseInt(words[3]);

			p *= (a / q);
			q *= (a / q);

			List<Integer> factors = new ArrayList<>();
			{
				List<Integer> __factors = primeFactor(q);
				int[] _factors = new int[__factors.size() + 1];

				_factors[0] = 1;
				for (int i = 1; i < _factors.length; i++) {
					_factors[i] = _factors[i - 1] * __factors.get(i - 1);
				}
				for (int i = 0; i < _factors.length - 1; i++) {
					for (int j = i + 1; j < _factors.length; j++) {
						int f = _factors[j] / _factors[i];
						if (!factors.contains(f)) {
							factors.add(f);
						}
					}
				}
				Collections.sort(factors);
			}

			int[][] dp = new int[n + 1][p + 1];

			dp[0][0] = 1;
			for (int i = factors.size() - 1; i >= 0; i--) {
				for (int j = 0; j < n; j++) {
					for (int k = p; k >= 0; k--) {
						if (k - factors.get(i) >= 0)
							dp[j + 1][k] += dp[j][k - factors.get(i)];
					}
				}
			}

			int ans = 0;
			for (int i = 1; i <= n; i++) {
				ans += dp[i][p];
			}
			System.out.println(ans);
		}
	}

	static List<Integer> primeFactor(int n) {
		List<Integer> fs = new ArrayList<>();
		int p = 2;
		for (int i = p; i <= n; i++) {
			while (n % i == 0) {
				fs.add(i);
				n /= i;
			}
		}
		return fs;
	}
}