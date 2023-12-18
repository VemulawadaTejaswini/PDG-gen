import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static Scanner sc;
    private static int[][] neg8 = new int[][]{{-1, -1}, {0, -1}, {1, -1}, {-1, 0}, {1, 0}, {-1, 1}, {0, 1}, {1, 1}};

    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {
            int[][] pattern = new int[][]{{1, 1, 1}, {1, 1,0}, {1,0,0}, {0,0,0}, {0,0,1}, {0,1,1}, {0, 1,0}, {1, 0, 1}};
            int A,B,C,D;
            String s = sc.next();
            A = Character.getNumericValue(s.charAt(0));
            B = Character.getNumericValue(s.charAt(1));
            C = Character.getNumericValue(s.charAt(2));
            D = Character.getNumericValue(s.charAt(3));

            int patternIndex = 0;
            for (int i = 0; i < pattern.length; i++) {
                int[] p = pattern[i];
                int ans = A;
                ans = p[0] == 1 ? ans + B : ans - B;
                ans = p[1] == 1 ? ans + C : ans - C;
                ans = p[2] == 1 ? ans + D : ans - D;
                if (ans == 7) {
                    patternIndex = i;
                    break;
                }
            }

            int[] hit = pattern[patternIndex];
            StringBuilder sb = new StringBuilder();
            sb.append(A);
            sb.append(hit[0]==1?"+":"-");
            sb.append(B);
            sb.append(hit[1]==1?"+":"-");
            sb.append(C);
            sb.append(hit[2]==1?"+":"-");
            sb.append(D);
            sb.append("=7");

            System.out.println(sb.toString());
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

