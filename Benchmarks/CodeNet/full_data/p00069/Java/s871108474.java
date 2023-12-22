
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
			if(n==0) break;
			int m=sc.nextInt()-1, c=sc.nextInt()-1, d=sc.nextInt();
			int g[] = new int[n];
			for(int i=0;i<n;i++) g[i] = i;
			HashSet<P> s = new HashSet<P>();
			for(int i=0;i<d;i++) {
				int l = Integer.valueOf((new StringBuilder(sc.next()).reverse().toString()), 2) << 1;
				for(int j=1;j<=n-1;j++) {
					if(((l>>j)&1) == 1) {
						swap(g, j,  j-1);
					}
					else if( ((l>>(j-1))&1) == 0 && ((l>>(j+1))&1) == 0 ){
						s.add(new P(g[j], g[j-1], i, j));
					}
				}
			}
//			debug(g);
			if( g[c] == m ) System.out.println(1);
			else {
				int t = g[c];
				if( t < m ) {
					int tmp = t; 
					t = m;
					m = tmp;
				}
				boolean f = false;
				for(P p: s) {
					if( p.v1 == m && p.v2 == t ) {
						System.out.println((p.x+1) + " " + p.y);
						f = true;
					}
				}
				if(!f) System.out.println(0);
			}
		}
	}
	
	void swap(int[] s, int a, int b) {
		int tmp = s[a];
		s[a] = s[b];
		s[b] = tmp;
	}
	
	class P {
		int v1, v2;
		int x, y;
		P(int v1, int v2, int x, int y) {
			this.v1 = min(v1, v2); this.v2 = max(v1, v2);
			this.x = x; this.y = y;
		}
		
		public boolean equals(Object o) {
			if( o instanceof P) {
				return v1 == ((P)o).v1 && v2 == ((P)o).v2;
			}
			return false;
		}
		
		public int hashCode() {
			return v1*100 + v2;
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}