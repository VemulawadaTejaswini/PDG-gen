import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int a[] = new int[M];
		int b[] = new int[M];
		for(int i = 0; i < M; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
		}
		
		int cnt = 0;
		outside : for(int i = 0; i < M; i++) {
			
			UnionFind union = new UnionFind();
			union.init(N);
			for(int j = 0; j < M; j++) {
				if(j != i) {
					union.unite(a[j], b[j]);
				}
			}
			for(int j = 1; j < N; j++) {
				if(!union.same(0, j)) {
					cnt++;
					continue outside;
				}
			}
		}
		
		System.out.println(cnt);
	}
}

class UnionFind {
	static int N;
	static int par[];
	static int rank[];
	//初期化
	public static void init(int n) {
		N = n;
		par = new int[N];
		rank = new int[N];
		for(int i = 0; i < N; i++) {
			par[i] = i;
			rank[i] = 0;
		}
	}

	//木の根を求める
	public static int find(int x) {
		if(par[x] == x) {
			return x;
		} else {
			return par[x] = find(par[x]);
		}
	}
	
	//連結処理
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
	
	//同じ集合に属するか判定する
	public static boolean same(int x, int y) {
		return find(x) == find(y);
	}
}
