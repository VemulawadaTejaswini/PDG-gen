import java.io.*;
        import java.math.BigDecimal;
        import java.math.BigInteger;
        import java.util.*;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int X = in.nextInt();
        int Y = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int[] p = new int[A];
        int[] q = new int[B];
        int[] r = new int[C];
        for (int i = 0; i < A; i++)
            p[i] = in.nextInt();
        for (int i = 0; i < B; i++)
            q[i] = in.nextInt();
        for (int i = 0; i < C; i++)
            r[i] = in.nextInt();
        Arrays.sort(p);
        Arrays.sort(q);
        Arrays.sort(r);
        int[] apples = new int[X + Y];
        for (int i = 0; i < X; i++)
            apples[i] = p[A - 1 - i];
        for (int i = 0; i < Y; i++)
            apples[i + X] = q[B - 1 - i];
        Arrays.sort(apples);
        for (int i = 0; i < C && i < X + Y; i++)
            if (apples[i] < r[C - 1 - i])
                apples[i] = r[C - 1 - i];
            else
                break;
        long ans = 0;
        for (int i = 0; i < X + Y; i++)
            ans += apples[i];
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