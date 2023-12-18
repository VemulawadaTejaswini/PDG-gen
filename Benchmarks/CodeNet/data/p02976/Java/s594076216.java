import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.BitSet;
import java.io.BufferedReader;
import java.util.ArrayDeque;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BEvenDegrees solver = new BEvenDegrees();
        solver.solve(1, in, out);
        out.close();
    }

    static class BEvenDegrees {
        int[] score;
        StringBuilder sb;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt();

            score = new int[n];

            List<Integer>[] adj = new List[n];
            int[] degree = new int[n];
            UnionFind uf = new UnionFind(n);
            for (int i = 0; i < n; i++)
                adj[i] = new ArrayList<>();

            sb = new StringBuilder();

            for (int i = 0; i < m; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                boolean tree = uf.union(a, b);
                if (tree) {
                    adj[a].add(b);
                    adj[b].add(a);
                    degree[a]++;
                    degree[b]++;
                } else {
                    direct(a, b);
                }
            }

            Queue<Integer> q = new ArrayDeque<>();
            BitSet visited = new BitSet();
            for (int i = 0; i < n; i++) {
                if (degree[i] == 1) {
                    q.add(i);
                }
            }

            while (!q.isEmpty()) {
                int i = q.poll();
                visited.set(i);

                for (int j : adj[i]) {
                    if (visited.get(j))
                        continue;
                    degree[j]--;
                    if (degree[j] == 1) {
                        q.add(j);
                    }
                    if (score[i] == 1) {
                        direct(i, j);
                    } else {
                        direct(j, i);
                    }
                }
            }

            boolean possible = true;
            for (int x : score) {
                if (x == 1)
                    possible = false;
            }

            out.println(possible ? sb.toString() : "-1");
        }

        void direct(int i, int j) {
            score[i] ^= 1;
            sb.append(String.format("%d %d%n", i + 1, j + 1));
        }

    }

    static class UnionFind {
        private int[] __rep;
        private int[] __size;

        public UnionFind(int n) {
            __rep = new int[n];
            __size = new int[n];
            for (int i = 0; i < n; i++) {
                __rep[i] = i;
                __size[i] = 1;
            }
        }

        public int rep(int x) {
            if (__rep[x] == x) {
                return x;
            }

            int r = rep(__rep[x]);
            __rep[x] = r;
            return r;
        }

        public int size(int x) {
            return __size[rep(x)];
        }

        public boolean union(int x, int y) {
            x = rep(x);
            y = rep(y);

            if (x == y) {
                return false;
            }

            if (size(x) < size(y)) {
                int t = x;
                x = y;
                y = t;
            }

            // now size(x) >= size(y)

            __rep[y] = x;
            __size[x] += __size[y];
            return true;
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

