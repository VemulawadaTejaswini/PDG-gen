import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
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
			LinkedList<Pos> queue = new LinkedList<Pos>();
			queue.add(new Pos(tx, ty, kx, ky));
			while (!queue.isEmpty()) {
				int size = queue.size();
				for (int i = 0; i < size; i++) {
					Pos now = queue.poll();
					visit[now.ptx][now.pty][now.pkx][now.pky] = true;
					if (now.ptx == now.pkx && now.ptx == now.pky) {
						judge = true;
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
							queue.add(new Pos(nexPtx, nexPty, nexPkx, nexPky));
						} else if (!j1 && j2
								&& !visit[now.ptx][now.pty][nexPkx][nexPky]) {
							queue.add(new Pos(now.ptx, now.pty, nexPkx, nexPky));
						} else if (j1 && !j2
								&& !visit[nexPtx][nexPty][now.pkx][now.pky]) {
							queue.add(new Pos(nexPtx, nexPty, now.pkx, now.pky));
						}
					}
				}
				if (judge) {
					break;
				}
				cnt++;
				if (cnt >= 100) {
					break;
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

		Pos(int ptx, int pty, int pkx, int pky) {
			this.ptx = ptx;
			this.pty = pty;
			this.pkx = pkx;
			this.pky = pky;
		}
	}
}