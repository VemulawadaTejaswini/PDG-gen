import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if ((m | n) == 0)
				break;
			Edge[] es = new Edge[m];
			UnionFind uf = new UnionFind(n);
			for (int i = 0; i < m; i++) {
				int s = sc.nextInt();
				int e = sc.nextInt();
				int d = sc.nextInt();
				es[i] = new Edge(s, e, d);
			}
			Arrays.sort(es, new Comparator<Edge>() {
				public int compare(Edge a, Edge b) {
					return a.d - b.d;
				}
			});
			int sum = 0;
			for (int i = 0; i < m; i++) {
				int a = es[i].s;
				int b = es[i].e;
				int d = es[i].d;
				if (!uf.same(a, b)) {
					uf.unite(a, b);
					sum += d;
				}
			}
			System.out.println(sum);
		}
	}
}

class Edge {
	public int s;
	public int e;
	public int d;

	Edge(int s, int e, int d) {
		this.s = s;
		this.e = e;
		this.d = d;
	}
}

class UnionFind {
	public int par[];
	public int rank[];

	UnionFind(int n) {
		par = new int[n];
		rank = new int[n];
		for (int i = 0; i < n; i++) {
			par[i] = i;
		}
	}

	public int find(int x) {
		if (par[x] == x)
			return x;
		else
			return par[x] = find(par[x]);
	}

	public void unite(int x, int y) {
		x = find(x);
		y = find(y);
		if (x == y)
			return;

		if (rank[x] < rank[y]) {
			par[x] = y;
		} else {
			par[y] = x;
			if (rank[x] == rank[y])
				rank[x]++;
		}
	}

	public boolean same(int x, int y) {
		return find(x) == find(y);
	}
}