import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Main().run();
	}

	int INF = 1 << 28;

	void run() {
		while (true) {
			int c, n, m, s, d;
			c = sc.nextInt();
			n = sc.nextInt();
			m = sc.nextInt();
			s = sc.nextInt();
			d = sc.nextInt();
			if ((n | m | c | s | d) == 0)
				break;

			@SuppressWarnings("unchecked")
			List<Edge>[] es = new ArrayList[n];
			for (int i = 0; i < n; i++) {
				es[i] = new ArrayList<Edge>();
			}
			for (int i = 0; i < m; i++) {
				int a, b, f;
				a = sc.nextInt() - 1;
				b = sc.nextInt() - 1;
				f = sc.nextInt();
				es[a].add(new Edge(f, b));
				es[b].add(new Edge(f, a));
			}
			Queue<Node> q = new PriorityQueue<Node>();
			q.add(new Node(0, s - 1, c));
			boolean visited[][] = new boolean[n][c + 1];
			int ans = INF;
			while (!q.isEmpty()) {
				Node node = q.poll();
				int cost = node.cost;
				int v = node.v;
				int cnt = node.cnt;
				if (visited[v][cnt])
					continue;
				visited[v][cnt] = true;
				if (v == d - 1) {
					ans = Math.min(ans, cost);
				}
				for (Edge e : es[v]) {
					q.add(new Node(cost + e.cost, e.to, cnt));
					if (cnt > 0) {
						q.add(new Node(cost + e.cost / 2, e.to, cnt - 1));
					}
				}
			}
			System.out.println(ans);
		}
	}
}

class Node implements Comparable<Node> {
	int cost;
	int v;
	int cnt;

	Node(int cost, int v, int cnt) {
		this.cost = cost;
		this.v = v;
		this.cnt = cnt;
	}

	public int compareTo(Node n) {
		return cost - n.cost;
	}
}

class Edge {
	int to;
	int cost;

	Edge(int cost, int to) {
		this.to = to;
		this.cost = cost;
	}
}