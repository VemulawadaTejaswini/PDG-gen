
import java.io.*;
import java.util.*;

public class Main {
    private void solve() {
        int n = sc.nextInt();
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < n; i++) {
            sb.append(Math.abs(s.charAt(i) - s.charAt(i - 1)));
        }

        if (n == 2) {
            out.println(sb.charAt(0));
            return;
        }

        s = sb.toString();
        if (s.contains("1")) {
            int m = n - 2;
            int ans = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1' && (m & i) == i) {
                    ans ^= 1;
                }
            }
            out.println(ans);
        } else {
            out.println(Math.abs(s.charAt(0) - s.charAt(n - 2)));
        }
    }

    private static PrintWriter out;
    private static MyScanner sc;

    private static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        private MyScanner() {
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
    }

    public static void main(String[] args) {
        out = new PrintWriter(new BufferedOutputStream(System.out));
        sc = new MyScanner();
        new Main().solve();
        out.close();
    }
}