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

        int[] a0 = f0(D, c, s);
        long s0 = score(D, c, s, a0);
        int[] a1 = f1(D, c, s);
        long s1 = score(D, c, s, a1);

        int[] ans = a0;
        if (s0 < s1)
            ans = a1;
        for (int i: ans)
            out.println(i);

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

    static int[] f0(int D, int[] c, int[][] s) {
        int[] ret = new int[D];
        int[] last = new int[26];
        long S = 0;
        for (int d = 0; d < D; d++) {
            int ans = 0;
            int max = Integer.MIN_VALUE;
            int sum = 0;
            for (int i = 0; i < 26; i++)
                sum += c[i] * (d + 1 - last[i]);
            for (int i = 0; i < 26; i++) {
                int dS = s[d][i] - sum + c[i] * (d + 1 - last[i]);
                if (max < dS) {
                    ans = i;
                    max = dS;
                }
            }
            last[ans] = d + 1;
            S += max;
            ret[d] = ans + 1;
        }
        return ret;
    }

    static int[] f1(int D, int[] c, int[][] s) {
        int[] ret = new int[D];
        int[] last = new int[26];
        for (int d = 0; d < D; d++) {
            int ans = 0;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < 26; i++) {
                int x = s[d][i] + c[i] * (d + 1 - last[i]) * (D - 1 - d);
                if (max < x) {
                    ans = i;
                    max = x;
                }
            }
            last[ans] = d + 1;
            ret[d] = ans + 1;
        }
        return ret;
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

