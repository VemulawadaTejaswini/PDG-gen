/**
 * Princess's Gamble
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			StringTokenizer st = new StringTokenizer(line);
			int n, m, p;
			n = parseInt(st.nextToken());
			m = parseInt(st.nextToken());
			p = parseInt(st.nextToken());
			if ((n | m | p) == 0) break;

			int[] bets = new int[n];
			int total = 0;
			for (int i = 0; i < n; i++) {
				bets[i] += parseInt(br.readLine());
				total += bets[i];
			}

			if (bets[m - 1] == 0) {
				System.out.println("0");
			} else {
				double dividend;
				dividend = total * 100;
				dividend *= (double) (100 - p) / 100;
				dividend /= (double) bets[m - 1];
				System.out.println((int) dividend);
			}
		} //end while
	} //end main
}