public class Main {
	MyScanner sc = new MyScanner();
	int N, M, a, b, w;
	int[] parent;
	Node[] node;

	void run() {
		for (;;) {
			N = sc.nextInt(); // 荷物数
			M = sc.nextInt(); // クエリ数
			if ((N | M) == 0) {
				return;
			}
			parent = new int[N + 1];
			node = new Node[N + 1];
			init();

			for (int i = 0; i < M; i++) {
				String query = sc.next();
				a = sc.nextInt();
				b = sc.nextInt();
				if (query.equals("!")) {
					w = sc.nextInt();
					union(a, b, w);
				} else if (query.equals("?")) {
					System.out.println(same(a, b) ? node[b].weight
							- node[a].weight : "UNKNOWN");
				}
			}
		}
	}

	void init() {
		for (int i = 0; i <= N; i++) {
			parent[i] = i;
			node[i] = new Node(0, 0);
		}
	}

	void union(int x, int y, int w) {
		int rootX = find(x);
		int rootY = find(y);
		if (rootX == rootY) {
			return;
		}
		if (node[rootX].rank < node[rootY].rank) {
			node[rootX].weight = -w - node[x].weight + node[y].weight;
			parent[rootX] = rootY;
		} else {
			node[rootY].weight = w - node[y].weight + node[x].weight;
			parent[rootY] = rootX;

			if (node[rootX].rank == node[rootY].rank) {
				node[rootY].rank++;
			}
		}
	}

	int find(int target) {
		if (parent[target] == target) {
			return target;
		} else {
			int tmp = find(parent[target]);
			node[target].weight += node[parent[target]].weight;
			return parent[target] = tmp;
		}
	}

	boolean same(int x, int y) {
		return find(x) == find(y);
	}

	class Node {
		int weight;
		int rank;

		/**
		 * @param weight
		 * @param rank
		 */
		public Node(int weight, int rank) {
			super();
			this.weight = weight;
			this.rank = rank;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	class MyScanner {
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
}