import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.AbstractQueue;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.AbstractCollection;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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
        TaskJ solver = new TaskJ();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskJ {
        public static int[] dx = {-1, 1, 0, 0};
        public static int[] dy = {0, 0, -1, 1};

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[][] caps = new int[4][n];
            for (int i = 0; i < 4; i++) {
                caps[i] = in.readIntArray(n);
            }
            int N = n * n + 4 * n + 2;
            List<MinCostFlow.Edge>[] graph = new ArrayList[N];
            for (int i = 0; i < N; i++) graph[i] = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    MinCostFlow.addEdge(graph, n * n + 4 * j + 0, i * n + j, 1, i);
                    MinCostFlow.addEdge(graph, n * n + 4 * j + 1, i * n + j, 1, n - i);
                    MinCostFlow.addEdge(graph, n * n + 4 * i + 2, i * n + j, 1, j);
                    MinCostFlow.addEdge(graph, n * n + 4 * i + 3, i * n + j, 1, n - j);
                    MinCostFlow.addEdge(graph, i * n + j, N - 2, 1, 0);
                }
            }
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < n; j++) {
                    MinCostFlow.addEdge(graph, N - 1, n * n + 4 * j + i, caps[i][j], 0);
                }
            }

            int[] ans = MinCostFlow.minCostFlow(graph, N - 1, N - 2, n * n);
            if (ans[0] < n * n) {
                out.println("NO");
                return;
            }
            int[][] dir = new int[n][n];
            for (int i = 0; i < n * n; i++) {
                for (MinCostFlow.Edge ed : graph[i]) {
                    if (ed.to == N - 2) continue;
                    int flow = graph[ed.to].get(ed.rev).f;
                    if (flow == 1) {
                        dir[i / n][i % n] = (ed.to - n * n) % 4;
                    }
                }
            }
            int[] queue = new int[n * n];
            int back = 0;
            boolean[][] marked = new boolean[n][n];
            for (int iter = 0; iter < n * n; iter++) {
                boolean found = false;
                outer:
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (marked[i][j]) continue;
                        int d = dir[i][j];
                        int nx = i, ny = j;
                        boolean ok = true;
                        do {
                            nx += dx[d];
                            ny += dy[d];
                            if (nx < 0 || ny < 0 || nx >= n || ny >= n) break;
                            ok &= marked[nx][ny];
                        } while (ok);
                        if (ok) {
                            found = true;
                            marked[i][j] = true;
                            queue[back++] = i * n + j;
                            break outer;
                        }
                    }
                }
                if (!found) {
                    out.println("NO");
                    return;
                }
            }
            for (int i = 0; i < n * n; i++) {
                int cx = queue[i] / n, cy = queue[i] % n;
                out.printf("%c%d\n", "UDLR".charAt(dir[cx][cy]), (dir[cx][cy] <= 1 ? cy : cx) + 1);
            }
        }

    }

    static class MinCostFlow {
        public static void addEdge(List<MinCostFlow.Edge>[] graph, int s, int t, int cap, int cost) {
            graph[s].add(new MinCostFlow.Edge(t, cap, cost, graph[t].size()));
            graph[t].add(new MinCostFlow.Edge(s, 0, -cost, graph[s].size() - 1));
        }

        public static int[] minCostFlow(List<MinCostFlow.Edge>[] graph, int s, int t, int maxf) {
            int n = graph.length;
            int[] prio = new int[n];
            int[] curflow = new int[n];
            int[] prevedge = new int[n];
            int[] prevnode = new int[n];
            int[] pot = new int[n];

            //bellmanFord(graph, s, pot); // bellmanFord invocation can be skipped if edges costs are non-negative
            int flow = 0;
            int flowCost = 0;
            while (flow < maxf) {
                PriorityQueue<Long> q = new PriorityQueue<>();
                q.add((long) s);
                Arrays.fill(prio, Integer.MAX_VALUE);
                prio[s] = 0;
                boolean[] finished = new boolean[n];
                curflow[s] = Integer.MAX_VALUE;
                while (!finished[t] && !q.isEmpty()) {
                    long cur = q.remove();
                    int u = (int) (cur & 0xFFFF_FFFFL);
                    int priou = (int) (cur >>> 32);
                    if (priou != prio[u])
                        continue;
                    finished[u] = true;
                    for (int i = 0; i < graph[u].size(); i++) {
                        MinCostFlow.Edge e = graph[u].get(i);
                        if (e.f >= e.cap)
                            continue;
                        int v = e.to;
                        int nprio = prio[u] + e.cost + pot[u] - pot[v];
                        if (prio[v] > nprio) {
                            prio[v] = nprio;
                            q.add(((long) nprio << 32) + v);
                            prevnode[v] = u;
                            prevedge[v] = i;
                            curflow[v] = Math.min(curflow[u], e.cap - e.f);
                        }
                    }
                }
                if (prio[t] == Integer.MAX_VALUE)
                    break;
                for (int i = 0; i < n; i++)
                    if (finished[i])
                        pot[i] += prio[i] - prio[t];
                int df = Math.min(curflow[t], maxf - flow);
                flow += df;
                for (int v = t; v != s; v = prevnode[v]) {
                    MinCostFlow.Edge e = graph[prevnode[v]].get(prevedge[v]);
                    e.f += df;
                    graph[v].get(e.rev).f -= df;
                    flowCost += df * e.cost;
                }
            }
            return new int[]{flow, flowCost};
        }

        public static class Edge {
            public int to;
            public int f;
            public int cap;
            public int cost;
            public int rev;

            Edge(int to, int cap, int cost, int rev) {
                this.to = to;
                this.cap = cap;
                this.cost = cost;
                this.rev = rev;
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

        public int[] readIntArray(int tokens) {
            int[] ret = new int[tokens];
            for (int i = 0; i < tokens; i++) {
                ret[i] = nextInt();
            }
            return ret;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

