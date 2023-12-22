import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Quality Checking
 */
public class Main {

	static final byte LEMON = 0;
	static final byte NORMAL = 1;
	static final byte UNKOWN = 2;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			StringTokenizer st = new StringTokenizer(line);
			int a, b, c, N;
			a = parseInt(st.nextToken());
			b = parseInt(st.nextToken());
			c = parseInt(st.nextToken());
			if ((a | b | c) == 0) {
				break;
			}
			N = parseInt(br.readLine());

			int[] parts = new int[a + b + c + 1];
			int[][] check = new int[N][4];

			Arrays.fill(parts, UNKOWN);

			for (int i = 0; i < N; i++) {
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
			while (true) {
				int correct = 0;
				for (int i = 0; i < N; i++) {
					//
					if (check[i][3] == LEMON) {
						if (parts[check[i][0]] == NORMAL && parts[check[i][1]] == NORMAL) {
							if (parts[check[i][2]] != LEMON) {
								parts[check[i][2]] = LEMON;
								correct++;
							}
						} else if (parts[check[i][1]] == NORMAL && parts[check[i][2]] == NORMAL) {
							if (parts[check[i][0]] != LEMON) {
								parts[check[i][0]] = LEMON;
								correct++;
							}
						} else if (parts[check[i][2]] == NORMAL && parts[check[i][0]] == NORMAL) {
							if (parts[check[i][1]] != LEMON) {
								parts[check[i][1]] = LEMON;
								correct++;
							}
						}
					}
				}
				if (correct == 0) {
					break;
				}
			}

			for (int i = 1; i < parts.length; i++) System.out.println(parts[i]);
		}
	}
}