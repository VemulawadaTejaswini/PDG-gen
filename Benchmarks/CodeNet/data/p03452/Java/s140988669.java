import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int m = sc.nextInt();
		Union union = new Union(n);
		int x, y, d;
		for (int i = 0; i < m; i++) {
			x = sc.nextInt() - 1;
			y = sc.nextInt() - 1;
			d = sc.nextInt();
			if (union.unite(x, y, d)) {

			} else {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}

class Union {
	private int[] parent;
	private int[] cost;

	public Union(int n) {
		parent = new int[n];
		cost = new int[n];
		for (int i = 0; i < n; i++) {
			parent[i] = i;
			cost[i] = Integer.MAX_VALUE;
		}
	}

	public int root(int n) {
		if (parent[n] == n) {
			return n;
		}
		return parent[n] = root(parent[n]);
	}

	public boolean unite(int a, int b, int d) {
		int aroot = root(a);
		int broot = root(b);
		if (aroot == broot) {
			if (cost[b] == d) {
				return true;
			} else {
				return false;
			}
		}
		parent[broot] = aroot;
		if (cost[a] == Integer.MAX_VALUE) {
			cost[broot] = d;
		} else {
			cost[broot] = cost[a] + d;
		}
		return true;
	}

}