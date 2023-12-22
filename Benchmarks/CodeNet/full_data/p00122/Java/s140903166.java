
import static java.util.Arrays.deepToString;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		for (;sc.hasNext();) {
			int sy = sc.nextInt();
			int sx = sc.nextInt();
			if (sx == 0 && sy == 0) break;
			int n = sc.nextInt();
			int[] px = new int[n];
			int[] py = new int[n];
			for (int i = 0; i < n; i++) {
				py[i] = sc.nextInt();
				px[i] = sc.nextInt();
			}
			
			int[] dx = {-2, -2, -2, -1, 0, +1, +2, +2, +2, +1, 0, -1};
			int[] dy = {+1, 0, -1, -2, -2, -2, -1, 0, +1, +2, +2, +2};
			Queue<State> q = new ArrayDeque<State>();
			q.add(new State(-1, sx, sy));
			boolean[][][] mark = new boolean[10][10][11];
			boolean success = false;
			while (!q.isEmpty()) {
				State state = q.poll();
				if (state.step == n) {
					success = true;
					break;
				}
				for (int i = 0; i < dx.length; i++) {
					int nx = state.x + dx[i];
					int ny = state.y + dy[i];
					int ns = state.step + 1;
//					tr(nx, ny, ns);
					if (0 <= nx && nx < 10 && 0 <= ny && ny < 10 && 
						(ns >= n || d(nx, ny, px[ns], py[ns]) <= 1)) {
						if (!mark[nx][ny][ns]) {
							q.add(new State(ns, nx, ny));
							mark[nx][ny][ns] = true;
						}
					}
				}
			}
			System.out.println(success ? "OK":"NA");
		}
	}
	
	static int d(int x1, int y1, int x2, int y2) {
		return Math.max(Math.abs(x1 - x2), Math.abs(y2 - y1));
	}
	
	static class State {
		int step;
		int x;
		int y;
		public State(int step, int x, int y) {
			this.step = step;
			this.x = x;
			this.y = y;
		}
	}
	
}