import java.util.*;

public class Main {

	public static int[] moveX = {0,0,-1,1};
	public static int[] moveY = {-1,1,0,0};
	public static char[][] map;
	public static boolean[][] check;
	public static int ans = 0;
	public static int x, y;

	public static void main (String[] args) {
		new Main().calc();
	}

	void calc () {
		Scanner sc = new Scanner(System.in);
		while (true) {
			x = sc.nextInt();
			y = sc.nextInt();

			if (x == 0) break;

			ans = 0;
			map = new char[y][x];
			check = new boolean[y][x];

			for (int i = 0; i < y; i++)
				map[i] = sc.next().toCharArray();

			main:
			for (int i = 0; i < y; i++) {
				for (int j = 0; j < x; j++) {
					if (map[i][j] == '@') {
						ans = 1;
						check[i][j] = true;
						dfs(i, j);
						break main;
					}
				}
			}
			System.out.println(ans);
		}
	}
	void dfs (int y, int x) {
		for (int i = 0; i < moveX.length; i++) {
			int nextX = x + moveX[i];
			int nextY = y + moveY[i];

			if (0 <= nextX && nextX < map[0].length &&
				0 <= nextY && nextY < map.length &&
				map[nextY][nextX] == '.' &&
				!check[nextY][nextX]) {

				ans++;
				check[nextY][nextX] = true;
				dfs(nextY,nextX);
			}
		}
	}
}