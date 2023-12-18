import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    int n, k;
    String s;
    private static Scanner sc;
    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {
            n = sc.nextInt();
            k = sc.nextInt();
            s = sc.next();
            List<Integer> index = new ArrayList<>();
            char current = '0';
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    index.add(i);
                    current = s.charAt(i);
                } else if (current != s.charAt(i)) {
                    index.add(i);
                    current = current == '0' ? '1' : '0';
                }
            }

            int lim = index.size();
            for (int i = 0; i < 3 * k; i++) {
                index.add(n);
            }

            int max = 0;

            for (int i = 0; i < lim; i++) {
                int tmpmax;
                if (s.charAt(index.get(i)) == '0') {
                    tmpmax = index.get(i + 2*k) - index.get(i);
                } else {
                    tmpmax = index.get(i + 2*k + 1) - index.get(i);
                }
                if (max < tmpmax) {
                    max = tmpmax;
                }
            }

            System.out.println(max);

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