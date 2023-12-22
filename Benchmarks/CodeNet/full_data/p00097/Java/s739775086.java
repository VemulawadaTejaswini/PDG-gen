import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Sum of Integers II
 */
public class Main {

	static int count;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n, s;
			n = parseInt(line.substring(0, line.indexOf(' ')));
			s = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((n | s) == 0) break;

			count = 0;

			solve(0, n, s);

			System.out.println(count);

		} // end while
	} // end main

	static void solve(int p, int n, int s) {
		if (n == 0 && s == 0) {
			count++;
			return;
		} else if (s >= p && n > 0) {
			solve(p + 1, n - 1, s - p);
			solve(p + 1, n, s);
		}
	}
}