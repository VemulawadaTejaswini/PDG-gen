
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			w = scanner.nextInt();
			h = scanner.nextInt();
			if ((w | h) == 0)
				break;
			map = new char[h][w];
			v = new boolean[h][w];
			for (int i = 0; i < h; i++) {
				map[i] = scanner.next().toCharArray();
				for (int j = 0; j < w; j++) {
					if (map[i][j] != '.') {
						v[i][j] = true;
					}
				}
			}
			ans = new int[4];
			for (int i = 0; i < h; i++)
				for (int j = 0; j < w; j++) {
					u = 0;
					if (v[i][j])
						continue;
					int ret  = dfs(i, j);
					ans[u] += ret;
				}
			System.out.println(ans[1] + " " + ans[2]);
		}
	}

	private int dfs(int y, int x) {
		int ret = 0;
		if (v[y][x])
			return ret;
		v[y][x] = true;
		ret++;
		for (int[] m : move) {
			int ny = y + m[0];
			int nx = x + m[1];
			if (!isOK(ny, nx))
				continue;
			if (map[ny][nx] == 'B') {
				u |= 1;
				continue;
			} else if (map[ny][nx] == 'W') {
				u |= 2;
				continue;
			}
			ret += dfs(ny, nx);
		}
		return ret;
	}

	private boolean isOK(int y, int x) {
		return 0 <= y && y < h && 0 <= x && x < w;
	}

	int w, h, u, ans[];
	boolean[][] v;
	char[][] map;
	int[][] move = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };
}