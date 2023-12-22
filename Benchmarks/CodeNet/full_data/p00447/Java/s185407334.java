import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Searching Constellation
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == 0) break;

			List<int[]> S = new ArrayList<>();

			for (int i = 0; i < n; i++) {
				line = br.readLine();
				int x, y;
				x = parseInt(line.substring(0, line.indexOf(' ')));
				y = parseInt(line.substring(line.indexOf(' ') + 1));
				S.add(new int[]{x, y});
			}

			int m = parseInt(br.readLine());
			Map<Integer, Set<Integer>> T = new HashMap<>();

			for (int i = 0; i < m; i++) {
				line = br.readLine();
				int x, y;
				x = parseInt(line.substring(0, line.indexOf(' ')));
				y = parseInt(line.substring(line.indexOf(' ') + 1));
				T.putIfAbsent(x, new HashSet<>());
				T.get(x).add(y);
			}

			//solve
			int dx, dy;
			dx = dy = -1;

			outer:
			for (int tx : T.keySet()) {
				for (int ty : T.get(tx)) {
					dx = tx - S.get(0)[0];
					dy = ty - S.get(0)[1];
					for (int i = 1; i < S.size(); i++) {
						int nx, ny;
						nx = S.get(i)[0] + dx;
						ny = S.get(i)[1] + dy;
						if (!T.containsKey(nx) || !T.get(nx).contains(ny)) {
							continue outer;
						}
					}
					break outer;
				}
			}

			System.out.println(dx + " " + dy);

		}
	}
}