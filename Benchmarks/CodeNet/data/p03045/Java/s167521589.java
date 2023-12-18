import java.util.Scanner;

public class Main {
	private static class UnionFind {
		int n;
		int[] p;
		int size;

		UnionFind(int n) {
			this.n = n;
			this.size = n;
			p = new int[n];
			for (int i = 0; i < n; i++) {
				p[i] = i;
			}
		}

		public void connect(int v, int u) {
			int rv = root(v);
			int ru = root(u);
			if (rv != ru) size--;
			p[rv] = p[ru];
		}

		public int size() {
			return size;
		}

		private int root(int v) {
			while (v != p[v]) {
				p[v] = p[p[v]];
				v = p[v];
			}
			return p[v];
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		UnionFind uf = new UnionFind(n);
		for (int i = 0; i < m; i++) {
			uf.connect(sc.nextInt() - 1, sc.nextInt() - 1);
			sc.nextInt();
		}

		System.out.println(uf.size());
	}
}
