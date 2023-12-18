
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    int N;
    int centh = 0;
    int[][] xyh = new int[100][];
    private static Scanner sc;
    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {
            N = sc.nextInt();
            for (int i = 0; i < N; i++) {
                xyh[i] = new int[3];
                xyh[i][0] = sc.nextInt();
                xyh[i][1] = sc.nextInt();
                xyh[i][2] = sc.nextInt();
            }

            for (int x = 0; x <= 100; x++) {
                for (int y = 0; y <= 100; y++) {
                    Boolean b = check(x, y);
                    if (b) {
                        System.out.println(String.format("%d %d %d", x, y, centh));
                    }
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private Boolean check (int x, int y) {
        for (int i = 0; i < N; i++) {
            if (xyh[i][2] > 0) {
                centh = xyh[i][2] + Math.abs(x-xyh[i][0]) + Math.abs(y-xyh[i][1]);
                break;
            }
        }
        int tmph;
        for (int i = 0; i < N; i++) {
            tmph = Math.max(centh-Math.abs(x-xyh[i][0])-Math.abs(y-xyh[i][1]), 0);
            if (tmph != xyh[i][2]) return false;
        }
        return true;
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