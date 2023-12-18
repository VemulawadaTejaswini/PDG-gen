import java.util.*;

public class Main {
	public static class UnionFind {
		int[] param;
		int[] rank;
		int N;
		int xlen;
		
		public UnionFind(int n) {
			N=n;
			param = new int[N];
			rank = new int[N];
			for(int i=0; i<N; i++)
				param[i] = i;
		}
		
		public void init() {
			for(int i=0; i<N; i++)
				param[i] = i;
			Arrays.fill(rank, 0);
		}
		
		public UnionFind(int x, int y) {
			this(x*y);
			xlen=y;
		}
		
		public boolean same(int a, int b) {
			return getRoot(a)==getRoot(b);
		}
		
		public int getRoot(int a) {
			if(param[a]==a) return a;
			else return (param[a] = getRoot(param[a]));
		}
		
		public void unite(int a, int b) {
			a = getRoot(a);
			b = getRoot(b);
			if(a==b)
				return;
			
			if(rank[a] < rank[b]) {
				param[a] = b;
			} else {
				param[b] = a;
				if(rank[a]==rank[b])
					rank[a]++;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		UnionFind uf = new UnionFind(N);
		int[] speaker = new int[M];
		Arrays.fill(speaker, -1);
		
		for(int i=0; i<N; i++) {
			int K = sc.nextInt();
			for(int j=0; j<K; j++) {
				int L = sc.nextInt()-1;
				if(speaker[L]>=0)
					uf.unite(speaker[L], i);
				else
					speaker[L] = i;
			}
		}
		boolean ok = true;
		for(int i=1; i<N; i++)
			if(!uf.same(0, i))
				ok = false;
		
		System.out.println(ok ? "YES" : "NO");
		sc.close();
	}
}
