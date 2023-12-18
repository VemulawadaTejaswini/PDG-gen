
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static Scanner sc;
    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] k = new int[m];
            int[][] s = new int[m][10];
            for (int i = 0; i < m; i++) {
                k[i] = sc.nextInt();
                for (int j = 0; j < k[i]; j++) {
                    s[i][j] = sc.nextInt();
                }
            }
            int[] p = new int[m];
            for (int i = 0; i < m; i++) {
                p[i] = sc.nextInt();
            }
            int ss = 0;
            for (int i = 0; i < 1 << n; i++) {
                List<Integer> list = new ArrayList<>();
                for (int j = 0; j < n; j++) {
                    if ((i >> j & 1) == 1) {
                        list.add(j);
                    }
                }
                for (int j = 0; j < list.size(); j++) {
                    int a = list.get(j);
                    boolean flag = true;
                    for (int l = 0; l < m; l++) {
                        int sum = 0;
                        for (int o = 0; o < k[l]; o++) {
                            if (s[l][o] == a) sum ++;
                        }
                        if (sum / 2 != p[l]) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) ss ++;
                }

            }

            System.out.println(ss);

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