import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

/**
 * Chairs Where Demanding People Sit
 * PCK2009 ??????5
 */
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n, m;
			n = parseInt(line.substring(0, line.indexOf(' ')));
			m = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((n | m) == 0) break;
			//
			char[] chair = new char[n + 2];
			Arrays.fill(chair, '#');

			int sitting = 0;
			for (int i = 0; i < m; i++) {
				char c = br.readLine().charAt(0);
				switch (c) {
					case 'A':
						for (int j = 1; j <= n; j++) {
							if (chair[j] == '#') {
								chair[j] = c;
								break;
							}
						}
						sitting++;
						break;
					case 'B':
						boolean sit = false;
						for (int j = n; j >= 1; j--) {
							if (chair[j] == '#' && chair[j - 1] != 'A' && chair[j + 1] != 'A') {
								chair[j] = c;
								sit = true;
								break;
							}
						}
						if (!sit) {
							for (int j = 1; j <= n; j++) {
								if (chair[j] == '#') {
									chair[j] = c;
									break;
								}
							}
						}
						sitting++;
						break;
					case 'C':
						if (sitting == 0) {
							if (n % 2 == 1) {
								chair[(n + 1) / 2] = c;
							} else {
								chair[n / 2 + 1] = c;
							}
						} else {
							for (int j = 1; j <= n; j++) {
								if (chair[j] != '#') {
									if (j < n && chair[j + 1] == '#') {
										chair[j + 1] = c;
										break;
									} else if (1 < j && chair[j - 1] == '#') {
										chair[j - 1] = c;
										break;
									}
								}
							}
						}
						sitting++;
						break;
					case 'D':
						if (sitting == 0) {
							chair[1] = c;
						} else {
							int empty = 0, max = 0, sta = 0, end = 0;
							for (int j = 1; j <= n; j++) {
								if (chair[j] == '#') {
									empty++;
									if (empty > max) {
										max = empty;
										sta = j - empty;
										end = j;
									}
								} else {
									empty = 0;
								}
							}
							if (sta == 0) {
								chair[1] = c;
							} else if (end == n) {
								chair[n] = c;
							} else {
								chair[max / 2 + sta] = c;
							}
						}
						sitting++;
						break;
				}//end switch
			}
			System.out.println(new String(Arrays.copyOfRange(chair, 1, n + 1)));
		}
	}
}