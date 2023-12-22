import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int n = sc.nextInt();
		int q = sc.nextInt();

		UnionFind u = new UnionFind(n);

		for (int i = 0; i < q; i++) {
			int com = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();

			if (com == 0) { // unite
				u.unite(x, y);
			} else { // same
				if (u.same(x, y)) {
					out.println(1);
				} else {
					out.println(0);
				}
			}
		}

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}

class UnionFind {

	int[] par;

	public UnionFind(int size) {
		par = new int[size];
		Arrays.fill(par, -1);
	}

	public int root(int x) {
		if (par[x] < 0) {
			return x;
		}
		int z = root(par[x]);
		par[x] = z;
		return z;
	}

	public boolean same(int a, int b) {
		return root(a) == root(b);
	}

	public void unite(int a, int b) {
		if (!same(a, b)) {
			int ra = root(a);
			int rb = root(b);

			if (par[ra] < par[rb]) {
				par[ra] += par[rb];
				par[rb] = ra;
			} else {
				par[rb] += par[ra];
				par[ra] = rb;
			}
		}
	}

	public int size(int a) {
		return -par[root(a)];
	}

}
