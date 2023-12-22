import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        String S = in.next();
        char[] cs = S.toCharArray();
        int length = S.length();

        int bmax = 1;
        boolean[] b = new boolean[bmax + 2];
        b[0] = true;
        int[] map = new int[bmax + 2];
        for (int i = 0; i < length; i++) {
            boolean[] nb = new boolean[bmax + 2];
            int[] next = new int[bmax + 2];
            if (cs[i] != '1') {
                for (int j = 0; j < bmax; j++) if (b[j]) {
                    if (map[j] != 0 || cs[i] == '0') {
                        next[j + 1] = Math.max(0, map[j] - 1);
                        nb[j + 1] = true;
                        if (j + 1 == bmax) bmax++;
                    }
                }
            }
            if (cs[i] != '0') {
                if (b[0]) {
                    if (nb[0])
                        next[0] = Math.min(next[0], map[0] + 1);
                    else
                        next[0] = map[0] + 1;
                    nb[0] = true;
                }
                for (int j = 1; j < bmax; j++) if (b[j]) {
                    if (nb[j - 1])
                        next[j - 1] = Math.min(next[j - 1], map[j] + 1);
                    else
                        next[j - 1] = map[j] + 1;
                    nb[j - 1] = true;
                }
            }
            map = next;
            b = nb;
            boolean[] one = new boolean[length + 1];
            for (int j = 0; j < bmax; j++) if (b[j]) {
                if (one[map[j]])
                    b[j] = false;
                else
                    one[map[j]] = true;
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= bmax; i++) if (b[i])
            ans = Math.min(ans, i + map[i]);
        out.println(ans);

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

