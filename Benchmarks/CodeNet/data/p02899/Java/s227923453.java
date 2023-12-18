
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[sc.nextInt()-1] = i+1;
            }

            for (int i = 0; i < n; i++) {
                System.out.print(a[i]);
                if (i < n - 1)System.out.print(" ");
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

    long modinverse(long a, long m) {
        long b = m, u = 1, v = 0;
        while (b > 0) {
            long tmp;
            long t = a / b;

            a -= t * b;
            tmp = a;
            a = b;
            b = tmp;

            u -= t * v;
            tmp = u;
            u = v;
            v = tmp;
        }
        u %= m;
        if (u < 0) u += m;
        return u;
    }

    long moddiv(long a, long b, int MOD) {
        a %= MOD;
        return a * modinverse(b, MOD) % MOD;
    }

    long modpow(long a, long n, int MOD) {
        long res = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = res * a % MOD;
            }
            a = a * a % MOD;
            n >>= 1;

        }
        return res;
    }

    static class PermutationCombination {
        private long[] factorial, finverse, inverse;
        private int MOD;

        public PermutationCombination(int MAX, int MOD) {
            MAX++;
            this.factorial = new long[MAX];
            this.finverse = new long[MAX];
            this.inverse = new long[MAX];
            this.MOD = MOD;

            this.factorial[0] = this.factorial[1] = 1;
            this.finverse[0] = this.finverse[1] = 1;
            this.inverse[1] = 1;
            for (int i = 2; i < MAX; i++) {
                this.factorial[i] = this.factorial[i - 1] * i % MOD;
                this.inverse[i] = MOD - this.inverse[MOD % i] * (MOD / i) % MOD;
                this.finverse[i] = this.finverse[i - 1] * this.inverse[i] % MOD;
            }
        }

        public long combination(int n, int k) {
            if (n < k) {
                return 0;
            }
            if (n < 0 || k < 0) {
                return 0;
            }
            return this.factorial[n] * (this.finverse[k] * this.finverse[n - k] % this.MOD) % this.MOD;
        }

        public long permutation(int n, int k) {
            if (n < k) {
                return 0;
            }
            if (n < 0 || k < 0) {
                return 0;
            }
            return this.factorial[n] * (this.finverse[n - k] % this.MOD) % this.MOD;
        }

    }
}