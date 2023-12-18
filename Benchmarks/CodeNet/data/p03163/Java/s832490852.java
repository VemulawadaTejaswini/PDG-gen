import java.io.*;
import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class D {

    private static final FastScanner fs = new FastScanner();

    public static void main(String[] args) {
        D ob = new D();
//        int t = fs.nextInt();
        int t = 1;
        for (int i = 1; i <= t; i++) {
            // System.out.print("Case #" + i + ": ");
            ob.solve();
        }
    }
    
    int n, w;
    int[] weights, values;
    long[][] memo;

    private void solve() {
        n = fs.nextInt();
        w = fs.nextInt();
        weights = new int[n];
        values = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = fs.nextInt();
            values[i] = fs.nextInt();
        }
        memo = new long[n + 1][w + 1];
        for (int i = 0; i <= n; i++) Arrays.fill(memo[i], -1);
        for (int j = 0; j <= w; j++) memo[n][j] = 0;
        for (int i = 0; i<= n; i++) memo[i][0] = 0;
        System.out.println(dp(0, w));
    }
    
    private long dp(int i, int j) {
        if (memo[i][j] != -1) return memo[i][j];
        long val = dp(i + 1, j);
        if (weights[i] <= j) {
            val = max(val, values[i] + dp(i + 1, j - weights[i]));
        }
        memo[i][j] = val;
        return val;
    }

    private static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        public String next() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                } 
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] intArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public long[] longArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }
    }

}
