
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static Scanner sc;
    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {
            int n,a,b,c,d;
            String s;
            n = sc.nextInt();
            a = sc.nextInt() - 1;
            b = sc.nextInt() - 1;
            c = sc.nextInt() - 1;
            d = sc.nextInt() - 1;
            s = sc.next();

            boolean aflag = true;
            for (int i = a + 1; i < c; i++) {
                if (s.charAt(i-1) == '#' && s.charAt(i) == '#') {
                    aflag = false;
                }
            }
            boolean bflag = true;
            for (int i = b + 1; i < d; i++) {
                if (s.charAt(i-1) == '#' && s.charAt(i) == '#') {
                    bflag = false;
                }
            }
            if (!aflag || !bflag) {
                System.out.println("No");
            } else {
                if (c < d) {
                    System.out.println("Yes");
                } else {
                    boolean switchflag = false;
                    for (int i = b; i < d; i++) {
                        if (s.charAt(i-1) == '.' &&
                                s.charAt(i) == '.' &&
                                s.charAt(i+1) == '.') {
                            switchflag = true;
                        }
                    }
                    if (switchflag) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                }
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