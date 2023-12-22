// Curling 2.0
import java.util.*;

public class Main {
	static int[][] field;
	static int w, h, result;
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			w = sc.nextInt();
			h = sc.nextInt();
			if ((w | h) == 0)
				break;
			field = new int[w][h];
			int sx = 0, sy = 0;
			for (int i = 0; i < w; i++)
				for (int j = 0; j < h; j++) {
					field[i][j] = sc.nextInt();
					if (field[i][j] == 2) {
						sx = i;
						sy = j;
					}
				}
			result = 11;
			dfs(sx, sy, 1);
			if (result == 11)
				result = -1;
			System.out.println(result);
		}
		sc.close();
	}

	static void dfs(int x, int y, int turn) {
		if (turn >= result)
			return;
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (!isIn(nx, ny) || field[nx][ny] == 1)
				continue;
			while (true) {
				if (!isIn(nx, ny))
					break;
				if (field[nx][ny] == 1)
					break;
				if (field[nx][ny] == 3) {
					if (result > turn) {
						result = turn;
						return;
					}
				}
				nx += dx[i];
				ny += dy[i];
			}
			if (!isIn(nx, ny))
				continue;
			field[nx][ny] = 0;
			dfs(nx - dx[i], ny - dy[i], turn + 1);
			field[nx][ny] = 1;
		}
	}

	static boolean isIn(int x, int y) {
		return x < w && x >= 0 && y < h && y >= 0;
	}
}