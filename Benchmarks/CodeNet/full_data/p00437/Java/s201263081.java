import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Quality Checking
 */
public class Main {

	static final byte LEMON = 0;
	static final byte NORMAL = 1;
	static final byte UNKOWN = 2;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			StringTokenizer st = new StringTokenizer(line);
			int a, b, c, n;
			a = parseInt(st.nextToken());
			b = parseInt(st.nextToken());
			c = parseInt(st.nextToken());
			if ((a | b | c) == 0) {
				break;
			}
			n = parseInt(br.readLine());

			int[] parts = new int[a + b + c + 1];
			int[][] check = new int[n][4];

			for (int i = 0; i < parts.length; i++) {
				parts[i] = UNKOWN;
			}

			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				check[i][0] = parseInt(st.nextToken());
				check[i][1] = parseInt(st.nextToken());
				check[i][2] = parseInt(st.nextToken());
				check[i][3] = parseInt(st.nextToken());
				// 1st path
				if (check[i][3] == NORMAL) {
					parts[check[i][0]] = NORMAL;
					parts[check[i][1]] = NORMAL;
					parts[check[i][2]] = NORMAL;
				}
			}

			// 2nd path
			for (int i = 0; i < n; i++) {
				if (check[i][3] == LEMON) {
					if ((parts[check[i][0]] | parts[check[i][1]]) == NORMAL) {
						parts[check[i][2]] = LEMON;
					} else if ((parts[check[i][1]] | parts[check[i][2]]) == NORMAL) {
						parts[check[i][0]] = LEMON;
					} else if ((parts[check[i][2]] | parts[check[i][0]]) == NORMAL) {
						parts[check[i][1]] = LEMON;
					}
				}
			}

			for (int i = 1; i < parts.length; i++) {
				System.out.println(parts[i]);
			}
		}
	}
}