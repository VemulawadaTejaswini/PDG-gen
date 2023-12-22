import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
	static int[] parent;
	static int[] rank;

	static void makeSet(int x) {
		parent[x] = x;
		rank[x] = 0;
	}

	static void union(int x, int y) {
		link(findSet(x), findSet(y));
	}

	static void link(int x, int y) {
		if(rank[x] > rank[y]) {
			parent[y] = x;
		} else {
			parent[x] = y;

			if(rank[x] == rank[y]) {
				rank[y] += 1;
			}
		}
	}

	static int findSet(int x) {
		if (x != parent[x]) {
			parent[x] = findSet(parent[x]);
		}

		return parent[x];
	}

	static boolean same(int x, int y) {
		return findSet(x) == findSet(y);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Integer> results = new ArrayList<>();

		int num_items = scanner.nextInt();
		int num_queries = scanner.nextInt();

		parent = new int[num_items];
		rank = new int[num_items];

		for (int i = 0; i < num_items; i++) {
			makeSet(i);
		}

		for (int i = 0; i < num_queries; i++) {
			int type = scanner.nextInt();
			int x = scanner.nextInt();
			int y = scanner.nextInt();

			if (type == 0) {
				union(x, y);
			} else {
				results.add(same(x,y) ? 1 : 0);
			}
		}

		for (Integer r : results) {
			System.out.println(r);
		}
	}
}
