import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int H = in.nextInt();
        int W = in.nextInt();
        int K = in.nextInt();
        boolean[][] black = new boolean[H][W];
        for (int h = 0; h < H; h++) {
            String str = in.next();
            for (int w = 0; w < W; w++)
                black[h][w] = (str.charAt(w) == '#');
        }

        int ans = 0;
        boolean[] bh = new boolean[H + 1];
        while (!bh[H]) {
            boolean[] bw = new boolean[W + 1];
            while(!bw[W]) {
                int blacks = 0;
                for (int h = 0; h < H; h++) if (bh[h])
                    for (int w = 0; w < W; w++) if (bw[w])
                        if (black[h][w]) blacks++;
                if (blacks == K)
                    ans++;
                int i = -1;
                do {
                    i++;
                    bw[i] = !bw[i];
                } while (!bw[i]);
            }
            int i = -1;
            do {
                i++;
                bh[i] = !bh[i];
            } while (!bh[i]);
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

