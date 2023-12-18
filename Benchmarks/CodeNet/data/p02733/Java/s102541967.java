import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EDividingChocolate solver = new EDividingChocolate();
        solver.solve(1, in, out);
        out.close();
    }

    static class EDividingChocolate {
        PrintWriter out;
        InputReader in;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            this.out = out;
            this.in = in;
            int h = ni();
            int w = ni();
            int k = ni();
            int[][] mat = new int[h][w];
            int i = 0, j = 0;
            for (i = 0; i < h; i++) {
                String st = n();
                for (j = 0; j < w; j++)
                    mat[i][j] = st.charAt(j) - '0';
            }
            int min = 10000000;
            for (int mask = 0; mask < (1 << (h - 1)); mask++) {
                int[] grps = new int[h];
                int c = 0;
                boolean can_be_done = true;
                for (i = 0; i < w; i++) {
                    int p = 0;
                    for (j = 0; j < h; j++) {
                        grps[p] += mat[j][i];
                        if ((mask & (1 << j)) > 0)
                            p++;
                    }
                    boolean ok = true;
                    for (j = 0; j <= p; j++) {
                        if (grps[j] > k)
                            ok = false;
                    }
                    //pn(Arrays.toString(grps) +" "+ok+" "+k);
                    if (!ok) {
                        c++;
                        p = 0;
                        Arrays.fill(grps, 0);
                        ok = true;
                        for (j = 0; j < h; j++) {
                            grps[p] += mat[j][i];
                            if ((mask & (1 << j)) > 0)
                                p++;
                        }
                        if (!ok) {
                            can_be_done = false;
                        }
                    }
                }
                if (can_be_done) {
                    //pn(Integer.toBinaryString(mask) + " "+(c));
                    min = Math.min(min, c + Integer.bitCount(mask));
                }
            }
            pn(min);
        }

        String n() {
            return in.next();
        }

        int ni() {
            return in.nextInt();
        }

        void pn(long zx) {
            out.println(zx);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new UnknownError();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new UnknownError();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuffer res = new StringBuffer();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));

            return res.toString();
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

