import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    int n, z, w;
    int[] as;

    public static void main(String args[]) {
        new Main().run();
    }

    void run() {
        FastReader sc = new FastReader();
        n = sc.nextInt();
        z = sc.nextInt();
        w = sc.nextInt();
        as = new int[n];
        for (int i = 0; i < n; i++) {
            as[i] = sc.nextInt();
        }
        solve();
    }

    void solve() {
        System.out.println(dfs(0, 0, z, w));
    }

    int dfs(int depth, int card, int x, int y) {
        if (card == n) {
            return Math.abs(x - y);
        }
        int ret;
        if ((depth & 1) == 1) {
            ret = Integer.MAX_VALUE;
            for (int i = card + 1; i <= n; i++) {
                ret = Math.min(ret, dfs(depth + 1, i, x, as[i - 1]));
            }
        } else {
            ret = 0;
            for (int i = card + 1; i <= n; i++) {
                ret = Math.max(ret, dfs(depth + 1, i, as[i - 1], y));
            }
        }
        return ret;
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
