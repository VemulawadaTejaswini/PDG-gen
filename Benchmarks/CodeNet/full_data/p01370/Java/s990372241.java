import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	class P {
		int x, y, t;
		P(int x, int y, int t) {
			this.x = x;
			this.y = y;
			this.t = t;
		}
	}
	
	void run() {
		int t, n;
		boolean[][] map = new boolean[140][140];
		boolean[][] check = new boolean[140][140];
		int[] dx = {0, 0, 1, -1, 1, -1};
		int[] dy = {1, -1, 0, 0, 1, -1};
		Queue<P> q = new LinkedList<P>();
		while (true) {
			t = sc.nextInt(); n = sc.nextInt();
			if (t == 0) break;
			for (int i = 0; i < 140; i++) {
				Arrays.fill(map[i], true);
				Arrays.fill(check[i], false);
			}
			for (int i = 0; i < n; i++)
				map[sc.nextInt()+70][sc.nextInt()+70] = false;
			int x = sc.nextInt()+70, y = sc.nextInt()+70;
			int ans = 0;
			check[x][y] = true;
			q.add(new P(x, y, 0));
			while (!q.isEmpty()) {
				ans++;
				P p = q.poll();
				if (p.t < t) {
					for (int i = 0; i < 6; i++) {
						if (!check[p.x+dx[i]][p.y+dy[i]] && map[p.x+dx[i]][p.y+dy[i]]) {
							check[p.x+dx[i]][p.y+dy[i]] = true;
							q.add(new P(p.x+dx[i], p.y+dy[i], p.t+1));
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