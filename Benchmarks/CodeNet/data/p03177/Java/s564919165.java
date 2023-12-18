import java.util.*;
import java.io.*;

public class Main {
    static long mod = (long) 1e9 + 7;

    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        long k = in.nextLong();
        long[][] base = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                base[i][j] = in.nextInt();
            }
        }
        //print(base);
        //System.out.println();
        long[][] pow = expo(base, k);
        //print(pow);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans = (ans + pow[i][j]) % mod;
            }
        }
        out.println(ans);
        out.close();
    }

    static long[][] expo(long[][] base, long n) {
        long[][] ret = new long[base.length][base[0].length];
        for (int i = 0; i < base.length; i++) ret[i][i] = 1;

        while (n > 0) {
            if (n % 2 == 1) {
                ret = multiply(ret, base);
            }
            n /= 2;
            base = multiply(base, base);
        }
        return ret;
    }

    static long[][] multiply(long[][] a, long[][] b) {
        long[][] c = new long[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                for (int k = 0; k < b[0].length; k++) {
                    c[i][k] = (c[i][k] + a[i][j] * b[j][k]) % mod;
                }
            }
        }
        return c;
    }

    static void print(long[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
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