
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		loop: while (true) {
			w = scanner.nextInt();
			h = scanner.nextInt();
			if ((w | h) == 0)
				break;
			count = 0;
			sy = -1;
			map = new boolean[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					int now = scanner.nextInt();
					if (now == 0) {
						count++;
						if (sy == -1) {
							sy = i;
							sx = j;
						}
					} else {
						map[i][j] = true;
					}
				}
			}
			if (count % 2 == 1 || count == 0) {
				System.out.println("No");
				continue;
			}
			for (int i = 0; i < h; i++) {
				lo: for (int j = 0; j < w; j++) {
					if (map[i][j])
						continue;
					int c = 0;
					for (int[] m : move) {
						int ny = i + m[0];
						int nx = j + m[1];
						if (!isOK(ny, nx))
							continue;
						if (map[ny][nx])
							continue;
						c++;
						if (c == 2)
							continue lo;
					}
					System.out.println("No");
					continue loop;
				}
			}
			System.out.println(dfs(sy, sx, 0, -100) ? "Yes" : "No");
		}
	}

	private boolean dfs(int y, int x, int deep, int prev) {
		if (count - deep < Math.abs(y - sy) + Math.abs(x - sx))
			return false;
		for (int r = 0; r < 4; r++) {
			int ny = y + move[r][0];
			int nx = x + move[r][1];
			if (!isOK(ny, nx))
				continue;
			if (Math.max(r, prev) - Math.min(r, prev) == 2)
				continue;
			if (ny == sy && nx == sx && count - 1 == deep)
				return true;
			if (map[ny][nx])
				continue;
			if (!check(ny, nx))
				continue;
			map[ny][nx] = true;
			if (dfs(ny, nx, deep + 1, r))
				return true;
			map[ny][nx] = false;
		}
		return false;
	}

	private boolean check(int y, int x) {
		lo: for (int[] m : move2) {
			int ny = y + m[0];
			int nx = x + m[1];
			if (!isOK(ny, nx))
				continue;
			if (nx == sx && ny == sy)
				continue;
			if (map[ny][nx])
				continue;
			int c = 0;
			for (int[] mm : move) {
				int nny = ny + mm[0];
				int nnx = nx + mm[1];
				if (!isOK(nny, nnx))
					continue;
				if (map[nny][nnx])
					continue;
				c++;
				if (c == 2)
					continue lo;
			}
			return false;
		}
		return true;
	}

	private boolean isOK(int y, int x) {
		if (0 <= y && y < h && 0 <= x && x < w)
			return true;
		return false;
	}

	int count;
	boolean[][] map;
	int[][] move = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };
	int[][] move2 = { { -1, -1 }, { -1, 1 }, { 1, -1 }, { 1, 1 } };
	int h, w, sx, sy;
}