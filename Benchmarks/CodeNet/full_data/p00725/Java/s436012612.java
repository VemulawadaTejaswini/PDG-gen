import java.util.Arrays;
import java.util.Scanner;

public class Curling2 {
	Scanner in = new Scanner(System.in);
	int W, H;
	int[][] map;
	int vx[] = {0, -1, 1, 0};
	int vy[] = {-1, 0, 0, 1};
	int ans = -1;
	
	void search(int x, int y, int dir, int cnt) {
		for (int i = 0; i < vx.length; i++) {
			int nextDir = (i + 2) % 4;
			int nx = x, ny = y;
			if (dir == nextDir) break;
			while (true) {
				nx += vx[i]; ny += vy[i];
				if (map[ny][nx] == 0) continue;
				else if (map[ny][nx] == 1) search(nx - vx[i], ny - vy[i], i, cnt + 1);
				else if (map[ny][nx] == 3) ans = Math.max(ans, cnt);
				break;
			}
		}
	}
	
	public void run() {
		while (true) {
			int startX = -1, startY = -1;
			W = in.nextInt(); H = in.nextInt();
			if ((W|H) == 0) break;
			map = new int[H+2][W+2];
			for (int i = 0; i < map.length; i++) {
				Arrays.fill(map[i], -1);
			}
			
			for (int i = 1; i < map.length - 1; i++) {
				for (int j = 1; j < map[i].length - 1; j++) {
					map[i][j] = in.nextInt();
					if (map[i][j] == 2) {
						startX = j; startY = i;
					}
				}
			}
			ans = -1;
			
			search(startX, startY, -1, 0);
			
			System.out.println(ans);
		}
	}
	
	public static void main(String args[]) {
		new Curling2().run();
	}
}