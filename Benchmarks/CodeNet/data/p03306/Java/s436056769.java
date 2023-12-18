// package other2018.soundhoundmaster2018;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class Main {
    private static final long INF = (long) 1e11;
    static long __startTime = System.currentTimeMillis();

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);


        int n = in.nextInt();
        int m = in.nextInt();
        int[][][] graph = buildWeightedGraph(in, n, m);

        long[] nMaxVal = new long[n];
        Arrays.fill(nMaxVal, INF);
        for (int i = 0; i < n ; i++) {
            for (int[] e : graph[i]) {
                nMaxVal[i] = Math.min(nMaxVal[i], e[1]-1);
            }
        }

        UnionFind uf = new UnionFind(n);

        int[][] otherEdges = new int[m-(n-1)][];
        int[][] treeEdges = new int[n-1][];

        {
            int oi = 0;
            int ti = 0;
            for (int i = 0; i < n; i++) {
                for (int[] e : graph[i]) {
                    if (i < e[0]) {
                        if (uf.issame(i, e[0])) {
                            otherEdges[oi++] = new int[]{i, e[0], e[1]};
                        } else {
                            uf.unite(i, e[0]);
                            treeEdges[ti++] = new int[]{i, e[0], e[1]};
                        }
                    }
                }
            }
        }


        tree = buildWeightedGraph(n, treeEdges);

        C = new long[n];
        A = new long[n];

        dfs(0, -1, 0);

        long min = 1;
        long max = nMaxVal[0];

        for (int i = 1; i < n ; i++) {
            if (A[i] == 1) {
                // 1 <= C[i] + A[i] <= Max[i]
                // 1 - C[i] <= A[i]
                // A[i] <= Max[i] - C[i]

                long amin = 1 - C[i];
                long amax = nMaxVal[i] - C[i];
                min = Math.max(min, amin);
                max = Math.min(max, amax);
            } else {
                // 1 <= C[i] - A[i] <= Max[i]
                // A[i] + 1 <= C[i] <= Max[i] + A[i]
                // A[i] <= C[i] - 1
                // A[i] >= C[i] - Max[i]
                long amin = C[i] - nMaxVal[i];
                long amax = C[i] - 1;
                min = Math.max(min, amin);
                max = Math.min(max, amax);
            }
        }
        boolean valid = true;
        for (int[] e : otherEdges) {
            long sumC = C[e[0]] + C[e[1]];
            long sumA = A[e[0]] + A[e[1]];

            if (sumA == 0) {
                if (sumC != e[2]) {
                    valid = false;
                }
            } else {
                if (Math.abs(sumC) % 2 != e[2] % 2) {
                    valid = false;
                } else {
                    if (sumA == 2) {
                        // 2A + sumC == e[2]
                        long ta = (e[2] - sumC) / 2;
                        min = Math.max(min, ta);
                        max = Math.min(max, ta);
                    } else {
                        // -2A + sumC == e[2]
                        long ta = (sumC - e[2]) / 2;
                        min = Math.max(min, ta);
                        max = Math.min(max, ta);
                    }
                }
            }
        }

        valid &= min <= max;

        if (!valid) {
            out.println(0);
        } else {
            out.println(max - min + 1);
        }
        out.flush();
    }

    static long[] C;
    static long[] A;

    static void dfs(int now, int par, int w) {
        if (par != -1) {
            A[now] = A[par] * -1;
            C[now] = w - C[par];
        } else {
            A[now] = 1;
        }

        for (int[] e  : tree[now]) {
            if (e[0] == par) {
                continue;
            }
            dfs(e[0], now, e[1]);
        }
    }

    static int[][][] tree;

    static class UnionFind {
        int[] rank;
        int[] parent;
        int[] cnt;

        public UnionFind(int n) {
            rank = new int[n];
            parent = new int[n];
            cnt = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                cnt[i] = 1;
            }
        }

        public int find(int a) {
            if (parent[a] == a) {
                return a;
            }
            parent[a] = find(parent[a]);
            return parent[a];
        }

        public void unite(int a, int b) {
            a = find(a);
            b = find(b);
            if (a == b) {
                return;
            }
            if (rank[a] < rank[b]) {
                parent[a] = b;
                cnt[b] += cnt[a];
                cnt[a] = cnt[b];
            } else {
                parent[b] = a;
                cnt[a] += cnt[b];
                cnt[b] = cnt[a];
                if (rank[a] == rank[b]) {
                    rank[a]++;
                }
            }
        }

        public int groupCount(int a) {
            return cnt[find(a)];
        }

        private boolean issame(int a, int b) {
            return find(a) == find(b);
        }
    }

    static int[][][] buildWeightedGraph(int n, int[][] edges) {
        int[][][] graph = new int[n][][];
        int[] deg = new int[n];
        int m = edges.length;
        for (int i = 0 ; i < m ; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            deg[a]++;
            deg[b]++;
        }
        for (int i = 0 ; i < n ; i++) {
            graph[i] = new int[deg[i]][2];
        }
        for (int i = 0 ; i < m ; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            int w = edges[i][2];
            graph[a][--deg[a]][0] = b;
            graph[b][--deg[b]][0] = a;
            graph[a][deg[a]][1] = w;
            graph[b][deg[b]][1] = w;
        }
        return graph;
    }


    static int[][][] buildWeightedGraph(InputReader in, int n, int m) {
        int[][] edges = new int[m][];
        for (int i = 0 ; i < m ; i++) {
            int a = in.nextInt()-1;
            int b = in.nextInt()-1;
            int w = in.nextInt();
            edges[i] = new int[]{a, b, w};
        }
        return buildWeightedGraph(n, edges);
    }

    private static void printTime(String label) {
        debug(label, System.currentTimeMillis() - __startTime);
    }

    private static void debug(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }

    public static class InputReader {
        private static final int BUFFER_LENGTH = 1 << 12;
        private InputStream stream;
        private byte[] buf = new byte[BUFFER_LENGTH];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        private int next() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public char nextChar() {
            return (char) skipWhileSpace();
        }

        public String nextToken() {
            int c = skipWhileSpace();
            StringBuilder res = new StringBuilder();
            do {
                res.append((char) c);
                c = next();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public int nextInt() {
            return (int) nextLong();
        }

        public long nextLong() {
            int c = skipWhileSpace();
            long sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = next();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = next();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble() {
            return Double.valueOf(nextToken());
        }

        int skipWhileSpace() {
            int c = next();
            while (isSpaceChar(c)) {
                c = next();
            }
            return c;
        }

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
    }
}