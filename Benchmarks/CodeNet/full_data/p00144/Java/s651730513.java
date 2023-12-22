
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	
	int n;
	boolean[][] es;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		es = new boolean[n][n];
		for (int i=0;i<n;i++) {
			int r = sc.nextInt()-1, k = sc.nextInt();
			for (int j=0;j<k;j++) {
				int t = sc.nextInt()-1;
				es[r][t] = true;
			}
		}
		int p = sc.nextInt();
		for (int i=0;i<p;i++) {
			int s = sc.nextInt()-1, t = sc.nextInt()-1, v = sc.nextInt();
			System.out.println(bfs(s,t,v));
		}
	}
	
	String bfs(int s, int t, int v) {
		LinkedList<V> q = new LinkedList<V>();
		q.add(new V(s, v-1));
		boolean[] used = new boolean[n];
		used[s] = true;
		for (;! q.isEmpty();) {
			V cur = q.removeFirst();
			if (t == cur.p) return "" + (v - cur.c);
			if (cur.c == 0) continue;
			for (int i=0;i<n;i++) if (! used[i] && es[cur.p][i] ) {
				used[i] = true;
				q.add(new V(i, cur.c - 1));
			}
		}
		return "NA";
	}
	
	class V {
		int p, c;
		V(int p, int c) {
			this.p = p;
			this.c = c;
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}