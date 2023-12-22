import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int x, y;
			x = parseInt(line.substring(0, line.indexOf(' ')));
			y = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((x | y) == 0) break;

			int t, step = 0, gcd;
			while (true) {
				x %= y;
				t = y;
				y = x;
				x = t;
				step++;
				if (y == 0) {
					gcd = x;
					break;
				}
			}
			System.out.println(gcd + " " + step);
		}
	}
}