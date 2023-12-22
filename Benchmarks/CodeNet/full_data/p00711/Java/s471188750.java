import java.util.Scanner;

public class Main {
	int w, h;
	char[][] c;
	int[] dx = {0, -1, 1, 0};
	int[] dy = {-1, 0, 0, 1};

	int f(int x, int y) {
		if (x < 0 || w <= x || y < 0 || h <= y || c[y][x] != '.') {
			return 0;
		}
		c[y][x] = '#';
		int res = 1;
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			res += f(nx, ny);
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

			c = new char[h][];
			for (int i = 0; i < h; i++) {
				c[i] = sc.next().toCharArray();
			}

			int sx = 0, sy = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (c[i][j] == '@') {
						sx = j;
						sy = i;
						c[i][j] = '.';
					}
				}
			}

			System.out.println(f(sx, sy));
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}