import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int D = in.nextInt();
        int[] c = new int[26];
        for (int i = 0; i < 26; i++)
            c[i] = in.nextInt();
        int[][] s = new int[D][26];
        for (int d = 0; d < D; d++) for (int i = 0; i < 26; i++)
            s[d][i] = in.nextInt();

        int[] ans = new int[D];
        for (int d = 0; d < D; d++)
            ans[d] = in.nextInt();
        for (int d = 0; d < D; d++)
            out.println(score(d + 1, c, s, ans));

        out.flush();
    }

    static long score(int D, int[] c, int[][] s, int[] array) {
        long S = 0;
        int[] last = new int[26];
        for (int d = 0; d < D; d++) {
            last[array[d] - 1] = d + 1;
            S += s[d][array[d] - 1];
            for (int i = 0; i < 26; i++)
                S -= c[i] * (d + 1 - last[i]);
        }
        return S;
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

