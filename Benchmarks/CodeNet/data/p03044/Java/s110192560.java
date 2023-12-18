import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author __shangu__
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
            Vertex[] g = new Vertex[n];
            for (int i = 0; i < n; ++i) g[i] = new Vertex();
            for (int i = 0; i < n - 1; ++i) {
                Vertex u = g[in.nextInt() - 1];
                Vertex v = g[in.nextInt() - 1];
                int w = in.nextInt();
                u.adj.add(new Edge(v, w));
                v.adj.add(new Edge(u, w));
            }
            g[0].color = 0;
            dfs(g[0]);
            for (int i = 0; i < n; ++i) out.println(g[i].color);
        }

        private void dfs(Vertex cur) {
            for (Edge e : cur.adj) {
                if (e.to.color == -1) {
                    if (e.w % 2 == 0) e.to.color = cur.color;
                    else e.to.color = 1 - cur.color;
                    dfs(e.to);
                }
            }
        }

        class Vertex {
            int color = -1;
            List<Edge> adj = new ArrayList<>();

        }

        private class Edge {
            int w;
            Vertex to;

            Edge(Vertex v, int weight) {
                to = v;
                w = weight;
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

