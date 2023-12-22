/**
 * 
 */

import java.util.Scanner;

/**
 * @author kumar1
 * 
 */
public class Main {

	Main() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int w = scanner.nextInt();
			int h = scanner.nextInt();
			if (w == 0 || h == 0)
				break;
			int[][] world = new int[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					world[i][j] = scanner.nextInt();
				}
			}
			int c = 0;
			for (int j = 0; j < h; j++) {
				for (int k = 0; k < w; k++) {
					if (world[j][k] != 0) {
						c++;
						bfs(world, k, j);
					}
				}
			}
			System.out.println(c);
		}
	}

	/**
	 * @param world
	 * @return
	 */
	private boolean bfs(int[][] world, int x, int y) {
		// TODO 自動生成されたメソッド・スタブ
		world[y][x] = 0;
		int[] dx = { -1, 0, 1, 1, 1, 0, -1, -1 };
		int[] dy = { 1, 1, 1, 0, -1, -1, -1, 0 };
		int c = 0;
		for (int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (nx < 0 || world[0].length <= nx || ny < 0 || world.length <= ny)
				continue;
			if (world[ny][nx] != 0) {
				bfs(world, nx, ny);
				c++;
			}
		}
		if(c == 0)
			return false;
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main();
	}

}