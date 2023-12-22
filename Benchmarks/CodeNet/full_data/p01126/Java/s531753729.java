import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Amida, the City of Miracle
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			StringTokenizer st = new StringTokenizer(line);
			int n = parseInt(st.nextToken()); // ???????????¬??°
			int m = parseInt(st.nextToken()); // ?¨?????????¬??°
			int a = parseInt(st.nextToken()); // ????????????????????????

			if ((n | m | a) == 0) break;

			int[][] amida = new int[n + 1][m + 1];

			for (int i = 0; i < m; i++) {
				st = new StringTokenizer(br.readLine());
				int h = parseInt(st.nextToken());
				int p = parseInt(st.nextToken());
				int q = parseInt(st.nextToken());
				amida[p][h] = q;
				amida[q][h] = p;
			}

			int b = a;
			for (int i = m; i >= 1; i--) {
				if (amida[b][i] > 0) b = amida[b][i];
			}
			System.out.println(b);
		} // end while
	} // end main
}