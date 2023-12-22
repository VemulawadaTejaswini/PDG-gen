/**
 * Heian-Kyo Walking
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Main {

	static final int PX = -1; //non-passing in x-axis
	static final int PY = -2; //non-passing in y-axis

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		int n = parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			line = br.readLine();
			int gx = parseInt(line.substring(0, line.indexOf(' ')));
			int gy = parseInt(line.substring(line.indexOf(' ') + 1));
			int[][] routes = new int[gx + 1][gy + 1];

			//
			int p = parseInt(br.readLine());
			for (int j = 0; j < p; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int x1 = parseInt(st.nextToken());
				int y1 = parseInt(st.nextToken());
				int x2 = parseInt(st.nextToken());
				int y2 = parseInt(st.nextToken());
				int px, py;
				if (x1 != x2) {
					px = Math.max(x1, x2);
					py = y1;
					routes[px][py] += PX;
				} else {
					px = x1;
					py = Math.max(y1, y2);
					routes[px][py] += PY;
				}
			}
			for (int j = 1; j <= gx; j++) {
				if (routes[j][0] != PX) {
					routes[j][0] = 1;
				} else {
					for (int k = j; k <=gx ; k++) {
						routes[k][0] = 0;
					}
					break;
				}
			}
			for (int j = 1; j <= gy; j++) {
				if (routes[0][j] != PY) {
					routes[0][j] = 1;
				} else {
					for (int k = j; k <=gy ; k++) {
						routes[0][k] = 0;
					}
					break;
				}
			}

			// solve
			for (int j = 1; j <= gx; j++) {
				for (int k = 1; k <= gy; k++) {
					if (routes[j][k] == 0) {
						routes[j][k] = routes[j][k - 1] + routes[j - 1][k];
					} else {
						if (routes[j][k] == PX) routes[j][k] = routes[j][k - 1];
						else if (routes[j][k] == PY) routes[j][k] = routes[j - 1][k];
						else routes[j][k] = 0;
					}
				}
			}
			System.out.println(routes[gx][gy] > 0 ? routes[gx][gy] : "Miserable Hokusai!");
		}
	}
} //end main