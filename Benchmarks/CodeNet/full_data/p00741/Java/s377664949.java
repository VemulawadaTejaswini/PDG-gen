import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int w, h;
		int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
		int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
		Queue<Integer> qx = new LinkedList<Integer>();
		Queue<Integer> qy = new LinkedList<Integer>();
		while (true) {
			w = sc.nextInt(); h = sc.nextInt();
			if (w == 0) break;
			boolean[][] map = new boolean[h][w];
			for (int i = 0; i < h; i++)
				for (int j = 0; j < w; j++)
					map[i][j] = (sc.nextInt() == 1);
			
			int ans = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (map[i][j]) {
						ans++;
						qx.add(i); qy.add(j);
						while (!qx.isEmpty()) {
							int x = qx.poll(), y = qy.poll();
							map[x][y] = false;
							for (int k = 0; k < 8; k++) {
								if (x+dx[k] >= 0 && x+dx[k] < h && y+dy[k] >= 0 && y+dy[k] < w 
										&& map[x+dx[k]][y+dy[k]]) {
									qx.add(x+dx[k]);
									qy.add(y+dy[k]);
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