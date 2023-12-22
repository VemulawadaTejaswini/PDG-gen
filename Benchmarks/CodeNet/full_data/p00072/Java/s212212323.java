
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if(n == 0) break;
			int m = sc.nextInt();
			UnionFind uf = new UnionFind(n);
			P[] ps = new P[m];
			int ans = 0;
			for(int i=0;i<m;i++) {
				String[] sp = sc.next().split(",");
				ps[i] = new P(Integer.parseInt(sp[0]), Integer.parseInt(sp[1]), Integer.parseInt(sp[2])/100 - 1);
			}
			sort(ps);
			for(P p: ps) if(!uf.same(p.f, p.t)){
				uf.unite(p.f, p.t);
				ans += p.v;
			}
			System.out.println(ans);
		}
	}
	
	public class UnionFind {
		int[] par, rank;
		
		public UnionFind(int n) {
			par = new int[n];
			rank = new int[n];
			for(int i=0;i<n;i++) par[i] = i;
		}
		
		//代表元を求める
		int find(int x) {
			if( par[x] == x ) return x;
			return par[x] = find(par[x]);
		}
		
		//要素xとyを併合する
		void unite(int x, int y) {
			x = find(x);
			y = find(y);
			if( x == y ) return;
			
			if( rank[x] < rank[y]  ) par[x] = y;
			else {
				par[y] = x;
				if( rank[x] == rank[y] ) rank[x]++;
			}
		}
		
		//同一の集合に含まれるか調べる．trueならxとyは同じ集合，falseなら異なる
		boolean same(int x, int y) {
			return find(x) == find(y);
		}
	}
	
	class P implements Comparable<P>{
		int f, t, v;
		
		P(int f, int t, int v) {
			this.f = f;
			this.t = t;
			this.v = v;
		}
		@Override
		public int compareTo(P o) {
			// TODO 自動生成されたメソッド・スタブ
			return v-o.v;
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}