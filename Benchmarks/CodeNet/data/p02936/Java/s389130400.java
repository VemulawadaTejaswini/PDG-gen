import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author /\
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DKi solver = new DKi();
        solver.solve(1, in, out);
        out.close();
    }

    static class DKi {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int q = in.nextInt();
            List<Integer>[] adj = new List[n];
            for (int i = 0; i < n; i++) {
                adj[i] = new ArrayList<>();
            }
            for (int i = 0; i < n - 1; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                adj[a - 1].add(b - 1);
            }
            long[] added = new long[n];
            while (q-- > 0) {
                int p = in.nextInt() - 1;
                int x = in.nextInt();
                added[p] += x;
            }
            long[] res = new long[n];
            res[0] = added[0];
            boolean[] vis = new boolean[n];
            vis[0] = true;
            dfs(0, res, added, adj, vis);
            StringBuilder sb = new StringBuilder();
            for (long i : res) {
                sb.append(i).append(" ");
            }
            out.print(sb);
        }

        static void dfs(int node, long[] res, long[] added, List<Integer>[] adj, boolean[] vis) {
            for (int i : adj[node]) {
                if (!vis[i]) {
                    vis[i] = true;
                    res[i] = res[node] + added[i];
                    dfs(i, res, added, adj, vis);
                }
            }
        }

    }

    static class Scanner {
        private StringTokenizer st;
        private BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

