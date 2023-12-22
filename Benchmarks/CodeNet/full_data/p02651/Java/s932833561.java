import java.util.*;
import java.io.*;

public class Main {
    static long [] basis; static int sz; static boolean ok;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int t = sc.nextInt();
        for (int tt = 0; tt < t; tt++) {
            int n = sc.nextInt();
            long [] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            String s = sc.next();
            basis = new long[62]; sz = 0;
            Arrays.fill(basis, -1);
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') insertVector(a[i], false);
            }
            ok = true;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') insertVector(a[i], true);
            }
            out.println(ok ? 0 : 1);
        }
        out.close();
    }

    static void insertVector(long x, boolean represent) {
        for (int bit = 0; bit < 62; bit++) {
            if (((x >> bit) & 1) == 0) continue;
            if (basis[bit] == -1) {
                if (represent) {
                    ok = false;
                    return;
                }
                basis[bit] = x;
                ++sz;
                return;
            }
            x ^= basis[bit];
        }
    }



    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
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

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }


    }

}