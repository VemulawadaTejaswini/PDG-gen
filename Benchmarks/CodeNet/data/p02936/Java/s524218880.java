import java.util.*;
import java.io.*;

public class Main {
    private static ArrayList<Integer>[] g;
    private static long[] val, inc;
    private static int n, q;
    public static void main(String[] args) {
        Kattio in = new Kattio(System.in);
        n = in.nextInt();
        q = in.nextInt();

        g = new ArrayList[n + 1];
        for (int i = 0; i <= n; ++i) {
            g[i] = new ArrayList<>();
        }

        val = new long[n + 1];
        inc = new long[n + 1];
        for (int i = 0; i < n - 1; ++i) {
            int a = in.nextInt();
            int b = in.nextInt();

            g[a].add(b);
            g[b].add(a);
        }

        for (int i = 0; i < q; ++i) {
            int p = in.nextInt();
            long x = in.nextInt();

            inc[p] += x;
        }

        dfs(1, -1, 0l);
        for (int i = 1; i <= n; ++i) {
            in.print(val[i] + " ");
        } in.println(); 

        in.close();
        in.flush();
    }

    private static void dfs(int u, int p, long acc) {
        acc += inc[u];
        val[u] = acc;
        for (int v : g[u]) if (v != p) {
            dfs(v, u, acc);
        }
    }

}


class Kattio extends PrintWriter {
    public Kattio(InputStream i) {
	super(new BufferedOutputStream(System.out));
	r = new BufferedReader(new InputStreamReader(i));
    }
    public Kattio(InputStream i, OutputStream o) {
	super(new BufferedOutputStream(o));
	r = new BufferedReader(new InputStreamReader(i));
    }

    public boolean hasMoreTokens() {
	return peekToken() != null;
    }

    public int getInt() {
	return Integer.parseInt(nextToken());
    }

    public double getDouble() { 
	return Double.parseDouble(nextToken());
    }

    public long getLong() {
	return Long.parseLong(nextToken());
    }

    public String getWord() {
	return nextToken();
    }



    private BufferedReader r;
    private String line;
    private StringTokenizer st;
    private String token;

    private String peekToken() {
	if (token == null) 
	    try {
		while (st == null || !st.hasMoreTokens()) {
		    line = r.readLine();
		    if (line == null) return null;
		    st = new StringTokenizer(line);
		}
		token = st.nextToken();
	    } catch (IOException e) { }
	return token;
    }

    private String nextToken() {
        String ans = peekToken();
        token = null;
        return ans;
    }

    public int nextInt() {
        return Integer.parseInt(getWord());
    }

}