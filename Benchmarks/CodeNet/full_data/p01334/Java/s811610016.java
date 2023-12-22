
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			n = scanner.nextInt();
			if (n == 0)
				break;
			nx = new int[n][n];
			ny = new int[n][n];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++) {
					nx[i][j] = scanner.nextInt();
					ny[i][j] = scanner.nextInt();
				}
			map = new int[n][n];
			int ans = 0;
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++) {
					if (map[i][j] == 2)
						continue;
					ans += dfs(i, j);
				}
			System.out.println(ans);
		}
	}

	private int dfs(int y, int x) {
		if (map[y][x] == 1)
			return 1;
		if (map[y][x] == 2)
			return 0;
		int ret = 0;
		int hx = nx[y][x];
		int hy = ny[y][x];
		map[y][x] = 1;
		ret = dfs(hy, hx);
		map[y][x] = 2;
		return ret;
	}

	int n, nx[][], ny[][];
	int[][] map;
}