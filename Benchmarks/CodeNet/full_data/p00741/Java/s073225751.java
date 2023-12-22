import java.util.*;

import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	boolean[][] map = new boolean[50][50];
	int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
	int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
	int w, h;
	
	void dfs(int x, int y) {
		map[x][y] = false;
		for (int k = 0; k < 8; k++) {
			if (x+dx[k] >= 0 && x+dx[k] < h && y+dy[k] >= 0 && y+dy[k] < w 
					&& map[x+dx[k]][y+dy[k]]) {
				dfs(x+dx[k], y+dy[k]);
			}
		}
	}
	
	void run() {
		while (true) {
			w = sc.nextInt(); h = sc.nextInt();
			if (w == 0) break;
			for (int i = 0; i < h; i++)
				for (int j = 0; j < w; j++)
					map[i][j] = (sc.nextInt() == 1);
			
			int ans = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (map[i][j]) {
						ans++;
						dfs(i, j);
					}
				}
			}
			out.println(ans);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}