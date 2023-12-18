import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
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

        String nextLine()
        {
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

        public static void main(String[] args) {
            FastReader in = new FastReader();

            solve(in);
        }

        private static void solve(final FastReader in) {
            Long n = in.nextLong();
            long res = Integer.MAX_VALUE;
            for (long i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    res = Math.min(res, maxDigit(i, n / i));
                }
            }
            System.out.println(res);
        }

        private static int maxDigit(final long a, final long b) {
            return Math.max(digitCount(a), digitCount(b));
        }

        private static int digitCount(long n) {
            int res = 0;
            while (n > 0) {
                n /= 10;
                res++;
            }
            return res;
        }
    }
}
