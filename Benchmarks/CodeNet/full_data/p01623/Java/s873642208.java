
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
			int n = sc.nextInt(), m = sc.nextInt();
			if((n|m) == 0) break;
			
			HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
			for(int i=0;i<n;i++) {
				int h = sc.nextInt();
				if(map.containsKey(h))
					map.get(h).add(i);
				else {
					ArrayList<Integer> list = new ArrayList<Integer>();
					list.add(i);
					map.put(h, list);
				}
			}
			
			Sink[] sink = new Sink[map.size()]; int p=0;
			for(Map.Entry<Integer, ArrayList<Integer>> entry: map.entrySet()) {
				sink[p++] = new Sink(entry.getKey(), entry.getValue());
			}
			sort(sink);
			
			G[] g = new G[n];
			for(int i=0;i<n;i++) g[i] = new G();
			E[] es = new E[m];
			
			for(int i=0;i<m;i++) {
				int a = sc.nextInt()-1, b = sc.nextInt()-1, c = sc.nextInt();
				g[a].add(new E(a, b, c));
				g[b].add(new E(b, a, c));
				es[i] = new E(a, b, c);
			}
			
			UF uf = new UF(n);
			boolean[] used = new boolean[n];
			ArrayList<Integer> l = new ArrayList<Integer>();
			int con = 0;
			for(p=0;p<sink.length;p++) {
				for(int v: sink[p].l) {
					used[v] = true;
					l.add(v);
				}
				for(int v: sink[p].l) for(E e: g[v])if(used[e.f] && used[e.t]){
					uf.unite(e.f, e.t);
				}
				
				boolean flg = true;
				int val = uf.find(l.get(0));
				for(int i: l) flg &= val == uf.find(i);
				if(!flg) con = p;
			}
			fill(used, false);
			if(con==sink.length-1) {
				System.out.println(0);
				continue;
			}
			for(int i=0;i<con+2;i++){
				for(int j: sink[i].l)used[j] = true;
			}
			uf = new UF(n);
			sort(es);
			int ans = 0;
			for(int i=con+2;;i++) {
				for(E e: es) if(used[e.f] && used[e.t] && !uf.same(e.f, e.t)) {
					uf.unite(e.f, e.t);
					ans += e.c;
				}
				if(i>=sink.length) break;
				for(int j: sink[i].l) used[j] = true;
			}
			System.out.println(ans);
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
	
	class G extends ArrayList<E>{}
	
	class E implements Comparable<E>{
		int f, t, c;
		E(int f, int t, int c) {
			this.f = f; this.t = t;
			this.c = c;
		}
		@Override
		public int compareTo(E o) {
			// TODO 自動生成されたメソッド・スタブ
			return c - o.c;
		}
	}
	
	class Sink implements Comparable<Sink>{
		int d; ArrayList<Integer> l;
		Sink(int d, ArrayList<Integer> l) {
			this.d = d;
			this.l = l;
		}
		public int compareTo(Sink o) {
			return o.d - d;
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}