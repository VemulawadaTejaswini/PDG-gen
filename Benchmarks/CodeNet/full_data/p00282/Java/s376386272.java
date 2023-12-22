import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Jinkoki
 * PCK2013 ??¬???3
 */
public class Main {

	// 18 units
	static final String[] UNIT = {
			"",
			"Man",
			"Oku",
			"Cho",
			"Kei",
			"Gai",
			"Jo",
			"Jou",
			"Ko",
			"Kan",
			"Sei",
			"Sai",
			"Gok",
			"Ggs",
			"Asg",
			"Nyt",
			"Fks",
			"Mts",
	};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int m, n;
			m = parseInt(line.substring(0, line.indexOf(' ')));
			n = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((m | n) == 0) break;

			int[] num = new int[18];

			//m^1
			num[0] = m;

			//m^2 -> m^n
			for (int i = 0; i < n - 1; i++) {
				for (int j = 0; j < num.length; j++) num[j] *= m;
				for (int j = 0; j < num.length; j++) {
					if (num[j] >= 10000) {
						num[j + 1] += num[j] / 10000;
						num[j] %= 10000;
					}
				}
			}

			StringBuilder sb = new StringBuilder();
			for (int i = num.length - 1; i >= 0; i--) {
				if (num[i] > 0) sb.append(num[i]).append(UNIT[i]);
			}
			System.out.println(sb.toString());

		}//end while
	}//end main
}