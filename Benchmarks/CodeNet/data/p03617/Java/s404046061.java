import java.io.*;
import java.util.*;

public class Main {
    //static StringBuilder ss = new StringBuilder();
    public static void main(String[] args) throws IOException {
        InputReader in = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        int test_cases = 1;
        Solver s = new Solver();
        long start = System.currentTimeMillis();
        for (int i = test_cases; i >= 1; i--) {
            s.solve(1, in, out);
        }
        long end = System.currentTimeMillis();
        //System.out.println((end - start) / 1e3);
        //out.println(ss);
        out.close();
    }

    static class Solver {
        void solve(int test_number, InputReader in, PrintWriter out) throws IOException {
            long q = in.nextLong();
            long h = in.nextLong();
            long s = in.nextLong();
            long d = in.nextLong();
            long n = in.nextLong();
            out.println(f1(q, h, s, d, n));
        }

        private long f1(long q, long h, long s, long d, long n) {
            long qq = q * 8;
            long hh = h * 4;
            long ss = s * 2;
            long ans = 0;
            if (qq < hh && qq < ss && qq < d) {
                ans += n * (4 * q);
            }
            else if (hh < qq && hh < ss && hh < d) {
                ans += n * (2 * h);
            }
            else if (ss < qq && ss < hh && ss < d) {
                ans += n * (s);
            }
            else {
                ans += n / 2 * d;
                if (n % 2 == 1) {
                    ans += Math.min(4 * q, Math.min(2 * h, s));
                }
            }
            return ans;
        }
    }
    static class InputReader {
        BufferedReader br;
        StringTokenizer st;

        public InputReader()
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
                catch (IOException  e)
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
    }
}