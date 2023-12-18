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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            TaskC.Vertex[] vs = new TaskC.Vertex[n];
            for (int i = 0; i < n; ++i) vs[i] = new TaskC.Vertex();
            for (int i = 0; i < n - 1; ++i) {
                TaskC.Vertex a = vs[in.nextInt() - 1];
                TaskC.Vertex b = vs[in.nextInt() - 1];
                a.adj.add(b);
                b.adj.add(a);
            }
            TaskC.Vertex f = dfs(vs[0], vs);
            TaskC.Vertex q = dfs(f, vs);
            int diam = q.dist;
            if (diam % 3 == 1) {
                out.println("Second");
            } else {
                out.println("First");
            }
        }

        private TaskC.Vertex dfs(TaskC.Vertex start, TaskC.Vertex[] vs) {
            for (TaskC.Vertex v : vs) {
                v.dist = -1;
            }
            start.dist = 0;
            start.dfs(null);
            TaskC.Vertex res = start;
            for (TaskC.Vertex v : vs) {
                if (v.dist > res.dist) {
                    res = v;
                }
            }
            return res;
        }

        static class Vertex {
            int dist;
            List<TaskC.Vertex> adj = new ArrayList<>();

            public void dfs(TaskC.Vertex parent) {
                for (TaskC.Vertex u : adj)
                    if (u != parent) {
                        u.dist = dist + 1;
                        u.dfs(this);
                    }
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

