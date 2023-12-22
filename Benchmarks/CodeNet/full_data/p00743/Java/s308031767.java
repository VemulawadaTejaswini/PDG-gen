import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	class State implements Comparable<State> {
		int s;
		int x;
		int p;
		double t;
		boolean end = false;

		State(int s, int x, int p, double t) {
			this.s = s;
			this.x = x;
			this.p = p;
			this.t = t;
		}

		@Override
		public int compareTo(State arg0) {
			return this.t - arg0.t < 0 ? -1 : 1;
		}

	}

	void run() {

		for (;;) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if ((n | m) == 0) {
				break;
			}
			n++;
			int s = sc.nextInt();
			int g = sc.nextInt();

			int map[][] = new int[n][n];
			int lim[][] = new int[n][n];

			for (int i = 0; i < n; i++) {
				Arrays.fill(map[i], Integer.MAX_VALUE >> 2);
			}

			for (int i = 0; i < m; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int d = sc.nextInt();
				int c = sc.nextInt();
				map[x][y] = d;
				map[y][x] = d;
				lim[x][y] = c;
				lim[y][x] = c;
			}

			double ans[][][] = new double[n][n][31];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					Arrays.fill(ans[i][j], Integer.MAX_VALUE >> 3);
				}
			}

			PriorityQueue<State> q = new PriorityQueue<State>();
			q.add(new State(1, s, 0, 0));
			ans[s][0][1] = 0;
			for (;;) {
				if (q.isEmpty()) {
					System.out.println("unreachable");
					break;
				}
				
				State now = q.poll();
				if (now.end) {
					System.out.println(now.t);
					break;
				}
				if (ans[now.x][now.p][now.s] < now.t) {
					continue;
				}
				
				for (int i = 1; i < n; i++) {

					if (i == now.p) {
						continue;
					}
					if (now.x == i) {
						continue;
					}
					if (map[now.x][i] > Integer.MAX_VALUE >> 3) {
						continue;
					}
					if (lim[now.x][i] < now.s) {
						continue;
					}
					for (int ns = now.s - 1; ns <= now.s + 1; ns++) {
						if (ns <= 0) {
							continue;
						}
						if (ns > 30) {
							continue;
						}
						if (now.s == 1 && i == g) {
							State st = new State(ns, i, now.x, now.t
									+ (double) map[now.x][i] / (double) now.s);
							st.end = true;
							q.add(st);
						}
						if (now.t + (double) map[now.x][i] / (double) now.s < ans[i][now.x][ns]) {
							ans[i][now.x][ns] = now.t + (double) map[now.x][i]
									/ (double) now.s;
							State st = new State(ns, i, now.x, now.t
									+ (double) map[now.x][i] / (double) now.s);
							if (now.s == 1 && i == g) {
								st.end = true;
							}
							q.add(st);
						}
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}