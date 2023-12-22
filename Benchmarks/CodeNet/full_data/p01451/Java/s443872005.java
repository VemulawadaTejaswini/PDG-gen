import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int NA, NB;
	static int[] XA, YA, XB, YB;
	static final double INF = 1e300;

	public static void main(String[] args) {
		NA = sc.nextInt();
		NB = sc.nextInt();
		XA = new int[NA];
		YA = new int[NA];
		XB = new int[NB];
		YB = new int[NB];
		for (int i = 0; i < NA; ++i) {
			XA[i] = sc.nextInt();
			YA[i] = sc.nextInt();
		}
		for (int i = 0; i < NB; ++i) {
			XB[i] = sc.nextInt();
			YB[i] = sc.nextInt();
		}
		double a1 = solve(XA, YA, XB, YB);
		double a2 = solve(XB, YB, XA, YA);
		double ans = Math.min(a1, a2);
		if (ans == INF) {
			System.out.println(-1);
		} else {
			System.out.printf("%.9f\n", ans);
		}
	}

	static double solve(int[] X1, int[] Y1, int[] X2, int[] Y2) {
		int N = X2.length;
		PriorityQueue<State> q = new PriorityQueue<State>();
		q.add(new State(0, 0));
		boolean[] visited = new boolean[N];
		while (!q.isEmpty()) {
			State cur = q.poll();
			if (cur.v == 1) {
				return cur.d + dist(X1[0], Y1[0], X1[1], Y1[1]);
			}
			if (visited[cur.v]) continue;
			visited[cur.v] = true;
			for (int i = 0; i < N; ++i) {
				if (visited[i]) continue;
				if (cross(X1[0], Y1[0], X1[1], Y1[1], X2[cur.v], Y2[cur.v], X2[i], Y2[i])) continue;
				q.add(new State(i, cur.d + dist(X2[cur.v], Y2[cur.v], X2[i], Y2[i])));
			}
		}
		return INF;
	}

	static class State implements Comparable<State> {
		int v;
		double d;

		State(int v, double d) {
			this.v = v;
			this.d = d;
		}

		public int compareTo(State o) {
			return Double.compare(this.d, o.d);
		}
	}

	static double dist(int x1, int y1, int x2, int y2) {
		return Math.sqrt(sq(x2 - x1) + sq(y2 - y1));
	}

	static double sq(double v) {
		return v * v;
	}

	static boolean cross(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		long v1 = (x1 - x2) * (y3 - y1) + (y1 - y2) * (x1 - x3);
		long v2 = (x1 - x2) * (y4 - y1) + (y1 - y2) * (x1 - x4);
		long v3 = (x3 - x4) * (y1 - y3) + (y3 - y4) * (x3 - x1);
		long v4 = (x3 - x4) * (y2 - y3) + (y3 - y4) * (x3 - x2);
		if (v3 == 0 && v4 == 0) {
			return Math.min(x1, x2) <= x3 && x3 <= Math.max(x1, x2) && Math.min(y1, y2) <= y3 && y3 <= Math.max(y1, y2);
		}
		return v1 * v2 <= 0 && v3 * v4 <= 0;
	}

}