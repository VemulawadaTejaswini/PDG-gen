import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    List<Pair>[] g;
    int[] val;
    boolean[] used;
    boolean flg = true;

    void solve() throws IOException {
    	int R = ni();
		int C = ni();
		int N = ni();

		g = new List[R + C];
		for (int i=0; i<R+C; i++) {
			g[i] = new ArrayList<>();
		}

		for (int i=0; i<N; i++) {
			int r = ni() - 1;
			int c = ni() - 1;
			int a = ni();
			g[r].add(new Pair(R + c, a));
			g[R + c].add(new Pair(r, a));
		}

		used = new boolean[R + C];

		val = new int[R + C];
		for (int i=0; i<R + C; i++) {
			if (used[i]) continue;
			used[i] = true;
			dfs(i);
		}

		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		for (int i=0; i<R; i++) {
			min1 = Math.min(min1, val[i]);
		}
		for (int i=0; i<C; i++) {
			min2 = Math.min(min2, val[R+i]);
		}

		if (min1 + min2 < 0) {
			flg = false;
		}

		out.println(flg? "Yes" : "No");
    }

    void dfs(int m) {
    	int n = val[m];
    	for (Pair p : g[m]) {
    		if (used[p.x]) {
    			if (p.y - n != val[p.x]) {
    				flg = false;
    			}
    		} else {
    			val[p.x] = p.y - n;
    			used[p.x] = true;
    			// out.println(m + " -> " + p.x);
    			dfs(p.x);
    		}
    	}
    }

    public class Pair implements Comparable<Pair> {
		int x, y;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int compareTo(Pair p) {
			return x == p.x ? y - p.y : x - p.x;
		}
	}

    String ns() throws IOException {
        while (!tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine(), " ");
        }
        return tok.nextToken();
    }

    int ni() throws IOException {
        return Integer.parseInt(ns());
    }

    long nl() throws IOException {
        return Long.parseLong(ns());
    }

    double nd() throws IOException {
        return Double.parseDouble(ns());
    }

    String[] nsa(int n) throws IOException {
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = ns();
        }
        return res;
    }

    int[] nia(int n) throws IOException {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = ni();
        }
        return res;
    }

    long[] nla(int n) throws IOException {
        long[] res = new long[n];
        for (int i = 0; i < n; i++) {
            res[i] = nl();
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        tok = new StringTokenizer("");
        Main main = new Main();
        main.solve();
        out.close();
    }
}
