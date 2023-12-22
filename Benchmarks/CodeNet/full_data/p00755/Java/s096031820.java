import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Identically Colored Panels Connection
 */
public class Main {

	enum COLOR {
		NONE, YELLOW, PINK, RED, PURPLE, GREEN, BLUE,
	}

	static int[][] DIR = {
			{1, 0},
			{0, 1},
			{-1, 0},
			{0, -1},
	};

	static COLOR tc;
	static int max = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			StringTokenizer st;

			st = new StringTokenizer(line);

			int h, w;
			h = parseInt(st.nextToken());
			w = parseInt(st.nextToken());
			tc = COLOR.values()[parseInt(st.nextToken())];
			if ((h | w) == 0) break;

			COLOR[][] pane = new COLOR[h + 2][w + 2];

			for (COLOR[] pp : pane) {
				Arrays.fill(pp, COLOR.NONE);
			}

			for (int i = 0; i < h; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < w; j++) {
					pane[i + 1][j + 1] = COLOR.values()[st.nextToken().charAt(0) - '0'];
				}
			}

			//
			max = 0;

			solve(pane, 5);

			System.out.println(max);
		}
	}

	public static void solve(COLOR[][] pane, int r) {

		if (r == 0) {
			if (pane[1][1] == tc) {
				int count = 0;
				for (int i = 0; i < pane.length; i++) {
					for (int j = 0; j < pane[i].length; j++) {
						if (pane[i][j] == tc) {
							boolean conn = false;
							for (int[] dir : DIR) {
								int ny, nx;
								ny = i + dir[0];
								nx = j + dir[1];
								if (pane[ny][nx] == tc) conn |= true;
							}
							if (conn) count++;
						}
					}
				}
				if (count == 0) count = 1;
				max = Math.max(max, count);
			}
			return;
		}

		COLOR pc = pane[1][1];

		for (COLOR nc : COLOR.values()) {
			if (nc != COLOR.NONE && nc != pc) {
				COLOR[][] _pane = new COLOR[pane.length][];
				for (int i = 0; i < pane.length; i++) {
					_pane[i] = Arrays.copyOf(pane[i], pane[i].length);
				}
				_pane[1][1] = nc;
				//
				Deque<int[]> queue = new ArrayDeque<>();
				queue.offer(new int[]{1, 1});
				while (!queue.isEmpty()) {
					int[] q = queue.poll();
					for (int[] dir : DIR) {
						int ny, nx;
						ny = q[0] + dir[0];
						nx = q[1] + dir[1];
						if (_pane[ny][nx] == pc) {
							_pane[ny][nx] = nc;
							queue.offer(new int[]{ny, nx});
						}
					}
				}
				solve(_pane, r - 1);
			}
		}
	}
}