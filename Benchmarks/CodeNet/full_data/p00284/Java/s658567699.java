import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Infinite Express
 * PCK2013 ??¬???5
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int N = parseInt(line);

			for (int i = 0; i < N; i++) {
				line = br.readLine();
				int s, d, min;
				s = parseInt(line.substring(0, line.indexOf(' ')));
				d = parseInt(line.substring(line.indexOf(' ') + 1));
				if (d < 0) {
					int tmp = Math.abs(d);
					d = Math.abs(s);
					s = tmp;
				}
				if (s <= 0 && 0 <= d) {
					min = solve(s) + solve(d);
				} else {
					min = d - s;
					for (int j = 0; ; j++) {
						int mid = (int) Math.pow(2, j);
						if (mid > d) break;
						if (mid >= s) {
							min = Math.min(min, solve(mid - s) + solve(d - mid));
						}
					}
				}
				System.out.println(min);
			}


		}//end while
	}//end main

	static int solve(int n) {

		n = Math.abs(n);

		if (n == 0) return 0;
		if (n == 1) return 1;

		int t = 0;

		if (n % 2 != 0) {
			n--;
			t++;
		}

		return t + solve(n / 2);
	}
}