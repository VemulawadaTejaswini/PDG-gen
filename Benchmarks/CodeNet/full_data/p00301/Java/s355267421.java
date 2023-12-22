import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Symmetric Ternary Number
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int w = parseInt(line);
			int p = (int) (Math.log(w) / Math.log(3)) + 1;

			int[] base3 = new int[p + 1];

			for (int i = 0; i < base3.length - 1; i++) {
				base3[i] += w % 3;
				if (base3[i] == 2) {
					base3[i] = -1;
					base3[i + 1]++;
				} else if (base3[i] == 3) {
					base3[i] = 0;
					base3[i + 1]++;
				}
				w /= 3;
			}

			StringBuilder sb = new StringBuilder();
			int i;

			if (base3[p] == 0) {
				i = p - 1;
			} else {
				i = p;
			}
			for (; i >= 0; i--) {
				if (base3[i] == -1) {
					sb.append('-');
				} else if (base3[i] == 1) {
					sb.append('+');
				} else {
					sb.append('0');
				}
			}
			System.out.println(sb.toString());

		} // end while
	} // end main
}