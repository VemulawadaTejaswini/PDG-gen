
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
		int n = sc.nextInt(), m = sc.nextInt();
		P[] ps = new P[m];
		for (int i=0;i<m;i++) {
			ps[i] = new P(i, sc.nextInt() - 1, sc.nextInt() - 1, sc.nextInt());
		}

		sort(ps);
		UF uf = new UF(n);
		int c = 0, cost = 0;
		int[] eid = new int[n-1], ecost = new int[n-1];
		for (P p : ps) if (! uf.same(p.f, p.t)){
			eid[c] = p.id; ecost[c++] = p.c;
			cost += p.c;
			uf.unite(p.f, p.t);
		}
		
//		debug(eid, ecost);
		
		int ansn = 0, ansc = 0;
		for (int i=0;i<n-1;i++) {
			uf = new UF(n);
			c = 0;
			int _cost = 0;
			for (P p : ps) if (! uf.same(p.f, p.t) && p.id != eid[i]){
				_cost += p.c;
				uf.unite(p.f, p.t);
				c++;
			}
//			debug(i, c, _cost);
			if (c == n-1 && _cost == cost) continue;
			ansn++; ansc += ecost[i];
		}
		System.out.println(ansn + " " + ansc);
	}

	class P implements Comparable<P>{
		int id, f, t, c;
		P(int id, int f, int t, int c) {
			this.f = f;this.t  = t;this.c = c;
			this.id = id;
		}
		public int compareTo(P o) {
			// TODO 自動生成されたメソッド・スタブ
			return c - o.c;
		}
		public String toString() {
			return id + " " + f + " " + t + " " + c;
		}
	}

	class UF {
		int[] par, rank;

		public UF(int n) {
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

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}