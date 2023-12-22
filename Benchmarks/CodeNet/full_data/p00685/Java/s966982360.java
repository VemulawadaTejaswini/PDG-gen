import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[] dx = new int[4];
	static int[] dy = new int[4];

	static int dfs(int x, int y, boolean[][] used) {
		while (used[x][y]) {
			++x;
			if (x == 4) {
				x = 0;
				++y;
				if (y == 4) return 1;
			}
		}
		int ret = 0;
		used[x][y] = true;
		for (int i = 0; i < 4; ++i) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (0 <= nx && nx < 4 && 0 <= ny && ny < 4 && !used[nx][ny]) {
				used[nx][ny] = true;
				ret += dfs(x, y, used);
				used[nx][ny] = false;
			}
		}
		used[x][y] = false;
		return ret;
	}

	static int solve() {
		boolean[][] used = new boolean[4][4];
		return dfs(0, 0, used);
	}

	public static void main(String[] args) {
		while (true) {
			dx[0] = sc.nextInt();
			if (dx[0] > 4) break;
			dy[0] = sc.nextInt();
			for (int i = 1; i < 4; ++i) {
				dx[i] = sc.nextInt();
				dy[i] = sc.nextInt();
			}
			System.out.println(solve());
		}
	}
}