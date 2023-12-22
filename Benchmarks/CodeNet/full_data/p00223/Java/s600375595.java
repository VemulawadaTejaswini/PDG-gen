import java.util.LinkedList;
import java.util.Queue;

public class Main {

	Scanner sc = new Scanner();

	class Scanner {
		int nextInt() {
			try {
				int c = System.in.read();
				while (c != '-' && (c < '0' || '9' < c))
					c = System.in.read();
				if (c == '-')
					return -nextInt();
				int res = 0;
				do {
					res *= 10;
					res += c - '0';
					c = System.in.read();
				} while ('0' <= c && c <= '9');
				return res;
			} catch (Exception e) {
				return -1;
			}
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String next() {
			try {
				StringBuilder res = new StringBuilder("");
				int c = System.in.read();
				while (Character.isWhitespace(c))
					c = System.in.read();
				do {
					res.append((char) c);
				} while (!Character.isWhitespace(c = System.in.read()));
				return res.toString();
			} catch (Exception e) {
				return null;
			}
		}
	}

	int dx[] = { 1, 0, -1, 0 };
	int dy[] = { 0, 1, 0, -1 };
	int X, Y;

	void run() {
		for (;;) {
			X = sc.nextInt();
			Y = sc.nextInt();
			int cnt = -1;
			boolean judge = false;
			if ((X | Y) == 0) {
				return;
			}
			int tx = sc.nextInt(), ty = sc.nextInt();
			int kx = sc.nextInt(), ky = sc.nextInt();
			int map[][] = new int[Y + 1][X + 1];
			boolean visit[][][][] = new boolean[X + 1][Y + 1][X + 1][Y + 1];
			for (int i = 1; i <= Y; i++) {
				for (int j = 1; j <= X; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			Queue<Pos> queue = new LinkedList<Pos>();
			queue.add(new Pos(tx, ty, kx, ky, 0));
			while (queue.size() > 0) {
				Pos now = queue.poll();
				visit[now.ptx][now.pty][now.pkx][now.pky] = true;
				if (now.cost >= 100) {
					continue;
				}
				if (now.ptx == now.pkx && now.pty == now.pky) {
					judge = true;
					cnt = now.cost;
					break;
				}
				for (int j = 0; j < 4; j++) {
					int nexPtx = now.ptx + dx[j];
					int nexPty = now.pty + dy[j];
					int nexPkx = now.pkx + dx[j] * -1;
					int nexPky = now.pky + dy[j] * -1;
					boolean j1 = false;
					boolean j2 = false;
					if (innner(nexPtx, nexPty) && map[nexPty][nexPtx] == 0) {
						j1 = true;
					}
					if (innner(nexPkx, nexPky) && map[nexPky][nexPkx] == 0) {
						j2 = true;
					}
					if (j1 && j2 && !visit[nexPtx][nexPty][nexPkx][nexPky]) {
						queue.add(new Pos(nexPtx, nexPty, nexPkx, nexPky,
								now.cost + 1));
					} else if (!j1 && j2
							&& !visit[now.ptx][now.pty][nexPkx][nexPky]) {
						queue.add(new Pos(now.ptx, now.pty, nexPkx, nexPky,
								now.cost + 1));
					} else if (j1 && !j2
							&& !visit[nexPtx][nexPty][now.pkx][now.pky]) {
						queue.add(new Pos(nexPtx, nexPty, now.pkx, now.pky,
								now.cost + 1));
					}
				}
			}
			if (!judge || cnt >= 100) {
				System.out.println("NA");
			} else {
				System.out.println(cnt);
			}
		}
	}

	boolean innner(int x, int y) {
		return x > 0 && x <= X && y > 0 && y <= Y ? true : false;
	}

	public static void main(String[] args) {
		new Main().run();
	}

	class Pos {
		int ptx;
		int pty;
		int pkx;
		int pky;
		int cost;

		Pos(int ptx, int pty, int pkx, int pky, int cost) {
			this.ptx = ptx;
			this.pty = pty;
			this.pkx = pkx;
			this.pky = pky;
			this.cost = cost;
		}
	}
}