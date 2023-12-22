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

			int[] base3 = new int[p];
			int[] base3s = new int[p + 1];

			for (int i = 0; i < base3.length; i++) {
				base3[i] += w % 3;
				w = (w - base3[i]) / 3;
			}

			for (int i = 0; i < base3.length; i++) {
				base3s[i] += base3[i];
				if (base3s[i] == 2) {
					base3s[i] = -1;
					base3s[i + 1] = 1;
				} else if (base3s[i] == 3) {
					base3s[i] = 0;
					base3s[i + 1] = 1;
				}
			}

			StringBuilder sb = new StringBuilder();
			int i;
			
			if (base3s[base3s.length - 1] == 0) {
				i = base3s.length - 2;
			} else {
				i = base3s.length - 1;
			}
			for (; i >= 0; i--) {
				if (base3s[i] == -1) {
					sb.append('-');
				} else if (base3s[i] == 1) {
					sb.append('+');
				} else {
					sb.append('0');
				}
			}
			System.out.println(sb.toString());

		} // end while
	} // end main
}