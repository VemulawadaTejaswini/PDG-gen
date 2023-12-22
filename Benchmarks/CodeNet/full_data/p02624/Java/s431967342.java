import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Spandan Mishra
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DSumOfDivisors solver = new DSumOfDivisors();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSumOfDivisors {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.readInt();
            int[] d = new int[n + 1];

            Arrays.fill(d, 2);
            d[0] = 0;
            d[1] = 1;

            // 1_ 1_ 1_ 1_


            for (int i = 2; i * i <= n; i++) {
                for (int j = i; j <= n / i; j++) {
                    if ((long) i * j > n)
                        break;

                    if (i == j)
                        d[i * j]++;
                    else
                        d[i * j] += 2;
                }
            }

//        System.out.println(Arrays.toString(d));
            long sum = 0;

            for (int i = 1; i <= n; i++)
                sum += (long) i * d[i];

            System.out.println(sum);


            // ------------------------
//
//        Set<Integer>[] d = new HashSet[n + 1];
//        for (int i = 1; i <= n; i++) {
//            d[i] = new HashSet<>();
//            d[i].add(i);
//            d[i].add(1);
//        }
//
//        for (int i = 2; i * i <= n; i++) {
//            for (int j = 2; j <= n / i; j++) {
//                if ((long) i * j > n)
//                    break;
//
//                d[i * j].add(i);
//                d[i * j].add(j);
//
//            }
//        }
//        System.out.println(Arrays.toString(d));
//        long sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += (long) i * d[i].size();
//        }
//
//        System.out.println(sum);
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
                throw new RuntimeException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new RuntimeException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int readInt() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

