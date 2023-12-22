import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    private static Scanner sc;

    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {
        try {
        	BigInteger m = BigInteger.valueOf((long)Math.pow(10, 9) + 7);
            int N = sc.nextInt();
            BigInteger A[] = new BigInteger[N];
            for (int i = 0; i < N; i++) {
                A[i] = BigInteger.valueOf(sc.nextLong());
            }
            BigInteger n = BigInteger.valueOf(0);
            for (int i = 1; i < N; i++) {
            	n = n.add(A[i]);
            }
            int j = 1;
        	long r = 0;
            for (int i = 0; i < N; i++) {
            	r += A[i].multiply(n).mod(m).longValue();
                if (i < N - 1) {
	                n = n.subtract(A[j]);
	                j++;
                }
            }
            System.out.println(Math.floorMod(r, m.longValue()));
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