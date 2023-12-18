import java.io.*;
import java.math.BigInteger;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        InputReader in = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        int test_cases = 1;
        Solver s = new Solver();
        for (int i = test_cases; i >= 1; i--) {
            s.solve(1, in, out);
        }
        out.close();
    }

    static class Solver {

        public void solve(int test_number, InputReader in, PrintWriter out) throws IOException {
            int n = in.nextInt();
            BigInteger[] a = new BigInteger[n];
            for (int i = 0; i < n; i++) {
                a[i] = new BigInteger(in.next());
            }
            BigInteger res = new BigInteger("1");
            for (int i = 0; i < n; i++) {
                res = res.multiply(a[i]).divide(findGcd(res, a[i]));
            }
            out.println(res);
        }

        private BigInteger findGcd(BigInteger a, BigInteger b) {
            while (b.compareTo(new BigInteger("0")) > 0) {
                BigInteger t = a.mod(b);
                a = b;
                b = t;
            }
            return a;
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