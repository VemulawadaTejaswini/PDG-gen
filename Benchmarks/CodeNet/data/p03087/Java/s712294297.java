import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static Scanner sc;
    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {
            int N = sc.nextInt();
            int Q = sc.nextInt();
            String S = sc.next();
            String R = new StringBuffer(S).reverse().toString();
            int[] l = new int[S.length()];
            int[] r = new int[S.length()];
            Arrays.fill(l, 0);
            Arrays.fill(r, 0);
            int tmpl = 0;
            int tmpr = 0;
            for (int i = 1; i < S.length(); i++) {
                l[i] = tmpl;
                if (S.charAt(i-1) == 'A' && S.charAt(i) == 'C') {
                    tmpl++;
                    l[i] = tmpl;
                }

                r[i] = tmpr;
                if (R.charAt(i-1) == 'C' && R.charAt(i) == 'A') {
                    tmpr++;
                    r[i] = tmpr;
                }
            }
            int a, b;
            for (int i = 0; i < Q; i++) {
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println(tmpl - l[a-1] - r[S.length()-b]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private class Scanner {
        String[] s;
        int i;
        BufferedReader br;
        String regex = " ";

        public Scanner() {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        @Override
        protected void finalize() throws Throwable {
            try {
                super.finalize();
            } finally {
                destruction();
            }
        }

        private void destruction() throws IOException {
            if (br != null) br.close();
        }

        public String next() throws IOException {
            if (i < s.length) return s[i++];
            String st = br.readLine();
            while (st == "") st = br.readLine();
            s = st.split(regex, 0);
            i = 0;
            return s[i++];
        }

        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }

        public Long nextLong() throws NumberFormatException, IOException {
            return Long.parseLong(next());
        }

        public Double nextDouble() throws NumberFormatException, IOException {
            return Double.parseDouble(next());
        }
    }
}