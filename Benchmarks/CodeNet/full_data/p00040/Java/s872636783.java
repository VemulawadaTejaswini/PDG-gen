import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Affine Cipher
 */
public class Main {

	static final char[][] hint = {{'t', 'h', 'i', 's'}, {'t', 'h', 'a', 't'}};

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			int[] c = cipher(s);
			char[] d = new char['z' + 1];
			for (int j = 0; j < 26; j++) {
				d[(char) (((c[0] * j + c[1]) % 26) + 'a')] = (char) (j + 'a');
			}
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == ' ') {
					sb.append(' ');
				} else {
					sb.append(d[s.charAt(j)]);
				}
			}
			System.out.println(sb.toString());
		}
	}

	static int[] cipher(String s) {

		int[] ret = new int[2];

		StringTokenizer st = new StringTokenizer(s);

		while (st.hasMoreTokens()) {

			String w = st.nextToken();

			if (w.length() == 4) {
				for (int a = 0; a < 26; a++) {
					if (a % 2 != 0 && a % 13 != 0) {
						for (int b = 0; b < 26; b++) {
							String h1 = "";
							String h2 = "";
							for (int i = 0; i < hint[0].length; i++) {
								h1 += (char) (((a * (hint[0][i] - 'a') + b) % 26) + 'a');
								h2 += (char) (((a * (hint[1][i] - 'a') + b) % 26) + 'a');
							}
							if (w.equals(h1) || w.equals(h2)) {
								ret[0] = a;
								ret[1] = b;
								return ret;
							}
						}
					}
				}
			}
		}

		return ret;
	}
}