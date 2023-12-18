import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ELeague solver = new ELeague();
        solver.solve(1, in, out);
        out.close();
    }

    static class ELeague {
        static int dp;

        public boolean dfs(node root, HashSet<node> vis, HashSet<node> res) {
            boolean ans = true;
            if (res.contains(root)) return false;
            if (vis.contains(root)) return true;
            vis.add(root);
            res.add(root);
//        System.out.println((root.i+1) + " " + (root.j+1));
            for (int i = 0; i < root.a.size(); i++) {
                ans = ans & dfs(root.a.get(i), vis, res);
                dp[root.i][root.j] = Math.max(dp[root.i][root.j], 1 + dp[root.a.get(i).i][root.a.get(i).j]);
            }
            res.remove(root);
            return ans;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            ArrayList<Integer> a[] = new ArrayList[n];
            dp = new int[n][n];
            HashSet<node> vis = new HashSet<>();
            HashSet<node> res = new HashSet<>();
            for (int i = 0; i < n; i++) a[i] = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - 1; j++) {
                    a[i].add(in.nextInt() - 1);
                }
            }
            node st[][] = new node[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    st[i][j] = new node(i, j);
                }
            }
            for (int i = 0; i < n; i++) {
                node temp = st[Math.min(i, a[i].get(0))][Math.max(i, a[i].get(0))];
                for (int j = 1; j < n - 1; j++) {
                    temp.addEdge(st[Math.min(i, a[i].get(j))][Math.max(i, a[i].get(j))]);
                    temp = st[Math.min(i, a[i].get(j))][Math.max(i, a[i].get(j))];
                }
            }
            if (!dfs(st[0][1], vis, res)) {
                out.println(-1);
                return;
            }

            int ans = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    ans = Math.max(ans, dp[i][j]);
                }
            }
            out.println(ans + 1);


        }

        class node {
            ArrayList<node> a;
            int i;
            int j;

            node(int i, int j) {
                this.i = i;
                this.j = j;
                a = new ArrayList<>();
            }

            public void addEdge(node x) {
                a.add(x);
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

