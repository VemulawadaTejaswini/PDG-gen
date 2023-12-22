import static java.lang.Math.*;
import static java.util.Arrays.*;

import java.util.*;
import java.io.*;

public class Main {
	int n;
	P h, d;
	P[] c;
	int INF = 1<<28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt(); d = new P(sc.nextInt(), sc.nextInt()); h = new P(sc.nextInt(), sc.nextInt());
			if( (n|h.x|h.y|d.x|d.y) == 0 ) break;
			
			c = new P[n];
			for(int i=0;i<n;i++) c[i] = new P(sc.nextInt(), sc.nextInt());
			System.out.println((solve()? "YES": "NO"));
		}
	}
	
	boolean solve() {
		int[] mem = new int[1<<n];
		fill(mem, INF); mem[0] = 0;
		PriorityQueue<P> que = new PriorityQueue<P>();
		que.add(d);
		for(;!que.isEmpty();) {
			P cur = que.remove();
			debug(cur.x, cur.y, cur.t, Integer.toString(cur.b, 2));
			if( mem[cur.b] != cur.t ) continue;
			if( cur.b == (1<<n)-1 ) return true;
			boolean f = true;
			for(int i=0;i<n;i++) if(((cur.b>>i)&1) == 0) {
				int ht = abs(c[i].x - h.x) + abs(c[i].y-h.y);
				int dt = abs(c[i].x - cur.x) + abs(c[i].y-cur.y) + cur.t;
				debug(ht, dt);
				f &= ht > dt;
			}
			if( !f ) continue;
			for(int i=0;i<n;i++) if(((cur.b>>i)&1) == 0) {
				int dt = abs(c[i].x - cur.x) + abs(c[i].y-cur.y) + cur.t;
				if( mem[cur.b | 1<<i] > dt ) {
					mem[cur.b | 1<<i] = dt;
					que.add(new P( c[i].x, c[i].y, dt, cur.b |= 1<<i ));
				}
			}
		}
		return false;
	}
	
	class P implements Comparable<P>{
		int x, y, t, b;
		P(int x, int y) {
			this.x = x;
			this.y = y;
			t = 0;
			b = 0;
		}
		
		P(int x, int y, int t, int b) {
			this.x = x;
			this.y = y;
			this.t = t;
			this.b = b;
		}
		
		public int compareTo(P p) {
			// TODO 自動生成されたメソッド・スタブ
			return t - p.t;
		}
	}
	
	void debug(Object... os) {
//		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}