import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.lang.Byte.parseByte;

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

			byte[][] amida = new byte[n + 1][m + 1];

			for (int i = 0; i < m; i++) {
				st = new StringTokenizer(br.readLine());
				int h = parseInt(st.nextToken());
				byte p = parseByte(st.nextToken());
				byte q = parseByte(st.nextToken());
				amida[p][h] = q;
				amida[q][h] = p;
			}

			int b = a;
			for (int i = m; i >=  1; i--) {
				if (amida[b][i] > 0) b = amida[b][i];
			}
			System.out.println(b);
		}
	}

}