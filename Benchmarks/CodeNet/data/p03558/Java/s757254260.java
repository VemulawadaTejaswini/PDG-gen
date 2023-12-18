import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
//        InputReader in = new InputReader(new FileInputStream("/Users/KeFA/projects/competitve/src/main/java/input.txt"));
        PrintWriter out = new PrintWriter(System.out);

        long ans = Long.MAX_VALUE;
        while (in.ready()) {
            long b = in.nextInt();
            for (int i = 1; i < 10_000_000; i++) {
                long n = b * i;
                long sum = 0;
                while (n != 0) {
                    sum += n % 10;
                    n /= 10;
                }
                ans = Math.min(ans, sum);
            }
        }

        System.out.println(ans);
        out.flush();
        out.close();
    }

    private static class InputReader {
        StringTokenizer st;
        BufferedReader br;

        public InputReader(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if (x.charAt(0) == '-') {
                neg = true;
                start++;
            }
            for (int i = start; i < x.length(); i++)
                if (x.charAt(i) == '.') {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                } else {
                    sb.append(x.charAt(i));
                    if (dec)
                        f *= 10;
                }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg ? -1 : 1);
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }
}
