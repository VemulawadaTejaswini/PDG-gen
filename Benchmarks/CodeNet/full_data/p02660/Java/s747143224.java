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
            long a;
            a = sc.nextLong();
            int count = 0;
            if (a == 1) {
                System.out.println(0);
                return;
            }
            for (int i = 2; i * i <= a; i += 2) {
                int loop = 0;
                while (a % i == 0) {
                    a /= i;
                    loop++;
                }
                for (int j = 1; j <= loop; j++) {
                    loop -= j;
                    count++;
                }
                if (a == 1)
                    break;
                if (i == 2)
                    i--;
            }
            if (a != 1) {
                System.out.println(1);
                return;
            }
            System.out.println(count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
