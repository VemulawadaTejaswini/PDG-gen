import java.util.Scanner;

public class Main {

	static int[] parent;

	public static void init(int N) {
		for (int i=0; i<N; i++) {
			parent[i] = i;
		}
	}

	public static int find(int x) {
		if (parent[x] == x) {
			return x;
		} else {
			return parent[x] = find(parent[x]);
		}
	}

	public static boolean same(int x, int y) {
		return find(x) == find(y);
	}

	public static void union(int x, int y) {
		x = find(x);
		y = find(y);
		if (x == y) {
			return;
		}
		parent[y] = x;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int q = sc.nextInt();

		parent = new int[n];
		init(n);

		int[] com = new int[q];
		int[] x = new int[q];
		int[] y = new int[q];

		for (int i=0; i<q; i++) {
			com[i] = sc.nextInt();
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}

		for (int i=0; i<q; i++) {
			if (com[i] == 0) {
				union(x[i], y[i]);
			} else {
				if (same(x[i], y[i])) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			}
		}

		sc.close();
	}

}