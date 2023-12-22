import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

	final int INF = 1 << 29;
	int w;
	int h;
	int map[][];
	boolean broken[][];
	int dx[] = { 0, 1, 0, -1 };
	int dy[] = { 1, 0, -1, 0 };

	int sx;
	int sy;

	void run() {
		while (true) {
			w = sc.nextInt();
			h = sc.nextInt();

			if ((w | h) == 0)
				break;
			map = new int[h][w];
			broken = new boolean[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					map[i][j] = sc.nextInt();
					if (map[i][j] == 2) {
						sx = j;
						sy = i;
					}
				}
			}
			int ans = dfs(sx, sy, 0);
			System.out.println(ans == INF ? -1 : ans);
		}
	}

	int dfs(int x, int y, int c) {
//		System.out.println(x + " " + y + " " + c);
		int res = INF;
		if (map[y][x] == 3) {
			return c;
		}
		if (c >= 10) {
			return INF;
		}
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (check(nx, ny) || (map[ny][nx] == 1 && !broken[ny][nx]))
				continue;
			boolean next = false;
			for (;;) {
				if (map[ny][nx] == 3) {
					break;
				}
				nx += dx[i];
				ny += dy[i];
				if (check(nx, ny)) {
					next = true;
//					System.out.println("wawasi " + nx + " " + ny);
					break;
				}
				if (map[ny][nx] == 1 && !broken[ny][nx]) {
					broken[ny][nx] = true;
					nx -= dx[i];
					ny -= dy[i];
					break;
				}
			}
			if (next)
				continue;
			res = Math.min(res, dfs(nx, ny, c + 1));
			if (map[ny][nx] != 3)
				broken[ny + dy[i]][nx + dx[i]] = false;
		}
		return res;
	}

	boolean check(int nx, int ny) {
		return nx < 0 || ny < 0 || nx >= w || ny >= h;
	}

	public static void main(String[] args) {
		new Main().run();

	}
}