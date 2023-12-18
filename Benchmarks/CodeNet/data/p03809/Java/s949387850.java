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
            for (int i = 0; i < n; ++i) vs[i] = new TaskC.Vertex(in.nextInt());
            for (int i = 0; i < n - 1; ++i) {
                TaskC.Vertex a = vs[in.nextInt() - 1];
                TaskC.Vertex b = vs[in.nextInt() - 1];
                a.adj.add(b);
                b.adj.add(a);
            }
            if (n == 2) {
                if (vs[0].stones == vs[1].stones) {
                    out.println("YES");
                } else {
                    out.println("NO");
                }
                return;
            }
            TaskC.Vertex root = null;
            for (TaskC.Vertex v : vs)
                if (v.adj.size() > 1) {
                    root = v;
                    break;
                }
            long got = root.dfs(null);
            if (got == 0) out.println("YES");
            else out.println("NO");
        }

        static class Vertex {
            long stones;
            List<TaskC.Vertex> adj = new ArrayList<>();

            public Vertex(int stones) {
                this.stones = stones;
            }

            public long dfs(TaskC.Vertex parent) {
                if (adj.size() == 1) return stones;
                long sum = 0;
                long max = 0;
                for (TaskC.Vertex v : adj) {
                    if (v == parent) continue;
                    long got = v.dfs(this);
                    if (got < 0) return got;
                    sum += got;
                    max = Math.max(max, got);
                }
                if (stones > sum) {
                    return -1;
                }
                if (stones * 2 < sum) {
                    return -1;
                }
                long connect = sum - stones;
                if (sum - max < connect) {
                    return -1;
                }
                return sum - 2 * connect;
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

