import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	public static int[][][] directedGraph(int n, int[] s, int[] t, int[] cost) {
		int[] cnt = new int[n];
		for (int i : s) cnt[i]++;

		int[][][] g = new int[n][][];
		for (int i=0; i<n; i++) g[i] = new int[cnt[i]][2];
		for (int i=0; i<s.length; i++) {
			int from = s[i];
			int to = t[i];

			g[from][--cnt[from]][0] = to;
			g[from][cnt[from]][1] = cost[i];
		}

		return g;
	}

	public static long[] dijkstra(int[][][] g, int source) {
		int n = g.length;

		final long[] d = new long[n];
		Arrays.fill(d, Integer.MAX_VALUE/2);
		d[source] = 0;

		TreeSet<Integer> pQ = new TreeSet<Integer>(new Comparator<Integer>(){
			public int compare(Integer a, Integer b) {
				if (d[a] != d[b]) return d[a] > d[b] ? 1 : -1;
				return a > b ? 1 : -1;
			}
		});
		pQ.add(source);

		while (!pQ.isEmpty()) {
			int cur = pQ.pollFirst();

			for (int i=0; i<g[cur].length; i++) {
				int next = g[cur][i][0];
				long dist = d[cur] + g[cur][i][1];
				if (dist < d[next]) {
					pQ.remove(next);
					d[next] = dist;
					pQ.add(next);
				}
			}
		}

		return d;
	}

	static boolean solve() {
		int n = in.nextInt();
		int m = in.nextInt();
		int s = in.nextInt() - 1;
		int g1 = in.nextInt() - 1;
		int g2 = in.nextInt() - 1;
		if (n + m == 0) return false;

		int[] v1 = new int[m];
		int[] v2 = new int[m];
		int[] c = new int[m];
		for (int i=0; i<m; i++) {
			v1[i] = in.nextInt() - 1;
			v2[i] = in.nextInt() - 1;
			c[i] = in.nextInt();
		}

		int[][][] g = directedGraph(n, v1, v2, c);
		long[] ds = dijkstra(g, s);

		long ans = ds[g1] + ds[g2];

		for (int i=0; i<n; i++) {
			if (i == s) continue;
			long[] d = dijkstra(g, i);
			ans = Math.min(ans, ds[i] + d[g1] + d[g2]);
		}

		out.println(ans);

		return true;
	}



	public static void main(String[] args) {
		debug = args.length > 0;
		long start = System.currentTimeMillis();

		while(solve());
		out.flush();

		long end = System.currentTimeMillis();
		dump((end-start) + "ms");
		in.close();
		out.close();
	}

	static void dump(Object... o) { if (debug) System.err.println(Arrays.deepToString(o)); }
}