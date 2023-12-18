import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        static final long MODULO = (long) (1e9 + 7);

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            TaskD.Vertex[] vs = new TaskD.Vertex[n];
            for (int i = 0; i < n; ++i) {
                vs[i] = new TaskD.Vertex();
            }
            for (int i = 0; i < n - 1; ++i) {
                TaskD.Vertex a = vs[in.nextInt() - 1];
                TaskD.Vertex b = vs[in.nextInt() - 1];
                a.adj.add(b);
                b.adj.add(a);
            }

            List<TaskD.Vertex> leaves = new ArrayList<>();
            for (TaskD.Vertex v : vs) {
                v.deg = v.adj.size();
                if (v.deg == 1) {
                    leaves.add(v);
                }
            }
            int remains = n;
            int diameter = 0;
            while (remains > 2) {
                diameter += 2;
                if (leaves.size() == remains) throw new RuntimeException();
                remains -= leaves.size();
                List<TaskD.Vertex> newLeaves = new ArrayList<>();
                for (TaskD.Vertex v : leaves) {
                    for (TaskD.Vertex u : v.adj) {
                        --u.deg;
                        if (u.deg == 1) {
                            newLeaves.add(u);
                        }
                    }
                }
                leaves = newLeaves;
            }
            if (remains != leaves.size()) throw new RuntimeException();
            diameter += remains - 1;
            int allowed = (diameter + 1) / 2;
            if (remains == 1) {
                TaskD.Vertex a = leaves.get(0);
                for (TaskD.Vertex u : a.adj) {
                    u.solve(a, allowed, true);
                }
                long res = 0;
                for (int maxDown = 0; maxDown <= allowed; ++maxDown) {
                    long p = 1;
                    for (TaskD.Vertex u : a.adj) {
                        p = p * u.res[maxDown] % MODULO;
                    }
                    res = (res + p) % MODULO;
                }
                out.println(res);
            } else if (remains == 2) {
                TaskD.Vertex a = leaves.get(0);
                TaskD.Vertex b = leaves.get(1);
                long res = 0;
                a.solve(b, allowed + 1, false);
                int[] ap1 = a.res;
                a.solve(b, allowed, false);
                int[] ap0 = a.res;
                b.solve(a, allowed + 1, false);
                int[] bp1 = b.res;
                b.solve(a, allowed, false);
                int[] bp0 = b.res;
                for (int maxDown = 0; maxDown < allowed; ++maxDown) {
                    res = (res + ap0[maxDown] * (long) bp0[maxDown]) % MODULO;
                }
                for (int maxDown = 0; maxDown < allowed; ++maxDown) {
                    res = (res + 2 * ap0[maxDown] * (long) (bp1[maxDown] - bp0[maxDown])) % MODULO;
                }
                for (int maxDown = 0; maxDown < allowed; ++maxDown) {
                    res = (res + 2 * bp0[maxDown] * (long) (ap1[maxDown] - ap0[maxDown])) % MODULO;
                }
                res = (res + MODULO) % MODULO;
                out.println(res);
            } else throw new RuntimeException();
        }

        static class Vertex {
            List<TaskD.Vertex> adj = new ArrayList<>();
            int deg;
            int[] res;

            public void solve(TaskD.Vertex parent, int allowed, boolean extraEdge) {
                int[] children = new int[allowed];
                Arrays.fill(children, 1);
                for (TaskD.Vertex u : adj)
                    if (u != parent) {
                        u.solve(this, allowed - 1, true);
                        for (int cnt = 0; cnt < allowed; ++cnt) {
                            children[cnt] = (int) (children[cnt] * (long) u.res[cnt] % MODULO);
                        }
                    }
                if (extraEdge) {
                    res = new int[allowed + 1];
                    for (int i = 0; i < allowed; ++i) {
                        res[i] = (int) ((res[i] + children[i]) % MODULO);
                        res[i + 1] = (int) ((res[i + 1] + children[i]) % MODULO);
                    }
                } else {
                    res = children;
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

