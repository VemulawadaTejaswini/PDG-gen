import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        String T = in.next();

        long ans = 0;
        int length = T.length();
        for (int i = 0; i < length; i++) {
            ans += score(T);
            T = maxS(T);
        }
        out.println(ans);

        out.flush();
    }

    static String maxS(String s) {
        int score = score(s.substring(1));
        int max = score;
        int id = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (i % 2 == 1) {
                if (s.charAt(i - 1) == '1')
                    score++;
                if (s.charAt(i) == '1')
                    score--;
            }
            if (score > max || (score == max && s.charAt(i) == '0')) {
                max = score;
                id = i;
            }
        }
        return s.substring(0, id) + s.substring(id + 1, length);
    }

    static int score(String s) {
        int ret = 0;
        int length = s.length();
        for (int i = 0; i < length; i += 2) if (s.charAt(i) == '1')
            ret++;
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

