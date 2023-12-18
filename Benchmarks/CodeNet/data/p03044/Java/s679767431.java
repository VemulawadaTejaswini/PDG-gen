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
        DEvenRelation solver = new DEvenRelation();
        solver.solve(1, in, out);
        out.close();
    }

    static class DEvenRelation {
        public void dfs(ArrayList<node> a[], boolean ans[], int root, int parent) {

            for (node x : a[root]) {

                if (x.u != parent) {
                    if (x.w % 2 == 0 && parent != -1) {

                        ans[x.u] = ans[root];
                    } else if (parent != -1) {
                        ans[x.u] = !ans[root];
                    }
                    dfs(a, ans, x.u, root);
                }
            }
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            ArrayList<node> a[] = new ArrayList[n];
            boolean ans[] = new boolean[n];
            for (int i = 0; i < n; i++) a[i] = new ArrayList<node>();
            for (int i = 0; i < n - 1; i++) {
                int u = in.nextInt() - 1;
                int v = in.nextInt() - 1;
                int w = in.nextInt();
                a[u].add(new node(v, w));
                a[v].add(new node(u, w));
            }
            dfs(a, ans, 0, -1);
            for (int i = 0; i < n; i++) out.println(ans[i] ? 1 : 0);
        }

        class node {
            int u;
            int w;

            node(int u, int w) {
                this.u = u;
                this.w = w;
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

