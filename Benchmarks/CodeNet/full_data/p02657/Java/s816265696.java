import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.math.*;

public class Main {
    private static Scanner sc;

    public static void main(final String[] args) {
        final Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
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
            if (br != null)
                br.close();
        }

        public String next() throws IOException {
            if (i < s.length)
                return s[i++];
            String st = br.readLine();
            while (st == "")
                st = br.readLine();
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

    private void solve() {
        try {
            // int n = sc.nextInt();
            // long[] a = new long[n];
            // for (int i = 0; i < n; i++) {
            // a[i]=sc.nextLong();
            // }
            // String input = "[0.0, 1.0, 0.0]";
            String input = sc.next();
            // String tmp_s = input.replace("[", "").replace("]", "").replace(" ", "");
            String tmp_s = input.replace("[", "").replace("]", "").replace(" ", "");
            System.out.println(tmp_s);
            List<String> list = Arrays.asList(tmp_s.split(","));
            int idx = 0;
            for (String s : list) {
                if (!list.get(idx).equals("0.0")) {
                    System.out.println(idx + ":" + s);
                }
                idx++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void solve(String input) {
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a*b);             
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
