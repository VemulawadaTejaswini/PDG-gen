import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    int n, m, r;
    int[] rs;
    int ans;
    boolean[] visited;
    int[][] distances;

    public static void main(String args[]) {
        new Main().run();
    }

    void run() {
        FastReader sc = new FastReader();
        n = sc.nextInt();
        m = sc.nextInt();
        r = sc.nextInt();
        rs = new int[r + 1];
        for (int i = 1; i <= r; i++) {
            rs[i] = sc.nextInt();
        }
        solve(sc);
    }

    void solve(FastReader sc) {
        distances = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i != j) {
                    distances[i][j] = Integer.MAX_VALUE >> 4;
                }
            }
        }
        for (int i = 1; i <= m; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            int cost = sc.nextInt();
            distances[from][to] = cost;
            distances[to][from] = cost;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    distances[i][j] = Math.min(distances[i][j],
                                distances[i][k] + distances[k][j]);
                }
            }
        }
        ans = Integer.MAX_VALUE;
        visited = new boolean[r + 1];
        dfs(1, -1, 0);
        System.out.println(ans);
    }

    void dfs(int c, int last, int distance) {
        if (c == r + 1) {
            if (distance < ans) {
                ans = distance;
            }
            return;
        }
        for (int i = 1; i <= r; i++) {
            if (!visited[i]) {
                visited[i] = true;
                if (last == -1) {
                    dfs(c + 1, i, 0);
                } else {
                    dfs(c + 1, i, distance + distances[rs[last]][rs[i]]);
                }
                visited[i] = false;
            }
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}
