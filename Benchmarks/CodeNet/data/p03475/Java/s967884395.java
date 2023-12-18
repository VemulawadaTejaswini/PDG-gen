import java.io.*;
import java.util.*;
import java.util.function.Consumer;

public class Main {

    static MyScanner sc;
    private static PrintWriter out;
    static long M = 1000000007;

    public static void main(String[] s) throws Exception {
        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("T");
//        for (int i = 0 ; i < 7999  ; i++) {
//            stringBuilder.append("F");
//        }
//        stringBuilder.append(" 0 -7999 ");

        if (stringBuilder.length() == 0) {
            sc = new MyScanner(System.in);
        } else {
            sc = new MyScanner(new BufferedReader(new StringReader(stringBuilder.toString())));
        }


        out = new PrintWriter(new OutputStreamWriter(System.out));
        long t = System.currentTimeMillis();


        solve();
        out.flush();
    }

    private static void solve() {
        int n = sc.nextInt() - 1;
        int[][] dd = new int[n][3];
        for (int i = 0; i < n; i++) {
            dd[i][0] = sc.nextInt();
            dd[i][1] = sc.nextInt();
            dd[i][2] = sc.nextInt();
        }
        for (int l = 0; l < n; l++) {
            int cur = dd[l][1] + dd[l][0];
            for (int r = l + 1; r < n; r++) {
                cur = Math.max(cur, dd[r][1]);
                while (cur % dd[r][2] != 0) {
                    cur++;
                }
                cur += dd[r][0];
            }

            out.println(cur);
        }
        out.println(0);
    }


    private static void solveT() {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    private static long gcd(long l, long l1) {
        if (l > l1) return gcd(l1, l);
        if (l == 0) return l1;
        return gcd(l1 % l, l);
    }

    private static long pow(long a, long b, long m) {
        if (b == 0) return 1;
        if (b == 1) return a;
        long pp = pow(a, b / 2, m);
        pp *= pp;
        pp %= m;
        return (pp * (b % 2 == 0 ? 1 : a)) % m;
    }


    static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        MyScanner(BufferedReader br) {
            this.br = br;
        }

        public MyScanner(InputStream in) {
            this(new BufferedReader(new InputStreamReader(in)));
        }

        void findToken() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        String next() {
            findToken();
            return st.nextToken();
        }

        int[] na(int n) {
            int[] k = new int[n];
            for (int i = 0; i < n; i++) {
                k[i] = sc.nextInt();
            }
            return k;
        }

        long[] nl(int n) {
            long[] k = new long[n];
            for (int i = 0; i < n; i++) {
                k[i] = sc.nextLong();
            }
            return k;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }


}
