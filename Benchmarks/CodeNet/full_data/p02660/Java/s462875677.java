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
            int[] insuu = new int[1000000];
            int[] insuucount = new int[1000000];
            Arrays.fill(insuu, 0);
            Arrays.fill(insuucount, 0);
            int idx = 0;
            long aa = a;
            for (int i = 2; i <= (long) Math.sqrt(aa);) {
                if (a % i == 0) {
                    insuu[idx] = i;
                    insuucount[idx]++;
                    a = a / i;
                } else {
                    i++;
                    if (insuucount[idx] != 0)
                        idx++;
                }
                if (a == 1)
                    break;
            }
            if (a != 1) {
                System.out.println("1");
                return;
            }
            int count = 0;
            for (int i = 0; i <= idx; i++) {
                if (insuucount[i] == 0)
                    break;
                // System.out.println(insuu[i]+" "+insuucount[i]);
                int sum = insuucount[i];
                for (int j = insuucount[i] / 2 + 1; j >= 1; j--) {
                    if (sum - j >= 0) {
                        sum -= j;
                        count++;
                    }
                }
            }
            System.out.println(count);
        } catch (

        final Exception e) {
            e.printStackTrace();
        }
    }

}