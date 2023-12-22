/**
 * Millennium
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Main {

	static final int millennium = days(1000, 1, 1);

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = Integer.parseInt(line);

			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int y, m, d;
				y = parseInt(st.nextToken());
				m = parseInt(st.nextToken());
				d = parseInt(st.nextToken());
				System.out.println(millennium - days(y, m, d));
			}
		} //end while
	} //end main

	static int days(int y, int m, int d) {
		int days = 0;
		days += (y - 1) * 195;
		days += ((y - 1) / 3) * 5;
		for (int i = 0; i < m - 1; i++) {
			if (i % 2 == 0 || y % 3 == 0) {
				days += 20;
			} else {
				days += 19;
			}
		}
		days += d;
		return days;
	}
}