import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.AbstractCollection;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author rizhiy
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        int inf = 1234567890;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            n++;
            int m = in.nextInt();
            ArrayList<p>[] g = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                g[i] = new ArrayList<>();
            }
            int[] dp = new int[n];
            for (int i = 0; i < n; i++) {
                dp[i] = inf;
            }
            for (int i = 0; i < m; i++) {
                int l = in.nextInt();
                int r = in.nextInt();
                int d = in.nextInt();
                g[l].add(new p(r, d));
                g[r].add(new p(l, -d));
            }
            for (int i = 0; i < n; i++) {
                if (dp[i] == inf) {
                    LinkedList<Integer> q = new LinkedList<>();
                    q.push(i);
                    dp[i] = 0;
                    while (!q.isEmpty()) {
                        int v = q.pop();
                        for (p j : g[v]) {
                            if (dp[j.n] == inf) {
                                dp[j.n] = dp[v] + j.c;
                                q.push(j.n);
                            } else if (dp[j.n] != dp[v] + j.c) {
                                out.println("No");
                                return;
                            }
                        }
                    }
                }
            }
            out.println("Yes");
        }

        class p {
            int n;
            int c;

            p(int n, int c) {
                this.n = n;
                this.c = c;
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

