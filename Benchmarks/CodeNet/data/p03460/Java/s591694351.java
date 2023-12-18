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
        int[][] dataw = new int[k * 2][k * 2];
        int[][] datab = new int[k * 2][k * 2];


        int cw = 0;
        int cb = 0;
        for (int s = 0; s < n; s++) {
            int x1 = sc.nextInt() % (k * 2);
            int y1 = sc.nextInt() % (k * 2);
            boolean w = sc.next().charAt(0) == 'W';
            if (w) {
                dataw[x1][y1]++;
                cw++;
            } else {
                cb++;
                datab[x1][y1]++;
            }
        }
        long[][] sumw = new long[k * 2 + 1][k * 2 + 1];
        long[][] sumb = new long[k * 2 + 1][k * 2 + 1];

        for (int i = 0; i < 2 * k; i++) {
            for (int j = 0; j < 2 * k; j++) {
                sumw[i + 1][j + 1] = sumw[i + 1][j] + sumw[i][j + 1] - sumw[i][j];
                sumb[i + 1][j + 1] = sumb[i + 1][j] + sumb[i][j + 1] - sumb[i][j];
                sumw[i + 1][j + 1] += dataw[i][j];
                sumb[i + 1][j + 1] += datab[i][j];
            }
        }
        long max = 0;
        for (int s1 = 0; s1 < k; s1++) {
            for (int s2 = 0; s2 < k; s2++) {
                long cur = sumw[s1 + k + 1][s2 + k + 1] + sumw[s1][s2] - sumw[s1 + k + 1][s2] - sumw[s1][s2 + k + 1];
                cur -= sumb[s1 + k + 1][s2 + k + 1] + sumb[s1][s2] - sumb[s1 + k + 1][s2] - sumb[s1][s2 + k + 1];
                cur += cb;
                max = Math.max(cur, max);
            }
        }
        out.println(max);
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
