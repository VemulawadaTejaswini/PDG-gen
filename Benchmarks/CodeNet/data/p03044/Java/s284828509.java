import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Queue;
import java.io.BufferedReader;
import java.util.LinkedList;
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
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            ArrayList<node> a[] = new ArrayList[n + 1];
            boolean ans[] = new boolean[n + 1];
            boolean visited[] = new boolean[n + 1];
            for (int i = 0; i <= n; i++) a[i] = new ArrayList<node>();
            for (int i = 0; i < n - 1; i++) {
                int u = in.nextInt();
                int v = in.nextInt();
                int w = in.nextInt();
                a[u].add(new node(u, v, w));
                a[v].add(new node(v, u, w));
            }
            Queue<Integer> q = new LinkedList<Integer>();
            q.add(1);
            while (q.size() > 0) {
                int r = q.poll();
                if (visited[r] == true) {
                    continue;
                }
                visited[r] = true;
                for (node x : a[r]) {
                    q.add(x.v);
                    if (x.w % 2 == 0) {
                        ans[x.v] = ans[r];
                    } else {
                        ans[x.v] = !ans[r];
                    }
                }
            }
            for (int i = 1; i <= n; i++) out.println(ans[i] ? 1 : 0);
        }

        class node {
            int u;
            int w;
            int v;

            node(int u, int v, int w) {
                this.u = u;
                this.v = v;
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

