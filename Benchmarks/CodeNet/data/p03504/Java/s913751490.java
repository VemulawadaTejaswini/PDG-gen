import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    int n, c;
    int[] ss, ts, cs;
    int END = 100000;

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
            ss[i] = sc.nextInt() - 1;
            ts[i] = sc.nextInt();
            cs[i] = sc.nextInt();
        }
        solve();
    }

    void solve() {
        int[] sum = new int[END + 1];
        for (int i = 0; i < n; i++) {
            sum[ss[i]]++;
            sum[ts[i]]--;
        }
        int max = sum[0];
        for (int i = 1; i <sum.length; i++) {
            sum[i] = sum[i - 1] + sum[i];
            if (sum[i] > max) {
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
