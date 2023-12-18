import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

    static final Scanner in = new Scanner(System.in);
    static final PrintWriter out = new PrintWriter(System.out,false);
    static boolean debug = false;

    static int[][] undirectedGraph(int n, int[] v1, int[] v2) {
		int[] cnt = new int[n];
		for (int i : v1) cnt[i]++;
		for (int i : v2) cnt[i]++;

		int[][] g = new int[n][];
		for (int i=0; i<n; i++) g[i] = new int[cnt[i]];
		for (int i=0; i<v1.length; i++) {
			int s = v1[i];
			int t = v2[i];
			g[s][--cnt[s]] = t;
			g[t][--cnt[t]] = s;
		}

		return g;
	}

    static boolean[] visited;
    static int[][] g;

    static ArrayList<Integer> list = new ArrayList<>();

    static void rec(int cur) {
        list.add(cur);
        visited[cur] = true;
        for (int to : g[cur]) {
            if (visited[to]) continue;
            rec(to);
            break;
        }
    }

    static void solve() {
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        for (int i=0; i<m; i++) {
            a[i] = in.nextInt() - 1;
            b[i] = in.nextInt() - 1;
        }
        g = undirectedGraph(n, a, b);
        visited = new boolean[n];
        rec(0);
        visited = new boolean[n];
        int start = list.get(list.size()-1);
        list = new ArrayList<>();
        rec(start);
        boolean f = true;
        for (int to : g[start]) {
            if (!visited[to]) f = false;
        }
        int end = list.get(list.size()-1);
        boolean f2 = true;
        for (int to : g[end]) {
            if (!visited[to]) f2 = false;
        }

        if (!f && !f2) {
            Random rand = new Random();
            int x = rand.nextInt(n);
            while (x == start || x == end) {
                x = rand.nextInt(n);
            }
            visited = new boolean[n];
            list = new ArrayList<>();
            rec(x);
        }

        out.println(list.size());
        for (int i=0; i<list.size()-1; i++) {
            out.print((list.get(i)+1)+" ");
        }
        out.println((list.get(list.size()-1)+1));
    }

    public static void main(String[] args) {
        debug = args.length > 0;
        long start = System.nanoTime();

        solve();
        out.flush();

        long end = System.nanoTime();
        in.close();
        out.close();
    }

    static void dump(Object... o) { if (debug) System.err.println(Arrays.deepToString(o)); }
}