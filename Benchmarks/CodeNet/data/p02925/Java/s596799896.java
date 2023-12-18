import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Hashtable;
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
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        private int[] cl;
        private int[] p;
        private int cycle_st;
        private ArrayList<ArrayList<Integer>> g;
        private boolean[] used;
        private int maxLen;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int all = (n * (n - 1)) / 2;
            cl = new int[all + 1];
            p = new int[all + 1];
            used = new boolean[all + 1];
            maxLen = 0;
            Hashtable<Pair, Integer> table = new Hashtable<>();
            int c = 0;
            g = new ArrayList<>();
            for (int i = 0; i < all + 1; i++)
                g.add(new ArrayList<>());
            for (int i = 0; i < n; i++) {
                int last = -1;
                for (int j = 1; j < n; j++) {
                    int from = i;
                    int to = in.nextInt() - 1;
                    if (from > to) {
                        int t = from;
                        from = to;
                        to = t;
                    }
                    int num;
                    if (!table.containsKey(new Pair(from, to))) {
                        table.put((new Pair(from, to)), c);
                        num = c;
                        c++;
                    } else {
                        num = table.get(new Pair(from, to));
                    }
                    if (j == 1) {
                        last = num;
                    } else {
                        g.get(last).add(num);
                        last = num;
                    }
                }
            }
            Arrays.fill(p, -1);
            Arrays.fill(cl, 0);
            cycle_st = -1;
            for (int i = 0; i < all; ++i)
                if (dfs1(i))
                    break;
            if (cycle_st == -1) {
                Arrays.fill(used, false);
                for (int i = 0; i < all; i++)
                    if (!used[i])
                        dfs2(i, 1);
                out.println(maxLen);
            } else
                out.println(-1);
        }

        private void dfs2(int v, int len) {
            used[v] = true;
            maxLen = Math.max(maxLen, len);
            for (int i = 0, sz = g.get(v).size(); i < sz; i++) {
                int to = g.get(v).get(i);
                if (!used[to])
                    dfs2(to, len + 1);
            }
        }

        private boolean dfs1(int v) {
            cl[v] = 1;
            for (int i = 0, sz = g.get(v).size(); i < sz; ++i) {
                int to = g.get(v).get(i);
                if (cl[to] == 0) {
                    p[to] = v;
                    if (dfs1(to))
                        return true;
                } else if (cl[to] == 1) {
                    cycle_st = to;
                    return true;
                }
            }
            cl[v] = 2;
            return false;
        }

        private class Pair {
            private int i;
            private int j;

            public Pair(int i, int j) {
                this.i = i;
                this.j = j;
            }

            public int hashCode() {
                return i * 1111 + j;
            }

            public boolean equals(Object o) {
                Pair e = (Pair) o;
                return this.i == e.i && this.j == e.j;
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

