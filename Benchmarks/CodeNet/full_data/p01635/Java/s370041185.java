import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Time Complexity
 */
public class Main {

	final static int sec = 1000_000_000;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int n, T;
		line = br.readLine();
		n = parseInt(line.substring(0, line.indexOf(' ')));
		T = parseInt(line.substring(line.indexOf(' ') + 1));

		boolean tle = false;
		long sum = 0;

		line = br.readLine();

		outer:
		for (char c : line.toCharArray()) {
			if ('0' <= c && c <= '9') {
				int k = c - '0';
				long _sum;
				if (k == 0) {
					_sum = 1;
				} else {
					_sum = n;
					for (int i = 0; i < k - 1; i++) {
						_sum *= n;
						if (_sum > sec) {
							tle = true;
							break outer;
						}
					}
				}
				sum += _sum;
				if (sum > sec) {
					tle = true;
					break outer;
				}
			}
		}

		sum *= T;
		if (sum > sec) {
			tle = true;
		}

		System.out.println(tle ? "TLE" : sum);

	}
}