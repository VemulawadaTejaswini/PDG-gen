import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Spellcasters
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n, S;
			n = parseInt(line.substring(0, line.indexOf(' ')));
			S = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((n | S) == 0) break;

			int[] r = new int[101];

			for (int i = 0; i < n; i++) {
				r[parseInt(br.readLine())]++;
			}

			long count = 0;

			for (int i = 1; i <= 100; i++) {
				for (int j = 1; j <= 100; j++) {
					if (i < j && i + j > S) count += r[i] * r[j];
				}
			}

			System.out.println(count);
		}
	}
}