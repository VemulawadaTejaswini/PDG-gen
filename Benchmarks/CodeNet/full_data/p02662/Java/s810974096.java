import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    static int N;
    static int S;
    static int[] A;

    public static void main(String[] args) {
        N = in.nextInt();
        S = in.nextInt();
        A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = in.nextInt();
        dp = new long[N][S];
        for (int i = 0; i < N; i++) for (int j = 0; j < S; j++)
            dp[i][j] = -1;
        out.println(dp(0, 0, 0));
        out.flush();
    }

    static long dp[][];

    private static long dp(int n, int s, int c) {
        if (s == S) return mPow(2, N - c);
        if (s > S || n >= N) return 0;
        if (dp[n][s] == 0) return 0;
        if (dp[n][s] > 0) return (dp[n][s] * mInv(mPow(2, c))) % MOD;
        long l = (dp(n + 1, s, c) + dp(n + 1, s + A[n], c + 1)) % MOD;
        dp[n][s] = (l * mPow(2, c)) % MOD;
        return l;
    }

    static final int MOD = 1_000_000_007;
    static long mPow(long a, long b) {
        long ret = 1;
        while (b > 0) {
            if (b % 2 == 1)
                ret = (ret * a) % MOD;
            a = (a * a) % MOD;
            b /= 2;
        }
        return ret;
    }
    static long mInv(long a) {
        return mPow(a, MOD - 2);
    }

    static class Input {
        private BufferedReader br;
        private String[] buff;
        private int index = 0;

        Input(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
        }
        String nextLine() {
            try {
                return br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        String next() {
            while (buff == null || index >= buff.length) {
                buff = nextLine().split(" ");
                index = 0;
            }
            return buff[index++];
        }
        byte nextByte() {
            return Byte.parseByte(next());
        }
        short nextShort() {
            return Short.parseShort(next());
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        float nextFloat() {
            return Float.parseFloat(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        BigInteger nextBigInteger() {
            return new BigInteger(next());
        }
        BigDecimal nextBigDecimal() {
            return new BigDecimal(next());
        }
    }
}

