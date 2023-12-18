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


        solveT();
        out.flush();
    }

    private static void solve() {
        int l = sc.nextInt();
        int r = sc.nextInt();
        out.println(cc[r] - cc[l - 1]);
    }

    static boolean[] pp;
    static int[] cc;

    static {
        pp = sieveEratosthenesB(100001);
        cc = new int[100001];
        for (int i = 3; i < cc.length; i++) {
            cc[i] = cc[i - 1];
            if (!pp[i]) continue;
            if (pp[(i + 1) / 2]) {
                cc[i]++;
            }
        }
    }

    public static boolean[] sieveEratosthenesB(int n) {
        boolean[] tt = new boolean[n + 1];
        Arrays.fill(tt, true);
        tt[0] = false;
        tt[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (!tt[i]) continue;
            for (int k = i * i; k <= n; k += i) {
                tt[k] = false;
            }
        }
        return tt;
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
