import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    int n, c;
    int[] ss, ts, cs;
    int END = 100001;

    public static void main(String args[]) {
        new Main().run();
    }

    void run() {
        FastReader sc = new FastReader();
        n = sc.nextInt();
        c = sc.nextInt();
        ss = new int[n];
        ts = new int[n];
        cs = new int[n];
        for (int i = 0; i < n; i++) {
            ss[i] = 2 * sc.nextInt() - 1;
            ts[i] = 2 * sc.nextInt();
            cs[i] = sc.nextInt() - 1;
        }
        solve();
    }

    void solve() {
        int[][] css = new int[c][2 * END];
        for (int i = 0; i < n; i++) {
            css[cs[i]][ss[i]]++;
            css[cs[i]][ts[i]]--;
        }
        for (int i = 0; i < c; i++) {
            for (int j = 1; j < css[i].length; j++) {
                css[i][j] = Math.min(1, css[i][j - 1] + css[i][j]);
            }
        }
        int[] sum = new int[2 * END];
        int max = 0;
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < c; j++) {
                sum[i] += css[j][i];
            }
            if (max < sum[i]) {
                max = sum[i];
            }
        }
        System.out.println(max);
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
