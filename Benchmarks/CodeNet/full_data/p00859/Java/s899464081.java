import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
		while (true) {
			int N = nextInt();
			if (N == 0) {
				break;
			}
			int M = nextInt();
			ArrayList<Edge> list = new ArrayList<Edge>();

			for (int i = 0; i < M; i++) {
				int a = nextInt() - 1;
				int b = nextInt() - 1;
				int w = nextInt();
				list.add(new Edge(w, a, b));
			}
			Collections.sort(list);

			int ans = Integer.MAX_VALUE;
			for (int i = 0; i < list.size(); i++) {
				PriorityQueue<Edge> priorityQueue = new PriorityQueue<Edge>();
				for (int j = i; j < list.size(); j++) {
					priorityQueue.add(new Edge(list.get(j).weight, list.get(j).from, list.get(j).to));
				}

				// クラスカル法
				UnionFind uf = new UnionFind(N);

				int max = 0;
				while (!priorityQueue.isEmpty()) {
					Edge e = priorityQueue.poll();
					if (!uf.isSame(e.from, e.to)) {
						max = Math.max(max, e.weight);
						uf.unite(e.from, e.to);
					}
				}
				boolean allSame = true;
				for (int j = 1; j < N; j++) {
					if (!uf.isSame(0, j)) {
						allSame = false;
						break;
					}
				}
				if (allSame) {
					ans = Math.min(ans, max - list.get(i).weight);
				}
			}
			if (ans == Integer.MAX_VALUE) {
				System.out.println(-1);
			} else {
				System.out.println(ans);
			}
		}
	}

	static int nextInt() {
		int c;
		try {
			c = System.in.read();
			while (c != '-' && (c < '0' || c > '9'))
				c = System.in.read();
			if (c == '-')
				return -nextInt();
			int res = 0;
			while (c >= '0' && c <= '9') {
				res = res * 10 + c - '0';
				c = System.in.read();
			}
			return res;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}
}

class UnionFind {
	int[] parts;

	UnionFind(int n) {
		parts = new int[n];
		for (int i = 0; i < n; i++)
			parts[i] = i;
	}

	public int find(int x) {
		if (parts[x] == x)
			return x;
		return parts[x] = find(parts[x]);
	}

	public Boolean isSame(int x, int y) {
		return find(x) == find(y);
	}

	public void unite(int x, int y) {
		if (find(x) == find(y))
			return;
		parts[find(x)] = find(y);
	}
}

class Edge implements Comparable<Edge> {
	int weight;
	int from, to;

	Edge(int w, int f, int t) {
		this.weight = w;
		this.from = f;
		this.to = t;
	}

	@Override
	public int compareTo(Edge edge) {
		// 昇順
		return this.weight - edge.weight;
	}
}