import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

import static java.lang.Integer.parseInt;

/**
 * Deven-Eleven
 */
public class Main {

	final static int UNK = -1;
	final static int INF = 1 << 29;
	final static int[][] HV = {
			{0, -1},
			{1, -1},
			{1, 0},
			{1, 1},
			{0, 1},
			{-1, 0},
	};
	final static int DEVEN = 11;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int m, n, s;
			m = parseInt(line.substring(0, line.indexOf(' ')));
			n = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((m | n) == 0) break;
			s = parseInt(br.readLine());

			int[][][] map = new int[m + 2][n + 2][2];
			for (int i = 0; i < m + 2; i++) {
				for (int j = 0; j < n + 2; j++) {
					map[i][j][0] = UNK;
					if (i == 0 || i == m + 1
							|| j == 0 || j == n + 1) {
						map[i][j][1] = -1;
					} else {
						map[i][j][1] = INF;
					}
				}
			}

			Deque<int[]> queue1 = new ArrayDeque<>();

			for (int i = 0; i < s; ++i) {
				line = br.readLine();
				int x, y;
				x = parseInt(line.substring(0, line.indexOf(' ')));
				y = parseInt(line.substring(line.indexOf(' ') + 1));
				map[x][y][0] = i;
				map[x][y][1] = 0;
				queue1.offer(new int[]{x, y, i, 0});
			}

			while (!queue1.isEmpty()) {
				int[] _s = queue1.poll();
				for (int i = 0; i < HV.length; i++) {
					int nx, ny;
					nx = _s[0] + HV[i][0];
					ny = _s[1] + HV[i][1];
					if (map[nx][ny][0] != _s[2]) {
						if (map[nx][ny][1] > _s[3] + 1) {
							map[nx][ny][0] = _s[2];
							map[nx][ny][1] = _s[3] + 1;
							queue1.offer(new int[]{nx, ny, _s[2], _s[3] + 1});
						} else if (map[nx][ny][1] == _s[3] + 1) {
							map[nx][ny][0] = UNK;
							map[nx][ny][1] = _s[3] + 1;
						}
					}
				}
			}

			//solve
			int t = parseInt(br.readLine());
			int max = 0;
			for (int i = 0; i < t; i++) {
				line = br.readLine();
				int x, y;
				x = parseInt(line.substring(0, line.indexOf(' ')));
				y = parseInt(line.substring(line.indexOf(' ') + 1));
				int count = 0;
				int[][][] _map = map.clone();
				Deque<int[]> queue2 = new ArrayDeque<>();
				queue2.offer(new int[]{x, y, DEVEN, 0});
				while (!queue2.isEmpty()) {
					int[] d = queue2.poll();
					for (int j = 0; j < HV.length; j++) {
						int nx, ny;
						nx = d[0] + HV[j][0];
						ny = d[1] + HV[j][1];
						if (_map[nx][ny][0] != DEVEN) {
							if (_map[nx][ny][1] > d[3] + 1) {
								_map[nx][ny][0] = DEVEN;
								_map[nx][ny][1] = d[3] + 1;
								queue2.offer(new int[]{nx, ny, DEVEN, d[3] + 1});
								count++;
							} else if (_map[nx][ny][1] == d[3] + 1) {
								_map[nx][ny][0] = UNK;
								_map[nx][ny][1] = d[3] + 1;
							}
						}
					}
				}
				max = Math.max(max, count);
			}
			System.out.println(max);
		}
	}
}