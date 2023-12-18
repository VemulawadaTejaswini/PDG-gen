import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int N = in.nextInt();
        String S = in.next();

        long ans = 0;
        int R = 0;
        int G = 0;
        int B = 0;
        for (int i = 0; i < N; i++) {
            switch (S.charAt(i)) {
                case 'R':
                    R++;
                    ans += G * B;
                    break;
                case 'G':
                    G++;
                    ans += R * B;
                    break;
                case 'B':
                    B++;
                    ans += R * G;
                    break;
            }
        }
        for (int i = 0; i < N; i++) {
            char Si = S.charAt(i);
            for (int j = i+1, k = i+2; k < N; j++, k+=2) {
                char Sj = S.charAt(j);
                char Sk = S.charAt(k);
                if (Si != Sj && Si != Sk && Sj != Sk) {
                    ans--;
                }
            }
        }
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
