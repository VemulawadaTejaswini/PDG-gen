import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	class P {
		int x, y;
		P(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	void run() {
		int w, h;
		int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
		int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
		Queue<P> q = new LinkedList<P>();
		boolean[][] map = new boolean[50][50];
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
						q.add(new P(i, j));
						while (!q.isEmpty()) {
							P p = q.poll();
							int x = p.x, y = p.y;
							map[x][y] = false;
							for (int k = 0; k < 8; k++) {
								if (x+dx[k] >= 0 && x+dx[k] < h && y+dy[k] >= 0 && y+dy[k] < w 
										&& map[x+dx[k]][y+dy[k]]) {
									q.add(new P(x+dx[k], y+dy[k]));
								}
							}
						}
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