import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int a[][] = new int[M][2];
		for(int i = 0; i < M; i++) {
			a[i][0] = sc.nextInt() - 1;
			a[i][1] = sc.nextInt() - 1;
		}

		int ans = 0;
		for(int k = 0; k < M; k++) {
			UnionFind.init(N);
			for(int i = 0; i < M; i++) {
				if(i == k) continue;
				UnionFind.unite(a[i][0], a[i][1]);
			}
			if(!UnionFind.same(a[k][0], a[k][1])) ans++;
		}
		
		System.out.println(ans);
	}
}

class UnionFind {
	static int N;
	static int par[];
	static int rank[];
	public static void init(int n) {
		N = n;
		par = new int[N];
		rank = new int[N];
		for(int i = 0; i < N; i++) {
			par[i] = i;
			rank[i] = 0;
		}
	}

	public static int find(int x) {
		if(par[x] == x) {
			return x;
		} else {
			return par[x] = find(par[x]);
		}
	}

	public static void unite(int x, int y) {
		x = find(x);
		y = find(y);
		if(x == y) return;

		if(rank[x] < rank[y]) {
			par[x] = y;
		} else {
			par[y] = x;
			if(rank[x] == rank[y]) rank[x]++;
		}
	}

	public static boolean same(int x, int y) {
		return find(x) == find(y);
	}
}