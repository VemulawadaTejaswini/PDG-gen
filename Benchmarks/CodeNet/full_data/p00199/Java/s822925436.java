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

			for (int i = 0; i < m; i++) {
				char c = br.readLine().charAt(0);
				boolean sit;
				switch (c) {
					case 'A':
						for (int j = 1; j <= n; j++) {
							if (chair[j] == '#') {
								chair[j] = c;
								break;
							}
						}
						break;
					case 'B':
						sit = false;
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
						break;
					case 'C':
						sit = false;
						for (int j = 1; j <= n; j++) {
							if (chair[j] != '#') {
								if (chair[j + 1] == '#' && j < n) {
									chair[j + 1] = c;
									sit = true;
									break;
								} else if (chair[j - 1] == '#' && j >= 1) {
									chair[j - 1] = c;
									sit = true;
									break;
								}
							}
						}
						if (!sit) {
							if (n % 2 == 1) {
								chair[(n + 1) / 2] = c;
							} else {
								chair[n / 2 + 1] = c;
							}
						}
						break;
					case 'D':
						int _pos = 0, _len = 0, pos = 0, len = 0;
						for (int j = 1; j <= n; j++) {
							if (chair[j] == '#') {
								if (_pos == 0) _pos = j;
								_len++;
								if (_len > len) {
									pos = _pos;
									len = _len;
								}
							} else {
								_pos = 0;
								_len = 0;
							}
						}
						if (pos == 1) {
							chair[1] = c;
						} else if (pos + len - 1 == n) {
							chair[n] = c;
						} else {
							if (len % 2 == 1) {
								chair[len / 2 + pos] = c;
							} else {
								chair[len / 2 + pos - 1] = c;
							}
						}
						break;
				}
			}
			System.out.println(new String(Arrays.copyOfRange(chair, 1, n + 1)));
		}
	}
}