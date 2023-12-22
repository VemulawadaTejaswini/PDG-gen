import java.util.*;
public class Main {

	public static void main (String[] args) {
		new Main().calc();
	}

	int[] moveX = {0,0,-1,1};
	int[] moveY = {-1,1,0,0};
	char[][] map;
	boolean[][] check;
	int ans = 0;
	int w, h;

	void calc () {
		// 同じScanner型の変数にnewで代入するのはどうもまずい
		Scanner sc = new Scanner(System.in);
		while (true) {
			h = sc.nextInt();
			w = sc.nextInt();
			if (w == 0) break;
			ans = 0;
			map = new char[h][w];
			check = new boolean[h][w];
			for (int i = 0; i < h; i++)
				map[i] = sc.next().toCharArray();
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (!check[i][j]) {
						ans++;
						check[i][j] = true;
						dfs(i, j, map[i][j]);
					}
				}
			}
			System.out.println(ans);
		}
	}
	void dfs (int y, int x, char part) {
		for (int i = 0; i < moveX.length; i++) {
			int nextX = x + moveX[i];
			int nextY = y + moveY[i];
			if (0 <= nextX && nextX < w &&
				0 <= nextY && nextY < h &&
				!check[nextY][nextX]) {

				if (map[nextY][nextX] == part) {
					check[nextY][nextX] = true;
					dfs(nextY,nextX,part);
				}
			}

		}
	}
}