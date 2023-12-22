import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
 * @author Tarek
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CConnectCities solver = new CConnectCities();
        solver.solve(1, in, out);
        out.close();
    }

    static class CConnectCities {
        static boolean[] vis;
        static ArrayList<Integer>[] graph;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int ans = 0;
            vis = new boolean[n + 1];
            graph = new ArrayList[n + 1];
            for (int i = 1; i <= n; i++) graph[i] = new ArrayList<Integer>();
            while (m-- > 0) {
                int a = in.nextInt();
                int b = in.nextInt();
                graph[a].add(b);
                graph[b].add(a);
            }
            for (int i = 1; i <= n; i++) {
                if (!vis[i]) {
                    ans++;
                    dfs(i);
                }
            }
            out.println(ans - 1);
        }

        public void dfs(int start) {
            vis[start] = true;
            for (int k : graph[start]) {
                if (!vis[k]) {
                    dfs(k);
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

