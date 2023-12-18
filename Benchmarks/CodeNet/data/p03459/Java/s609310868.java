import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    static MyScanner sc;
    private static PrintWriter out;
    static long M = 1000000007;

    public static void main(String[] s) throws Exception {
        StringBuilder stringBuilder = new StringBuilder();

//        Random r = new Random(4);
//        int x = 10000;
//        stringBuilder.append(x + " ");
//        for (int l = 0; l < x; l++) {
//            int tt = r.nextInt(5) + 2;
//            stringBuilder.append(tt + " ");
//            for (int xx = 0 ; xx < tt; xx++) {
//                stringBuilder.append((r.nextInt(1000) + 1) + " ");
//            }
//        }

//        stringBuilder.append("1 3 63 928 4");
//        stringBuilder.append("3 2 0 2 3");

        if (stringBuilder.length() == 0) {
            sc = new MyScanner(System.in);
        } else {
            sc = new MyScanner(new BufferedReader(new StringReader(stringBuilder.toString())));
        }

        out = new PrintWriter(new OutputStreamWriter(System.out));
        initData();
        solve();
        out.flush();
    }

    private static void solveT() {
        int r = sc.nextInt();
        while (r-- > 0) {
            solve();
        }
    }

    private static void initData() {
    }


    private static void solve() {
        int t = sc.nextInt();
        int c0 = 0;
        int c1 = 0;
        int pt = 0;
        while (t-->0) {
            int n = sc.nextInt();
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();


            if((x1 + x2 + n - c0 - c1 - pt) % 2 == 1 ) {
                out.println("No");
                return;
            }
            int diff = Math.abs(x1 - c0) + Math.abs(x2 - c1);
            if (diff > n - pt) {
                out.println("No");
                return;
            }


            pt = n;
            c0 = x1;
            c1 = x2;
        }

        out.println("Yes");



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
