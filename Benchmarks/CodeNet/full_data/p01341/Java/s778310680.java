import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int[] x = new int[N];
		int[] y = new int[N];
		for (int i = 0; i < N; i++) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();
		}
		
		double ans = 0;
		int[][] e = new int[M][];
		for (int j = 0; j < M; j++) {
			int p = in.nextInt();
			int q = in.nextInt();
			int dx = x[p - 1] - x[q - 1];
			int dy = y[p - 1] - y[q - 1];
			int d2 = dx * dx + dy * dy;
			e[j] = new int[]{p - 1, q - 1, d2};
			ans += Math.sqrt(d2);
		}
		
		Comparator<int[]> cmp = new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return b[2] - a[2];
			}
		};
		Arrays.sort(e, cmp);
		
		DisjointSetForest dsf = new DisjointSetForest(N);
		for (int j = 0; j < M; j++) {
			int v = e[j][0];
			int w = e[j][1];
			int d2 = e[j][2];
			if (dsf.find(v) != dsf.find(w)) {
				dsf.union(v, w);
				ans -= Math.sqrt(d2);
			}
		}
		System.out.println(ans);
	}
}

class DisjointSetForest {
	int[] parent;
	int[] rank;
	
	DisjointSetForest(int n) {
		parent = new int[n];
		Arrays.fill(parent, -1);
		rank = new int[n];
	}
	
	int find(int x) {
		if (parent[x] == -1) {
			return x;
		} else {
			return parent[x] = find(parent[x]);
		}
	}
	
	void union(int x, int y) {
		x = find(x);
		y = find(y);
		if (x != y) {
			if (rank[x] < rank[y]) {
				parent[x] = y;
			} else {
				parent[y] = x;
				if (rank[x] == rank[y]) {
					rank[x]++;
				}
			}
		}
	}
}