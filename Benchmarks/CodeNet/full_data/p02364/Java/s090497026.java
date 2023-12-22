import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static int prim(int[][] g) {
		int n = g.length;
		BitSet used = new BitSet();
		int[] cost = new int[n];
		Arrays.fill(cost, 1<<29);
		int res = 0;
		cost[0] = 0;

		while(true) {
			int v = -1;
			for (int i=0; i<n; i++) {
				if (!used.get(i) && (v == -1 || cost[i] < cost[v])) v = i;
			}

			if (v == -1) break;
			used.set(v);
			res += cost[v];
			for (int i=0; i<n; i++) {
				cost[i] = Math.min(cost[i], g[v][i]);
			}
		}

		return res;
	}

	static void solve() {
		int v = in.nextInt();
		int e = in.nextInt();
		int[] s = new int[e];
		int[] t = new int[e];
		int[] w = new int[e];
		int[][] g = new int[v][v];
		for (int i=0; i<v; i++) {
			Arrays.fill(g[i], 1<<29);
		}
		for (int i=0; i<e; i++) {
			s[i] = in.nextInt();
			t[i] = in.nextInt();
			w[i] = in.nextInt();
			g[s[i]][t[i]] = g[t[i]][s[i]] = w[i];
		}
		out.println(prim(g));
	}

	public static void main(String[] args) {
		debug = args.length > 0;
		long start = System.nanoTime();

		solve();
		out.flush();

		long end = System.nanoTime();
		dump((end - start) / 1000000 + " ms");
		in.close();
		out.close();
	}

	static void dump(Object... o) { if (debug) System.err.println(Arrays.deepToString(o)); }
}