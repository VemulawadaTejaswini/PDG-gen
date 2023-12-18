import java.util.Scanner;

class UnionFind{
	int[] par;
	int[] rank;
	int[] diff_weight;
	int N;

	public UnionFind(int n){
		N = n;
		par = new int[N];
		rank = new int[N];
		diff_weight = new int[N];
		for(int i = 0; i < N; i++){
			par[i] = i;
			rank[i] = 0;
			diff_weight[i] = 0;
		}
	}

	public int find(int x){
		if(par[x] == x) return x;
		int r = find(par[x]);
		diff_weight[x] += diff_weight[par[x]];
		return par[x] = r;
	}

	public int weight(int x) {
		find(x);
		return diff_weight[x];
	}

	public Boolean same(int x, int y){
		return find(x) == find(y);
	}


	public void unite(int x, int y, int w){
		w += weight(x); w -= weight(y);
		x = find(x); y = find(y);
		if(x == y) return;
		if(rank[x] < rank[y]) {
			int tmp = x; x = y; y = tmp;
			w -= w;
		}
		par[y] = x;
		diff_weight[y] = w;
		return;
	}

	public int diff(int x, int y) {
		return weight(y) - weight(x);
	}

}
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		UnionFind uf = new UnionFind(N);
		boolean isOk = true;
		for(int i = 0; i < M; i++) {
			int L = sc.nextInt(), R = sc.nextInt(), W = sc.nextInt();
			if(uf.same(L - 1, R - 1)) {
				int diff = uf.diff(L - 1, R - 1);
				if(diff != W) isOk = false;
			}else {
				uf.unite(L - 1, R - 1, W);
			}
		}
		System.out.println(isOk ? "Yes" : "No");
	}
}
