import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int p = sc.nextInt();
		ArrayList<Edge>[] al = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			al[i] = new ArrayList<>();
		}
		int a, b, c;
		for (int i = 0; i < m; i++) {
			a = sc.nextInt() - 1;
			b = sc.nextInt() - 1;
			c = sc.nextInt();
			al[a].add(new Edge(b, c));
		}

		ArrayDeque<Pos> deque = new ArrayDeque<>();
		deque.add(new Pos(0, 0, 0, false));
		long ans = Integer.MIN_VALUE;
		while (!deque.isEmpty()) {
			Pos pos = deque.poll();
			if (pos.index == n - 1) {
				if (pos.inf) {
					ans = -1;
					break;
				} else {
					ans = Math.max(ans, pos.cost - pos.time * p);
				}
			}
			for (Edge e : al[pos.index]) {
				if (pos.index == e.to && e.cost > p && !pos.inf) {
					deque.add(new Pos(e.to, pos.cost + e.cost, pos.time + 1, true));
				} else if (pos.index == e.to && e.cost > p && pos.inf) {
				} else {
					deque.add(new Pos(e.to, pos.cost + e.cost, pos.time + 1, pos.inf));
				}
			}
		}
		System.out.println((ans < 0) ? 0 : ans);
	}
}

class Pos {
	int index, cost, time;
	boolean inf;

	public Pos(int index, int cost, int time, boolean inf) {
		this.index = index;
		this.cost = cost;
		this.time = time;
		this.inf = inf;
	}
}

class Edge {
	int cost;
	int to;

	public Edge(int to, int cost) {
		this.to = to;
		this.cost = cost;
	}
}
