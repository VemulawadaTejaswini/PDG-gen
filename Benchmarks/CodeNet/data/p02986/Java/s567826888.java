import java.util.*;

public class Main {
	static ArrayList<Route>[] tree;
	static Node[] nodes;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		tree = new ArrayList[n];
		nodes = new Node[n];
		for (int i = 0; i < n; i++) {
			tree[i] = new ArrayList<Route>();
		}
		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			int c = sc.nextInt();
			int d = sc.nextInt();
			tree[a].add(new Route(c, d, a, b));
			tree[b].add(new Route(c, d, b, a));
		}
		addNode(0, new ArrayList<Route>());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int u = sc.nextInt() - 1;
			int v = sc.nextInt() - 1;
			int idx = 0;
			while (idx < nodes[u].fromRoot.size() && idx < nodes[v].fromRoot.size() && nodes[u].fromRoot.get(idx).equals(nodes[v].fromRoot.get(idx))) {
				idx++;
			}
			int total = 0;
			for (int j = idx; j < nodes[u].fromRoot.size(); j++) {
				Route r = nodes[u].fromRoot.get(j);
				if (r.color == x) {
					total += y;
				} else {
					total += r.dist;
				}
			}
			for (int j = idx; j < nodes[v].fromRoot.size(); j++) {
				Route r = nodes[v].fromRoot.get(j);
				if (r.color == x) {
					total += y;
				} else {
					total += r.dist;
				}
			}
			sb.append(total).append("\n");
		}
		System.out.print(sb);
	}
	
	static void addNode(int idx, ArrayList<Route> fromRoot) {
		nodes[idx] = new Node(idx, fromRoot);
		for (Route r : tree[idx]) {
			if (nodes[r.to] == null) {
				ArrayList<Route> next = (ArrayList<Route>)(fromRoot.clone());
				next.add(r);
				addNode(r.to, next);
			}
		}
	}
	
	
	static class Node {
		int id;
		ArrayList<Route> fromRoot;
		
		public Node(int id, ArrayList<Route> fromRoot) {
			this.id = id;
			this.fromRoot = fromRoot;
		}
	}
	
	static class Route {
		int color;
		int dist;
		int from;
		int to;
		
		public Route(int color, int dist, int from, int to) {
			this.color = color;
			this.dist = dist;
			this.from = from;
			this.to = to;
		}
		
		public boolean equals(Object o) {
			Route another = (Route) o;
			return this.color == another.color && this.dist == another.dist && this.from == another.from && this.to == another.from;
		}
	}
}
