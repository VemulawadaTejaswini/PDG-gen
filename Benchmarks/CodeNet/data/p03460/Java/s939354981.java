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

        int n = sc.nextInt();
        int k = sc.nextInt();
        long[][] sumw = new long[k * 2 + 1][k * 2 + 1];
        long[][] sumb = new long[k * 2 + 1][k * 2 + 1];


        int cw = 0;
        int cb = 0;
        for (int s = 0; s < n; s++) {
            int x1 = sc.nextInt() % (k * 2);
            int y1 = sc.nextInt() % (k * 2);
            boolean w = sc.next().charAt(0) == 'W';
            if (w) {
                sumw[x1 + 1][y1 + 1]++;
                cw++;
            } else {
                cb++;
                sumb[x1 + 1][y1 + 1]++;
            }
        }

        for (int i = 0; i < 2 * k; i++) {
            for (int j = 0; j < 2 * k; j++) {
                sumw[i + 1][j + 1] += sumw[i + 1][j] + sumw[i][j + 1] - sumw[i][j];
                sumb[i + 1][j + 1] += sumb[i + 1][j] + sumb[i][j + 1] - sumb[i][j];
            }
        }


        long max = 0;
        for (int s1 = 0; s1 < k; s1++) {
            for (int s2 = 0; s2 < k; s2++) {
                long cur = s(sumw, s1, s2, k);
                cur -= s(sumb, s1, s2, k);
                cur += cb;
                if (max < cur) {
                    max = cur;
                }
            }
        }
        out.println(max);
    }

    private static long s(long[][] sumb, int s1, int s2, int k) {
        long res = 0;
        res += s(sumb, 0, 0, s1, s2);
        res += s(sumb, s1 + k, 0, sumb.length - 1, s2);
        res += s(sumb, s1, s2, s1 + k, s2 + k);
        res += s(sumb, 0, k + s2, s1, sumb.length - 1);
        res += s(sumb, s1 + k, k + s2, sumb.length - 1, sumb.length - 1);

        return res;
    }

    private static long s(long[][] sumb, int f1, int f2, int e1, int e2) {
        return sumb[e1][e2] - sumb[f1][e2] - sumb[e1][f2] + sumb[f1][f2];
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
