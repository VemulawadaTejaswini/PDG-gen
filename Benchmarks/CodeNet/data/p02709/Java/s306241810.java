import java.io.*;
        import java.math.BigDecimal;
        import java.math.BigInteger;
        import java.util.*;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int N = in.nextInt();
        int[] A = new int[N];
        Integer[] index = new Integer[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
            index[i] = i;
        }
        Arrays.sort(index, Comparator.comparingInt(i -> -A[i]));
        long[][] dp = new long[N + 1][N + 1];
        for (int n = 0; n < N; n++) {
            for (int i = 0; i <= n; i++) {
                dp[n + 1][i] = Math.max(dp[n + 1][i], dp[n][i] + ((long)A[index[n]]) * Math.abs(N - 1 - n + i - index[n]));
                dp[n + 1][i + 1] = dp[n][i] + ((long)A[index[n]]) * (index[n] - i);
            }
        }
        long max = 0;
        for (int n = 0; n <= N; n++) {
            max = Math.max(max, dp[N][n]);
        }
        out.println(max);
        out.flush();
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