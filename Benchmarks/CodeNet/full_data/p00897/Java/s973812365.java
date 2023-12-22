
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	V[] G; int size, cap;
	boolean[] gas;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt(), m = sc.nextInt(); cap = sc.nextInt();
			if((n|m|cap) == 0 )  break;
			
			HashMap<String, Integer> str2ind = new HashMap<String, Integer>();
			size = 2;
			str2ind.put(sc.next(), 0); str2ind.put(sc.next(), 1);
			ArrayList<E> es = new ArrayList<E>();
			
			for(int i=0;i<n;i++) {
				String from = sc.next(), to = sc.next(); int c = sc.nextInt(), f = size, t = size;
				if(str2ind.containsKey(from)) f = str2ind.get(from);
				else {
					f = size; str2ind.put(from, size++);
				}
				if(str2ind.containsKey(to)) t = str2ind.get(to);
				else {
					t = size; str2ind.put(to, size++);
				}
				
				es.add(new E(f, t, c));
			}
			
			G = new V[size];
			for(int i=0;i<size;i++) G[i] = new V();
			
			for(E e: es) {
				G[e.f].add(new E(e.f, e.t, e.c));
				G[e.t].add(new E(e.t, e.f, e.c));
			}
			
			gas = new boolean[size];
			for(int i=0;i<m;i++) {
				String p = sc.next();
				if(str2ind.containsKey(p)) gas[str2ind.get(p)] = true;
			}
			str2ind.clear();
			es.clear();
			
			System.out.println(dijkstra()); 
		}
	}
	
	int dijkstra() {
		
		HashMap<P, Integer> d = new HashMap<P, Integer>();
		
		PriorityQueue<S> que = new PriorityQueue<S>();
		que.add(new S(0, cap*10, 0)); d.put(new P(0, cap*10), 0);
		
		for(;!que.isEmpty();) {
			S cur = que.remove();
			if(d.get(new P(cur.p, cur.l) ) != cur.c) continue;
			if(cur.p == 1) return cur.c;
			
			for(E e: G[cur.p]) {
				P p = new P(e.t, cur.l-e.c);
				
				if( d.containsKey(p) ) {
					
					if(cur.l >= e.c) {
						
						if(gas[e.t]) {
							if(!d.containsKey(new P(e.t, cap*10)) || d.get(new P(e.t, cap*10)) > cur.c + e.c) {
								d.put(new P(e.t, cap * 10), cur.c + e.c);
								que.add(new S(e.t, cap * 10, cur.c + e.c));
							}
						}
						else {
							if( d.get( p ) > cur.c + e.c ) {
								d.put(p, cur.c + e.c);
								que.add(new S(e.t, cur.l - e.c, cur.c + e.c));
							}
						}
					}
				}
				else {
					if(cur.l >= e.c) {
						if(gas[e.t]) {
							if(!d.containsKey(new P(e.t, cap*10)) || d.get(new P(e.t, cap*10)) > cur.c + e.c) {
								d.put(new P(e.t, cap * 10), cur.c + e.c);
								que.add(new S(e.t, cap * 10, cur.c + e.c));
							}
						}
						else {
							d.put(p, cur.c + e.c);
							que.add(new S(e.t, cur.l - e.c, cur.c + e.c));	

						}
					}
				}
			}
		}
		
		return -1;
	}
	
	class P {
		int p, l;
		P(int p, int l) {
			this.p = p;
			this.l = l;
		}
		
		public int hashCode() {
			return p * 10000 + l;
		}
		
		public boolean equals(Object o) {
			if(o instanceof P) {
				P po = (P) o;
				return p == po.p && l == po.l;
			}
			return false;
		}
	}
	
	class S implements Comparable<S>{
		int p, l, c;
		S(int p, int l, int c) {
			this.p = p;this.l = l;this.c = c;
		}
		
		public int compareTo(S arg0) {
			// TODO Auto-generated method stub
			return c - arg0.c;
		}
	}
	
	class V extends ArrayList<E>{}
	
	class E {
		int f, t, c;
		E(int f, int t, int c) {
			this.t = t;this.f = f;this.c = c;
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}