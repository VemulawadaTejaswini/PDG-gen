import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int[][] dp = new int[n][3];
        dp[0][0] = in.nextInt();
        dp[0][1] = in.nextInt();
        dp[0][2] = in.nextInt();

        for (int i = 1; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            dp[i][0] = a + Math.max(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = b + Math.max(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = c + Math.max(dp[i - 1][0], dp[i - 1][1]);

        }

        out.println(Math.max(Math.max(dp[n - 1][0], dp[n - 1][1]), dp[n - 1][2]));
        out.close();

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