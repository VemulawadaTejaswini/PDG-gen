import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();

        long ans[][] = new long[C + 1][D + 1];
        long i = 1;
        for (int c = C; c >= A; c--) {
            ans[c][D] = i;
            i *= D;
            i %= MOD;
        }
        i = 1;
        for (int d = D; d >= B; d--) {
            ans[C][d] = i;
            i *= C;
            i %= MOD;
        }
        for (int a = C - 1; a >= A; a--) {
            i = 0;
            for (int b = D - 1; b >= B; b--) {
                i += ans[a + 1][b + 1];
                i *= a;
                i %= MOD;
                ans[a][b] = (i + ans[a + 1][b] * b) % MOD;
            }
        }
        out.println(ans[A][B]);

        out.flush();
    }

    static final int MOD = 998244353;

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

