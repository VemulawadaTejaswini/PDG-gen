import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int[][] path=new int[M][2];
		for(int i=0; i<M; i++) {
			for(int j=0; j<2; j++) {
				path[i][j]=sc.nextInt();
			}
		}
		int count=0;
		for(int i=0; i<M; i++) {
			UnionFind.init(N);
			for(int j=0; j<M; j++) {
				if(i!=j) {
					UnionFind.unite(path[j][0]-1, path[j][1]-1);
				}
			}
			for(int j=2; j<=N; j++) {
				if(!UnionFind.same(0,j-1)) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}

	static class UnionFind {
		static int N;			//頂点数
		static int par[];		//親ノード
		static int rank[];		//ランク　UnionFind木の高さがrankみたい
		public static void init(int n) {		//初期化
			N = n;
			par = new int[N];
			rank = new int[N];
			for(int i = 0; i < N; i++) {		//0処理
				par[i] = i;
				rank[i] = 0;
			}
		}

		public static int find(int x) {		//木の根を求める
			if(par[x] == x) {
				return x;
			} else {
				return par[x] = find(par[x]);	//経路圧縮
			}
		}

		public static void unite(int x, int y) {		//xとyの属する集合を併合	xにyをという意味合いが強そう		集合に含めるときに unite(114,514);のようにするみたい
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

		public static boolean same(int x, int y) {		//x,yが同じ集合に属するか否か
			return find(x) == find(y);
		}
	}
}