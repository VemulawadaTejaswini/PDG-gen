import java.util.PriorityQueue;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		solver();
	}

	static void solver() {
		Scanner sc = new Scanner(System.in);
		int sx = sc.nextInt() + 100;
		int sy = sc.nextInt() + 100;
		int gx = sc.nextInt() + 100;
		int gy = sc.nextInt() + 100;
		int n = sc.nextInt();
		int[][] map = new int[200][200];
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt() + 100;
			int y = sc.nextInt() + 100;
			map[x][y] = -1;
		}
		int lx = sc.nextInt();
		int ly = sc.nextInt();

		boolean[][][] arrived = new boolean[200][200][6];
		PriorityQueue<P> q = new PriorityQueue<>();
		q.add(new P(sx, sy, 0, 0));
		 q.add(new P(sx, sy, 1, 1));
		 q.add(new P(sx, sy, 2, 1));
		 q.add(new P(sx, sy, 3, 1));
		 q.add(new P(sx, sy, 4, 1));
		 q.add(new P(sx, sy, 5, 1));
		while (!q.isEmpty()) {
			P p = q.poll();
			if (p.x > 100 + lx || p.y > 100 + ly || p.x < 100 - lx || p.y < 100 - ly || map[p.x][p.y] == -1
					|| arrived[p.x][p.y][p.t % 6]) {
				continue;
			}
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					P np = nextP(p, i);
					np.betrayal = p.betrayal + (i != p.rand() ? 1 : 0);
					np.t = j + 1 + p.t;
					q.add(np);
				}
			}
			arrived[p.x][p.y][p.t % 6] = true;
			if (p.x == gx && p.y == gy) {
				System.out.println(p.betrayal);
				return;
			}
		}
		System.out.println(-1);
	}

	static P nextP(P p, int rand) {
		if (rand == 0) {
			return new P(p.x, p.y + 1, p.t + 1, p.betrayal);
		} else if (rand == 1) {
			return new P(p.x + 1, p.y + (p.x % 2 == 0 ? 0 : 1), p.t + 1, p.betrayal);
		} else if (rand == 2) {
			return new P(p.x + 1, p.y + (p.x % 2 == 0 ? -1 : 0), p.t + 1, p.betrayal);
		} else if (rand == 3) {
			return new P(p.x, p.y - 1, p.t + 1, p.betrayal);
		} else if (rand == 4) {
			return new P(p.x - 1, p.y + (p.x % 2 == 0 ? -1 : 0), p.t + 1, p.betrayal);
		} else if (rand == 5) {
			return new P(p.x - 1, p.y + (p.x % 2 == 0 ? 0 : 1), p.t + 1, p.betrayal);
		} else {
			throw new AssertionError(rand);
		}
	}

	static class P implements Comparable<P> {
		int x;
		int y;
		int t;
		int betrayal;

		P(int x, int y, int t, int betrayal) {
			this.x = x;
			this.y = y;
			this.t = t;
			this.betrayal = betrayal;
		}

		int rand() {
			return Math.abs(x * y * t) % 6;
		}

		@Override
		public int compareTo(P o) {
			return Integer.compare(this.betrayal, o.betrayal);
		}
	}
}