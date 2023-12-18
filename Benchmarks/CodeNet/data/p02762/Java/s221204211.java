import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.HashMap;
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
        private boolean[] used;
        private int c;
        private ArrayList<HashSet<Integer>> g;
        private ArrayList<Integer> list;
        private HashMap<Integer, Integer> map;
        private int comp;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();
            g = new ArrayList<>();
            for (int i = 0; i < n; i++)
                g.add(new HashSet<>());
            for (int i = 0; i < m; i++) {
                int u = in.nextInt() - 1;
                int v = in.nextInt() - 1;
                g.get(u).add(v);
                g.get(v).add(u);
            }
            used = new boolean[n];
            int[] ans = new int[n];
            map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                if (!used[i]) {
                    list = new ArrayList<>();
                    c = 0;
                    dfs(i);
                    comp++;
                    for (int j = 0, sz = list.size(); j < sz; j++) {
                        int curV = list.get(j);
                        int curAns = (c - 1) - g.get(curV).size();
                        ans[curV] = curAns;
                    }
                }
            }
            for (int i = 0; i < k; i++) {
                int u = in.nextInt() - 1;
                int v = in.nextInt() - 1;
                int c1 = map.get(u);
                int c2 = map.get(v);
                if (c1 == c2) {
                    ans[u]--;
                    ans[v]--;
                }
            }
            for (int i = 0; i < n; i++)
                out.print(ans[i] + " ");
        }

        private void dfs(int v) {
            map.put(v, comp);
            used[v] = true;
            c++;
            list.add(v);
            for (int to : g.get(v))
                if (!used[to]) {
                    dfs(to);
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

