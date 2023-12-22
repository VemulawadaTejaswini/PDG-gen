import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Aizu Chicken
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			if (line.equals("0")) break;
			words = line.split(" ");

			int q1, b, c1, c2, q2;
			q1 = parseInt(words[0]);
			b = parseInt(words[1]);
			c1 = parseInt(words[2]);
			c2 = parseInt(words[3]);
			q2 = parseInt(words[4]);

			int a1 = 0, a2 = 0;

			if (b / c1 >= q2) {
				a1 = q2;
				a2 = (b - c1 * q2) / c2;
			} else {
				a1 = b / c1;
				a2 = (b - c1 * a1) / c2;
			}

			if (a1 + a2 < q1) {
				if (c1 > c2) {
					while (a1 + a2 < q1) {
						a1--;
						a2 = (b - c1 * a1) / c2;
					}
				} else {
					while (a1 + a2 < q1) {
						a2--;
						a1 = (b - c1 * a2) / c1;
					}
				}
			}

			if (a1 > 0 && a1 + a2 >= q1) {
				System.out.println(a1 + " " + a2);
			} else {
				System.out.println("NA");
			}
		}
	}
}