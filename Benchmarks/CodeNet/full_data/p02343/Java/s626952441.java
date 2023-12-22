
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int q = scanner.nextInt();
		DisjoinSet ds = new DisjoinSet(n);
		for (int i = 0; i < q; i++) {
			int t = scanner.nextInt();
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if (t == 0)
				ds.unite(a, b);
			else {
				if (ds.same(a, b))
					System.out.println(1);
				else
					System.out.println(0);
			}

		}

	}

	class DisjoinSet {
		int[] rank;
		int[] p;

		DisjoinSet() {
		}

		DisjoinSet(int size) {
			rank = new int[size];
			p = new int[size];
			for (int i = 0; i < size; i++) {
				makeSet(i);
			}
		}

		void makeSet(int x) {
			p[x] = x;
		}

		boolean same(int x, int y) {
			return findSet(x) == findSet(y);
		}

		private int findSet(int x) {
			if (x != p[x]) {
				p[x] = findSet(p[x]);
			}
			return p[x];
		}

		void unite(int x, int y) {
			link(findSet(x), findSet(y));
		}

		private void link(int x, int y) {
			if (rank[x] > rank[y]) {
				p[y] = x;
			} else {
				p[x] = y;
				if (rank[x] == rank[y]) {
					rank[y]++;
				}
			}
		}
	}
}