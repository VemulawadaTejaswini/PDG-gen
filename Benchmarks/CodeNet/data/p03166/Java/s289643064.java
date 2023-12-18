import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int m = in.nextInt();
        ArrayList<Integer>[] adj = new ArrayList[n + 1];
        Arrays.setAll(adj, x -> new ArrayList<>());
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            adj[a].add(b);
        }

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        for (int i = 1; i <= n; i++) {
            if (dp[i] == -1) {
                dp[i] = dfs(i, adj, dp);
            }
        }

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans = Math.max(ans, dp[i]);
        }
        out.println(ans);
        out.close();

    }

    static int dfs(int vtx, ArrayList<Integer>[] adj, int[] dp) {
        int ans = 0;
        for (int to : adj[vtx]) {
            if (dp[to] != -1) {
                ans = Math.max(ans, dp[to] + 1);
            }
            else {
                ans = Math.max(ans, dfs(to, adj, dp) + 1);
            }
        }
        dp[vtx] = ans;
        return ans;
    }


    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        public FastScanner(InputStream i) {
            br = new BufferedReader(new InputStreamReader(i));
            st = new StringTokenizer("");
        }
        public String next() throws IOException {
            if (st.hasMoreTokens()) {
                return st.nextToken();
            }
            else
                st = new StringTokenizer(br.readLine());
            return next();
        }
        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }
        public String nextLine() throws IOException {
            if (!st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
                return nextLine();
            }

            String ret = "";
            while (st.hasMoreTokens()) {
                ret += st.nextToken();
            }
            return ret;
        }
        public int[] nextIntArr(int size) throws IOException {
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }
        public long[] nextLongArr(int size) throws IOException {
            long[] arr = new long[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = nextLong();
            }
            return arr;
        }
        public double[] nextDoubleArr(int size) throws IOException {
            double[] arr = new double[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = nextDouble();
            }
            return arr;
        }
    }
}