
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			g = new char[12][6];
			ps = new boolean[12][6];
			for (int y = 0; y < 12; y++)
				g[y] = scanner.next().toCharArray();
			for (int i = 0;; i++) {
				boolean co = false;
				for (int j = 0; j < 12; j++) {
					Arrays.fill(ps[j], false);
				}

				for (int y = 0; y < 12; y++) {
					for (int x = 0; x < 6; x++) {
						if (cn(y, x, g[y][x]) < 4)
							continue;
						cr(y, x, g[y][x]);
						co = true;
					}
				}
				if (!co) {
					System.out.println(i);
					break;
				}
				for (int j = 0; j < 11; j++)
					for (int y = 0; y < 11; y++)
						for (int x = 0; x < 6; x++) {
							if (g[y][x] != '.' && g[y + 1][x] == '.') {
								char tmp = g[y][x];
								g[y][x] = g[y + 1][x];
								g[y + 1][x] = tmp;
							}
						}
			}
		}
	}

	private void cr(int y, int x, char p) {
		if (g[y][x] != p)
			return;
		g[y][x] = '.';
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (!isOK(nx, ny))
				continue;
			if (g[ny][nx] == 'O') {
				g[ny][nx] = '.';
				continue;
			}
			cr(ny, nx, p);

		}
	}

	private int cn(int y, int x, char p) {
		int cc = 0;
		if (p == 'O' || p == '.' || p != g[y][x] || ps[y][x])
			return 0;
		else {
			ps[y][x] = true;
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (!isOK(nx, ny))
					continue;
				cc += cn(ny, nx, p);
			}
		}
		return cc + 1;
	}

	private boolean isOK(int nx, int ny) {
		return 0 <= nx && nx < 6 && 0 <= ny && ny < 12;
	}

	char[][] g;
	boolean[][] ps;
	int dx[] = { 1, 0, -1, 0 };
	int dy[] = { 0, 1, 0, -1 };

}