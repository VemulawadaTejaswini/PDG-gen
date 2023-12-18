import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] p = new int[n];
		int[] x = new int[m];
		int[] y = new int[m];
		for(int i = 0 ; i < n ; i++) p[i] = sc.nextInt() - 1;
		for(int i = 0 ; i < m ; i++) {
			x[i] = sc.nextInt() - 1;
			y[i] = sc.nextInt() - 1;
		}
		UnionFind uf = new UnionFind(n);
		for(int i = 0 ; i < m ; i++) uf.unite(x[i], y[i]);
//		System.out.println(Arrays.toString(uf.par));
//		System.out.println(Arrays.toString(uf.rank));
		int ans = 0;
		for(int i = 0 ; i < n ; i++) {
			if(i == p[i] || uf.root(i) == uf.root(p[i])) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}

class UnionFind {
	int[] par, rank;
	UnionFind(int n) {
		par = new int[n];
		rank = new int[n];
		for(int i = 0 ; i < n ; i++) {
			par[i] = i;
			rank[i] = 0;
		}
	}
	int root(int x) {
		if(par[x] == x) return x;
		else return par[x] = root(par[x]);
	}
	boolean same(int x, int y) {
		if(root(x) == root(y)) return true;
		else return false;
	}
	void unite(int x, int y) {
		x = root(x);
		y = root(y);
		if(x == y) return;
		if(rank[x] < rank[y]) par[x] = y;
		else {
			par[y] = x;
			if(rank[x] == rank[y]) rank[x]++;
		}
	}
}
