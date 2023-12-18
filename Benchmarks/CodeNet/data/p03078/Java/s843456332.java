
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    int x,y,z,k;
    private static Scanner sc;
    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            k = sc.nextInt();

            Long[] a = new Long[1001];
            Long[] b = new Long[1001];
            Long[] c = new Long[1001];

            for (int i = 0; i < x; i++) {
                a[i] = sc.nextLong();
            }

            for (int i = 0; i < y; i++) {
                b[i] = sc.nextLong();
            }

            for (int i = 0; i < z; i++) {
                c[i] = sc.nextLong();
            }

            List<Long> ab = new ArrayList<>();

            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    ab.add(a[i] + b[j]);
                }
            }

            ab.sort(Collections.reverseOrder());
            c = Arrays.copyOfRange(c, 0, z);
            Arrays.sort(c, Collections.reverseOrder());
            Long[] ck = Arrays.copyOfRange(c, 0, Math.min(c.length, k));

            List<Long> ans = new ArrayList<>();

            int maxrange = Math.min(k, ab.size());
            for (int i = 0; i < maxrange; i++) {
                for (int j = 0; j < Math.min(c.length, k); j++) {
                    ans.add(ab.get(i) + ck[j]);
                }
            }

            ans.sort(Collections.reverseOrder());


            for (int i = 0; i < k; i++) {
                System.out.println(ans.get(i));
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