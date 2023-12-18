import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt(); int k = sc.nextInt();
        long [] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextLong();
        long [] pref = new long[n + 1];
        long [] actual = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            if (a[i - 1] >= 0) pref[i] = pref[i - 1] + a[i - 1]; else pref[i] = pref[i - 1];
            actual[i] = actual[i - 1] + a[i - 1];
        }
        long ans = Long.MIN_VALUE;
        for (int i = k; i <= n; i++) {
            long before = pref[i - k];
            long after = pref[n] - pref[i];
            long middle = actual[i] - actual[i - k];
            ans = Math.max(before + after, ans);
            ans = Math.max(before + after + middle, ans);
        }
        out.println(ans);
        out.close();
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