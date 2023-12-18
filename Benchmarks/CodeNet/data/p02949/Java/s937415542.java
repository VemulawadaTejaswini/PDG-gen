import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ECoinsRespawn solver = new ECoinsRespawn();
        solver.solve(1, in, out);
        out.close();
    }

    static class ECoinsRespawn {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int p = in.nextInt();
            long dp[] = new long[n + 1];
            ArrayList<node> a = new ArrayList<>();
            for (int i = 0; i < n + 1; i++) dp[i] = Integer.MAX_VALUE;
            dp[0] = dp[1] = 0;
            for (int i = 0; i < m; i++) a.add(new node(in.nextInt(), in.nextInt(), -1 * in.nextInt() + p));
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < m; j++) {
                    node edge = a.get(j);
                    dp[edge.v] = Math.min(dp[edge.v], dp[edge.u] + edge.cost);
                }
            }
            long temp = dp[n];
            for (int i = 0; i < n + 2; i++) {
                for (int j = 0; j < m; j++) {
                    node edge = a.get(j);
                    dp[edge.v] = Math.min(dp[edge.v], dp[edge.u] + edge.cost);
                }
            }
            if (temp > dp[n]) {
                out.println(-1);
                return;
            }
            if (dp[n] == Integer.MAX_VALUE) {
                out.println(-1);
                return;
            }
            if (dp[n] > 0) out.print(0);
            else out.print(-1 * dp[n]);
        }

        class node {
            int u;
            long cost;
            int v;
            boolean valid = false;

            node(int u, int v, long cost) {
                this.u = u;
                this.v = v;
                this.cost = cost;
                this.valid = false;
            }

        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

