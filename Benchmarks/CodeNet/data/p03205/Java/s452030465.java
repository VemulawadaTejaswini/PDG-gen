import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
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
        TaskF solver = new TaskF();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskF {
        static final long INF = (long) 1e18;

        void addEdge(TaskF.Vertex a, TaskF.Vertex b, long cap) {
            TaskF.Edge ab = new TaskF.Edge();
            TaskF.Edge ba = new TaskF.Edge();
            ab.rev = ba;
            ab.dest = b;
            ab.cap = cap;
            ba.dest = a;
            ba.rev = ab;
            a.outgo.add(ab);
            b.outgo.add(ba);
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            List<TaskF.Vertex> all = new ArrayList<>();
            TaskF.Vertex s = new TaskF.Vertex();
            TaskF.Vertex t = new TaskF.Vertex();
            all.add(s);
            all.add(t);
            TaskF.Vertex[] left = new TaskF.Vertex[n];
            for (int i = 0; i < n; ++i) {
                left[i] = new TaskF.Vertex();
                left[i].tag = i + 1;
                all.add(left[i]);
                addEdge(s, left[i], 1);
            }
            for (int i = 0; i < n - 1; ++i) {
                TaskF.Vertex cur = new TaskF.Vertex();
                all.add(cur);
                cur.tag = i;
                int count = in.nextInt();
                addEdge(cur, t, 1);
                for (int j = 0; j < count; ++j) {
                    addEdge(left[in.nextInt() - 1], cur, 1);
                }
            }
            long flow = maxFlowDinic(s, t, all.size());
            if (flow != n - 1) {
                out.println(-1);
                return;
            }
            for (TaskF.Vertex v : all) {
                v.generation = 0;
                v.nextEdge = 0;
            }
            flow = maxFlowDfs(s, t);
            if (flow != 0) {
                throw new RuntimeException();
            }
            for (TaskF.Vertex v : left) {
                if (v.generation != 1) {
                    out.println(-1);
                    return;
                }
            }
            String[] res = new String[n - 1];
            for (TaskF.Vertex v : left) {
                if (v.prevInDfs == s) continue;
                TaskF.Vertex u = v.prevInDfs.prevInDfs;
                res[v.prevInDfs.tag] = v.tag + " " + u.tag;
            }
            for (String x : res) {
                out.println(x);
            }
        }

        private long maxFlowDfs(TaskF.Vertex s, TaskF.Vertex t) {
            int curGen = 0;
            long res = 0;
            while (true) {
                ++curGen;
                long by = s.dfs(t, curGen, INF);
                if (by == 0) break;
                res += by;
            }
            return res;
        }

        boolean bfs(TaskF.Vertex s, TaskF.Vertex t, TaskF.Vertex[] q, int curGen) {
            int qh = 0, qt = 0;
            q[qt++] = s;
            s.generation = curGen;
            s.dist = 0;
            while (t.generation < curGen && qh < qt) {
                TaskF.Vertex v = q[qh++];
                for (TaskF.Edge e : v.outgo) {
                    if (e.dest.generation < curGen && e.flow < e.cap) {
                        e.dest.generation = curGen;
                        q[qt++] = e.dest;
                        e.dest.dist = v.dist + 1;
                    }
                }
            }
            return t.generation == curGen;
        }

        long maxFlowDinic(TaskF.Vertex s, TaskF.Vertex t, int nv) {
            long flow = 0;
            int curGen = 0;
            TaskF.Vertex[] q = new TaskF.Vertex[nv];
            for (; ; ) {
                ++curGen;
                if (!bfs(s, t, q, curGen)) break;
                ++curGen;
                t.markDinic(curGen - 1, curGen);
                while (true) {
                    long pushed = s.dfsDinic(t, curGen, INF);
                    if (pushed == 0) break;
                    flow += pushed;
                }
            }
            return flow;
        }

        static class Edge {
            TaskF.Vertex dest;
            TaskF.Edge rev;
            long cap = 0;
            long flow = 0;

        }

        static class Vertex {
            int tag = -1;
            int generation = 0;
            int interestingGeneration = 0;
            int nextEdge = 0;
            int dist;
            TaskF.Vertex prevInDfs;
            List<TaskF.Edge> outgo = new ArrayList<>();

            long dfsDinic(TaskF.Vertex t, int curGen, long got) {
                if (got == 0) return 0;
                if (this == t) return got;
                if (interestingGeneration != curGen) return 0;
                if (generation < curGen) {
                    generation = curGen;
                    nextEdge = 0;
                }
                for (; nextEdge < outgo.size(); ++nextEdge) {
                    TaskF.Edge e = outgo.get(nextEdge);
                    if (e.dest.dist != dist + 1) continue;
                    long pushed = e.dest.dfs(t, curGen, Math.min(got, e.cap - e.flow));
                    if (pushed > 0) {
                        e.flow += pushed;
                        e.rev.flow -= pushed;
                        return pushed;
                    }
                }
                return 0;
            }

            public long dfs(TaskF.Vertex t, int curGen, long max) {
                if (this == t) return max;
                generation = curGen;
                for (int i = 0; i < outgo.size(); ++i) {
                    TaskF.Edge e = outgo.get(nextEdge);
                    if (e.flow < e.cap && e.dest.generation < curGen) {
                        long nmax = Math.min(max, e.cap - e.flow);
                        if (nmax > 0) {
                            e.dest.prevInDfs = this;
                            nmax = e.dest.dfs(t, curGen, nmax);
                            if (nmax > 0) {
                                e.flow += nmax;
                                e.rev.flow -= nmax;
                                return nmax;
                            }
                        }
                    }
                    ++nextEdge;
                    if (nextEdge == outgo.size()) nextEdge = 0;
                }
                return 0;
            }

            public void markDinic(int bfsGen, int curGen) {
                interestingGeneration = curGen;
                for (TaskF.Edge e : outgo)
                    if (e.dest.interestingGeneration < curGen && e.dest.generation == bfsGen && e.dest.dist == dist - 1 && e.rev.flow < e.rev.cap) {
                        e.dest.markDinic(bfsGen, curGen);
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

