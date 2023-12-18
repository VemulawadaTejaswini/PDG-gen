import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    private static boolean debug = false;
    private static boolean elapsed = false;

    private static PrintWriter _out = new PrintWriter(System.out);
    private static PrintWriter _err = new PrintWriter(System.err);

    private void solve(BufferedReader in) throws IOException {
        int N = Integer.parseInt(in.readLine());
        long[] A = new long[N];
        long[] B = new long[N];
        for (int i = 0; i < N; ++i) {
            String[] s = in.readLine().split(" ");
            A[i] = Long.parseLong(s[0]);
            B[i] = Long.parseLong(s[1]);
        }

        long ans = 0;
        for (int i = N - 1; i >= 0; --i) {
            A[i] += ans;
            long r = A[i] % B[i];
            if (r > 0) {
                ans += B[i] - r;
            }
        }
        _out.println(ans);
    }
    private static BigInteger C(long n, long r) {
        BigInteger res = BigInteger.ONE;
        for (long i = n; i > n - r; --i) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        for (long i = r; i > 1; --i) {
            res = res.divide(BigInteger.valueOf(i));
        }
        return res;
    }
    private static BigInteger P(long n, long r) {
        BigInteger res = BigInteger.ONE;
        for (long i = n; i > n - r; --i) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
    /*
     * 10^10 > Integer.MAX_VALUE = 2147483647 > 10^9
     * 10^19 > Long.MAX_VALUE = 9223372036854775807L > 10^18
     */
    public static void main(String[] args) throws IOException {
        long S = System.currentTimeMillis();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        new Main().solve(in);
        _out.flush();

        long G = System.currentTimeMillis();
        if (elapsed) {
            _err.println((G - S) + "ms");
        }
        _err.flush();
    }
}