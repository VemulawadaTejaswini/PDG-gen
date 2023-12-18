import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    static int[] count = new int[123456];
    static boolean[] visited = new boolean[123456];
    static ArrayList<Integer>[] g;
    static ArrayList<Integer>[] x;
    static Map<Integer, HashSet<Integer>> s;
    static Map<Integer, Integer> s_ans;
    static int ans = 0;

    public static void main(String[] args) throws Exception {
        long startTime = System.nanoTime();
        int t = 1;
        while (t-- > 0) {
            solve();
        }
        long endTime = System.nanoTime();
        err.println("Execution Time : +" + (endTime - startTime) / 1000000 + " ms");
        exit(0);
    }

    static void solve() {
        int N = in.nextInt();
        int M = in.nextInt();
        int K = in.nextInt();
        g = graph(N + 1);
        x = graph(N + 1);
        s = new HashMap<>();
        s_ans = new HashMap<>();

        for (int i = 0; i < M; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            g[a].add(b);
            g[b].add(a);
        }
        for (int i = 0; i < K; i++) {
            int c = in.nextInt() - 1;
            int d = in.nextInt() - 1;
            x[c].add(d);
            x[d].add(c);
        }
        for (int i = 0; i < N; i++) {
            if (visited[i]) {
                continue;
            }
            HashSet<Integer> temp = new HashSet<>();
            temp.add(i);
            dfs(i, temp);
            s.put(i, temp);
            s_ans.put(i, ans - 1);
            ans = 0;
        }
        for (int a : s.keySet()) {
            for (int b : s.get(a)) {
                int c = s_ans.get(a) - g[b].size();
                for (int un : x[b]) {
                    if (s.get(a).contains(un)) {
                        c--;
                    }
                }
                count[b] = Math.max(count[b], c);
            }
        }
        for (int i = 0; i < N; i++) {
            out.print(count[i]);
            out.print(' ');
        }
        out.println("");
    }

    static void dfs(int start, HashSet<Integer> cc) {
        ans++;
        visited[start] = true;
        for (int a : g[start]) {
            if (!visited[a]) {
                cc.add(a);
                dfs(a, cc);
            }
        }
    }

    static ArrayList<Integer>[] graph(int n) {
        ArrayList<Integer>[] g = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }
        return g;
    }

    static void debug(Object... args) {
        for (Object a : args) {
            out.println(a);
        }
    }

    static void y() {
        out.println("YES");
    }

    static void n() {
        out.println("NO");
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

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] readAllInts(int n) {
            int[] p = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = in.nextInt();
            }
            return p;
        }

        public int[] readAllInts(int n, int s) {
            int[] p = new int[n + s];
            for (int i = s; i < n + s; i++) {
                p[i] = in.nextInt();
            }
            return p;
        }

        public long[] readAllLongs(int n) {
            long[] p = new long[n];
            for (int i = 0; i < n; i++) {
                p[i] = in.nextInt();
            }
            return p;
        }

        public long[] readAllLongs(int n, int s) {
            long[] p = new long[n + s];
            for (int i = s; i < n + s; i++) {
                p[i] = in.nextInt();
            }
            return p;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    static void exit(int a) {
        out.close();
        err.close();
        System.exit(a);
    }

    static InputStream inputStream = System.in;
    static OutputStream outputStream = System.out;
    static OutputStream errStream = System.err;
    static InputReader in = new InputReader(inputStream);
    static PrintWriter out = new PrintWriter(outputStream);
    static PrintWriter err = new PrintWriter(errStream);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

}
