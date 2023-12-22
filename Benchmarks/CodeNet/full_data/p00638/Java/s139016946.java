import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Problem B: Old Bridges
 */
public class Main {

	public static int[] vs;
	public static int[] ws;
	public static int count = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == 0) break;

			vs = new int[n];
			ws = new int[n];
			count = 0;

			for (int i = 0; i < n; i++) {
				line = br.readLine();
				vs[i] = parseInt(line.substring(0, line.indexOf(' ')));
				ws[i] = parseInt(line.substring(line.indexOf(' ') + 1));
			}

			solve((1 << n) - 1, 0);
			System.out.println(count > 0 ? "Yes" : "No");

		}//end while
	}//end main

	public static void solve(int b, int s) {

		if (b == 0) {
			count++;
			return;
		}

		for (int i = 0; i < ws.length; i++) {
			if ((b & 1 << i) != 0) {
				if (s + vs[i] <= ws[i]) {
					solve(b ^ 1 << i, s + vs[i]);
				}
			}
		}
	}
}