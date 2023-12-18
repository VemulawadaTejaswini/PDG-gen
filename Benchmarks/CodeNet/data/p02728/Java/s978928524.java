import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeSet;

import javax.swing.*;

import static java.util.Arrays.binarySearch;
import static java.util.Arrays.copyOfRange;

public class Main {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;

        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }
}

class Task {

    private static int mod = 1000000007;

    int n;
    long[] fac;

    public long powMod(long a, long b) {
        long ans = 1, d = a % mod;
        while (b > 0) {
            if (b % 2 == 1) {
                ans = ans * d % mod;
            }
            b >>= 1;
            d = d * d % mod;
        }
        return ans;
    }

    public long getC(int n, int m) {
        return fac[n] * powMod(fac[m], mod - 2) % mod * powMod(fac[n - m], mod - 2) % mod;
    }

    public void solve(int testNumber, InputReader in, PrintWriter out) {
        n = in.nextInt();
        Vertex[] vec = new Vertex[n];
        fac = new long[n + 1];
        for (int i = 0; i < n; i++) {
            vec[i] = new Vertex();
        }
        for (int i = 0; i < n - 1; i++) {
            Vertex x = vec[in.nextInt() - 1];
            Vertex y = vec[in.nextInt() - 1];
            x.adj.add(y);
            y.adj.add(x);
        }
        fac[0] = 1L;
        for (int i = 1; i <= n; i++) {
            fac[i] = fac[i - 1] * i % mod;
        }
        vec[0].dfs(null);
        vec[0].dfs2(null);
        for (int i = 0; i < n; i++) {
            out.println(vec[i].ans);
        }
    }

    class Vertex {
        List<Vertex> adj = new ArrayList<>();
        int cnt;
        long ans;

        public void dfs2(Vertex parent) {
            if (parent != null) {
                ans = parent.ans * powMod(getC(n - 1, cnt), mod - 2) % mod * getC(n - 1, n - cnt) % mod;
            }
            for (Vertex v : adj) {
                if (v != parent) {
                    v.dfs2(this);
                }
            }
        }

        public int dfs(Vertex parent) {
            cnt = 1;
            ans = 1;
            for (Vertex v : adj) {
                if (v != parent) {
                    cnt += v.dfs(this);
                }
            }
            int nn = cnt - 1;
            for (Vertex v : adj) {
                if (v != parent) {
                    ans = ans * getC(nn, v.cnt) % mod * v.ans % mod;
                    nn -= v.cnt;
                }
            }
            return cnt;
        }

    }

}

class InputReader {

    private final BufferedReader reader;
    private StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream));
        tokenizer = null;
    }

    public String nextLine() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(nextLine());
        }
        return tokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

}
