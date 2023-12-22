
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
			map = new boolean[h][w];
			for (int i = 0; i < h; i++) {
				char[] c = scanner.next().toCharArray();
				for (int j = 0; j < w; j++) {
					if (c[j] == '@') {
						sy = i;
						sx = j;
					} else if (c[j] == '#')
						map[i][j] = true;
				}
			}
			System.out.println(dfs(sy, sx));

		}
	}

	private int dfs(int y, int x) {
		int ans = 0;
		if (!isOK(y, x) || map[y][x])
			return ans;

		map[y][x] = true;
		ans++;
		for (int[] m : move) {
			int ny = y + m[0];
			int nx = x + m[1];
			ans += dfs(ny, nx);
		}
		return ans;
	}

	private boolean isOK(int ny, int nx) {
		return 0 <= ny && ny < h && 0 <= nx && nx < w;
	}

	int w, h, sy, sx;
	boolean[][] map;
	int[][] move = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };

}