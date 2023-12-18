import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int A[] = new int[M];
		int B[] = new int[M];
		UnionFind.init(N);
		for(int i = 0; i < M; i++) {
			A[i] = Integer.parseInt(sc.next()) - 1;
			B[i] = Integer.parseInt(sc.next()) - 1;
		}
		
		long ans[] = new long[M];
		ans[M - 1] = (long)N * (long)(N - 1) / 2;
		for(int i = M - 2; i >= 0; i--) {
			if(UnionFind.same(A[i + 1], B[i + 1])) {
				ans[i] = ans[i + 1];
			} else {
				ans[i] = ans[i + 1] - ((long)UnionFind.getSize(A[i + 1]) * (long)UnionFind.getSize(B[i + 1]));
			}
			UnionFind.unite(A[i + 1], B[i + 1]);
		}
		for(int i = 0; i < M; i++) {
			System.out.println(ans[i]);
		}
	}
}

class UnionFind {
	static int N;
	static int par[];
	static int rank[];
	static int size[];
	public static void init(int n) {
		N = n;
		par = new int[N];
		rank = new int[N];
		size = new int[N];
		for(int i = 0; i < N; i++) {
			par[i] = i;
			rank[i] = 0;
			size[i] = 1;
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
			size[y] += size[x];
		} else {
			par[y] = x;
			size[x] += size[y];
			if(rank[x] == rank[y]) rank[x]++;
		}
	}
	
	public static int getSize(int x) {
		int rootX = find(x);
		return size[rootX];
	}
	
	public static boolean same(int x, int y) {
		return find(x) == find(y);
	}
}
