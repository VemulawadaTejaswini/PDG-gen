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

    int n,m;

    private void solve() {
        try {
            n = sc.nextInt();
            m = sc.nextInt();
            long sum = 0;
            int[] a = new int[n];
            int[][] bc = new int[m][2];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            Arrays.sort(a);
            for (int i = 0; i < m; i++) {
                bc[i][0] = sc.nextInt();
                bc[i][1] = sc.nextInt();
            }

            Arrays.sort(bc, new Comparator<int[]>() {
                @Override
                public int compare(int[] ints, int[] t1) {
                    return t1[1] - ints[1];
                }
            });

            int index = 0;

            for (int i = 0; i < m; i++) {
                int b = bc[i][0];
                int c = bc[i][1];
                int j = index;
                while (j < n && j < index + b && a[j] < c) {
                    sum += c - a[j];
                    a[j] = c;
                    j++;
                }
                index = j;
            }

            System.out.println(sum);


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