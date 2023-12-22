import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    FastScanner in;
    PrintWriter out;

    void solve() {
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int left = 0, right = (int) 1e9 + 10;
        while (right - left > 1) {
            int mid = (left + right) >>> 1;
            long need = 0;
            for (int ai : a) {
                need += (ai - 1) / mid;
            }
            if (need <= k) {
                right = mid;
            } else {
                left = mid;
            }
        }
        out.println(right);
    }

    final int mod = (int) 1e9 + 7;
    final int MAX = (int) 2e6 + 10;

    void init() {
        fact = new int[MAX];
        fact[0] = 1;
        for (int i = 1; i < MAX; i++) {
            fact[i] = mul(fact[i - 1], i);
        }
        factInv = new int[MAX];
        factInv[MAX - 1] = BigInteger.valueOf(fact[MAX - 1]).modInverse(BigInteger.valueOf(mod)).intValue();
        for (int i = MAX - 1; i > 0; i--) {
            factInv[i - 1] = mul(factInv[i], i);
        }
    }

    int c(int n, int k) {
        if (k < 0 || k > n) {
            return 0;
        }
        return mul(fact[n], mul(factInv[k], factInv[n - k]));
    }

    int[] fact;
    int[] factInv;

    int mul(int x, int y) {
        return (int) ((x * 1L * y) % mod);
    }

    int add(int x, int y) {
        x += y;
        return x >= mod ? (x - mod) : x;
    }

    void run() {
        try {
            in = new FastScanner(new File("Main.in"));
            out = new PrintWriter(new File("Main.out"));

            solve();

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void runIO() {

        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);

        solve();
        out.close();
    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        boolean hasMoreTokens() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return false;
                st = new StringTokenizer(s);
            }
            return true;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}