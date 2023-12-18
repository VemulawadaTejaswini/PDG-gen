import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.io.IOException;
import java.util.OptionalInt;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
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
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskF solver = new TaskF();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskF {
        List<Integer>[] tree;
        boolean[] leaf;
        List<Integer> result = new ArrayList<>();
        int[] size;

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            tree = new List[n];
            for (int i = 0; i < n; i++) {
                tree[i] = new ArrayList<>();
            }
            for (int i = 0; i < n - 1; i++) {
                int from = in.nextInt() - 1, to = in.nextInt() - 1;
                tree[from].add(to);
                tree[to].add(from);
            }

            leaf = new boolean[n];
            for (int i = 0; i < n; i++) {
                leaf[i] = tree[i].size() == 1;
            }
            int[] deg = new int[n];
            for (int i = 0; i < n; i++) {
                if (!leaf[i]) {
                    for (int j : tree[i]) {
                        if (!leaf[j]) {
                            deg[i]++;
                        }
                    }
                }
            }
            int max = Arrays.stream(deg).max().getAsInt();
            if (max > 2) {
                out.println(-1);
                return;
            }
            int best = 0;
            if (max == 2) {
                for (int i = 0; i < n; i++) {
                    if (deg[i] == 1) {
                        best = i;
                    }
                }
            }
            size = new int[n];
            Arrays.fill(size, 1);
            calc(best, -1);
            go(best, -1, 0);
            for (int i : result) {
                out.print((i + 1) + " ");
            }
            out.println();
        }

        private void calc(int i, int p) {
            for (int t : tree[i]) {
                if (t != p) {
                    calc(t, i);
                    size[i] += size[t];
                }
            }
        }

        private void go(int i, int p, int startId) {
            result.add(startId);
            int nonLeaf = -1;
            int skipIds = 0;
            for (int t : tree[i]) {
                if (t != p) {
                    if (!leaf[t]) {
                        nonLeaf = t;
                    } else {
                        skipIds++;
                    }
                }
            }
            if (nonLeaf != -1) {
                go(nonLeaf, i, startId + skipIds + 1);
            }
            for (int t : tree[i]) {
                if (t != p && leaf[t]) {
                    skipIds--;
                    go(t, i, startId + skipIds + 1);
                }
            }
        }

    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                String line = null;
                try {
                    line = br.readLine();
                } catch (IOException e) {
                }
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

    }
}

