import java.math.BigDecimal;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				sc.close();
				break;
			}

			double[][] stations = new double[n][4];
			for (int i = 0; i < stations.length; i++) {
				stations[i][0] = sc.nextDouble();
				stations[i][1] = sc.nextDouble();
				stations[i][2] = sc.nextDouble();
				stations[i][3] = sc.nextDouble();
			}

			PriorityQueue<Edge> edges = new PriorityQueue<Edge>();
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					double x1 = stations[i][0];
					double x2 = stations[j][0];
					double y1 = stations[i][1];
					double y2 = stations[j][1];
					double z1 = stations[i][2];
					double z2 = stations[j][2];
					double r1 = stations[i][3];
					double r2 = stations[j][3];

					double dist = Math.sqrt(Math.pow((x1 - x2), 2)
							+ Math.pow((y1 - y2), 2) + Math.pow((z1 - z2), 2))
							- r1 - r2;
					dist = Math.max(dist, 0);
					edges.add(new Edge(dist, i, j));
				}
			}

			// クラスカル法
			UnionFind uf = new UnionFind(n);
			double cost = 0;
			while (!edges.isEmpty()) {
				Edge e = edges.poll();
				if (!uf.same(e.from, e.to)) {
					cost += e.weight;
					uf.unite(e.from, e.to);
				}
			}

			BigDecimal bd = new BigDecimal(String.valueOf(cost));
			System.out.println(bd.setScale(3, BigDecimal.ROUND_HALF_UP));

		}
	}
}

class UnionFind {
	int[] par;

	UnionFind(int n) {
		par = new int[n];
		for (int i = 0; i < n; i++)
			par[i] = i;
	}

	public int find(int x) {
		if (par[x] == x)
			return x;
		return par[x] = find(par[x]);
	}

	public Boolean same(int x, int y) {
		return find(x) == find(y);
	}

	public void unite(int x, int y) {
		if (find(x) == find(y))
			return;
		par[find(x)] = find(y);
	}
}

class Edge implements Comparable<Edge> {
	double weight;
	int from, to;

	Edge(double w, int f, int t) {
		this.weight = w;
		this.from = f;
		this.to = t;
	}

	@Override
	public int compareTo(Edge edge) {
		// 昇順
		if (this.weight > edge.weight) {
			return 1;
		} else if (this.weight == edge.weight) {
			return 0;
		} else {
			return -1;
		}
	}
}