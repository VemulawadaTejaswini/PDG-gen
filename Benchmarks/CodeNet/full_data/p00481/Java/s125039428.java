import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Cheese
 * JOI 10th, Pre.5
 */
public class Main {

	static final int[][] HV = {
			{1, 0},
			{-1, 0},
			{0, 1},
			{0, -1},
	};

	static char[][] map;
	static int H, W, N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		StringTokenizer st = new StringTokenizer(br.readLine());

		H = parseInt(st.nextToken());
		W = parseInt(st.nextToken());
		N = parseInt(st.nextToken());

		map = new char[H + 2][W + 2];
		for (int i = 0; i < map.length; i++) {
			Arrays.fill(map[i], 'X');
		}

		//start pos
		int sy = 0, sx = 0;

		for (int i = 0; i < H; i++) {
			line = br.readLine();
			for (int j = 0; j < W; j++) {
				map[i + 1][j + 1] = line.charAt(j);
				if (map[i + 1][j + 1] == 'S') {
					sy = i + 1;
					sx = j + 1;
				}
			}
		}

		System.out.println(solve(sy, sx, 1));

	}

	static int solve(int y, int x, int target) {

		if (target > N) return 0;

		int res = 0;
		int sy = 0, sx = 0;

		char[][] _map = new char[map.length][];
		for (int i = 0; i < map.length; i++) {
			_map[i] = Arrays.copyOf(map[i], map[i].length);
		}
		Queue<int[]> q = new ArrayDeque<>();
		q.offer(new int[]{y, x, 0});
		_map[y][x] = 'X';

		outer:
		while (!q.isEmpty()) {
			int cy, cx, cd;
			cy = q.peek()[0];
			cx = q.peek()[1];
			cd = q.peek()[2];
			q.poll();

			for (int i = 0; i < HV.length; i++) {
				int ny, nx;
				ny = cy + HV[i][0];
				nx = cx + HV[i][1];
				if (_map[ny][nx] != 'X') {
					if (_map[ny][nx] - '0' == target) {
						sy = ny;
						sx = nx;
						res = cd + 1;
						break outer;
					} else {
						q.offer(new int[]{ny, nx, cd + 1});
						_map[ny][nx] = 'X';
					}
				}
			}
		}
		return res + solve(sy, sx, target + 1);
	}
}