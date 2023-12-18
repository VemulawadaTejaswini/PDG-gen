import java.util.Scanner;

public class Main {
	static int[] parent;

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = Integer.parseInt(sc.next());
			int m = Integer.parseInt(sc.next());
			int[] p = new int[n];
			parent = new int[n + 1];
			parent[n] = n;
			for (int i = 0; i < n; i++) {
				parent[i] = i;
				p[i] = sc.nextInt();
			}
			for (int i = 0; i < m; i++) {
				unite(sc.nextInt(), sc.nextInt());
			}
			int ans = 0;
			for (int i = 0; i < n; i++) {
				if (same(i + 1, p[i]))
					ans++;
			}
			System.out.println(ans);
		}
	}

	static void unite(int x, int y) {
		int rootx = root(x);
		int rooty = root(y);
		if (rootx != rooty)
			parent[rooty] = parent[rootx];
	}

	static public int root(int x) {
		if (parent[x] == x) {
			return x;
		}
		return root(parent[x]);
	}

	static public boolean same(int x, int y) {
		return root(x) == root(y);

	}
}