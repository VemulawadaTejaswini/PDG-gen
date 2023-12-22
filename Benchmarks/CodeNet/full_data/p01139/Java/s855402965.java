import java.util.Scanner;

public class Main {
	int w, h;
	char[][] f;
	int[] dx = {-1, 0, 0, 1};
	int[] dy = {0, -1, 1, 0};
	boolean flgW, flgB;

	int dfs(int x, int y) {
		if (x < 0 || w <= x || y < 0 || h <= y) {
			return 0;
		}
		if (f[y][x] != '.') {
			if (f[y][x] == 'W') flgW = true;
			if (f[y][x] == 'B') flgB = true;
			return 0;
		}

		f[y][x] = 'X';
		int res = 1;
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			res += dfs(nx, ny);
		}
		return res;
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			w = sc.nextInt();
			h = sc.nextInt();
			if ((w | h) == 0) {
				break;
			}
			f = new char[h][];
			for (int i = 0; i < h; i++) {
				f[i] = sc.next().toCharArray();
			}

			int sumW = 0, sumB = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (f[i][j] != '.') continue;
					flgW = flgB = false;
					int tmp = dfs(j, i);
					if (flgB && !flgW) {
						sumB += tmp;
					} else if (!flgB && flgW) {
						sumW += tmp;
					}
				}
			}

			System.out.println(sumB + " " + sumW);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}