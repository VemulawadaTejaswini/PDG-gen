import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.Set;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

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
            TaskC.Vertex done = new TaskC.Vertex();
            int n = in.nextInt();
            int m = in.nextInt();
            TaskC.Vertex[] vs = new TaskC.Vertex[n];
            for (int i = 0; i < n; ++i) {
                vs[i] = new TaskC.Vertex();
            }
            for (int i = 0; i < m; ++i) {
                TaskC.Vertex a = vs[in.nextInt() - 1];
                TaskC.Vertex b = vs[in.nextInt() - 1];
                a.adj.add(b);
                b.adj.add(a);
            }
            for (TaskC.Vertex v : vs)
                if (v.adj.size() % 2 != 0) {
                    out.println("No");
                    return;
                }
            outer:
            for (int i = 0; i < 3; ++i) {
                for (TaskC.Vertex v : vs) v.state = 0;
                for (TaskC.Vertex v : vs)
                    if (!v.adj.isEmpty()) {
                        if (v.removeCycle(null, done) != done) throw new RuntimeException();
                        continue outer;
                    }
                out.println("No");
                return;
            }
            out.println("Yes");
        }

        static class Vertex {
            int state = 0;
            Set<TaskC.Vertex> adj = new HashSet<>();

            public TaskC.Vertex removeCycle(TaskC.Vertex parent, TaskC.Vertex done) {
                state = 1;
                for (TaskC.Vertex v : adj)
                    if (v != parent) {
                        if (v.state == 1) {
                            adj.remove(v);
                            v.adj.remove(this);
                            return v;
                        } else if (v.state == 0) {
                            TaskC.Vertex got = v.removeCycle(this, done);
                            if (got == done) {
                                return done;
                            }
                            if (got != null) {
                                adj.remove(v);
                                v.adj.remove(this);
                                if (got == this) return done;
                                else return got;
                            }
                        }
                    }
                state = 2;
                return null;
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

