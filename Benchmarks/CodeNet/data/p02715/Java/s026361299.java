import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.io.IOException;
import java.io.InputStream;

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
        ESumOfGcdOfTuplesHard solver = new ESumOfGcdOfTuplesHard();
        solver.solve(1, in, out);
        out.close();
    }

    static class ESumOfGcdOfTuplesHard {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.readInt();
            int k = in.readInt();
            int m = (int) 1e9 + 7;

//        System.out.println(pow(2, 50, m));
//        System.out.println(fpow(2, 50, m));
            System.out.println(gcdSum(n, k));
        }

        long gcdSum(int n, int k) {
            int m = (int) 1e9 + 7;
            long sum = 0;
            long[] seq = new long[k + 1];

            for (int i = k; i > 0; i--) {
                int div = k / i;
                if (div == 1)
                    seq[i] = 1;
                else {
                    seq[i] = fpow(div, n, m);
                    for (int tmp = i * 2; tmp <= k; tmp += i) {
                        seq[i] -= seq[tmp] % m;
                        seq[i] = (seq[i] + m) % m;
                    }

                }
            }

            for (int i = 1; i < seq.length; i++)
                sum = (i * seq[i] + sum) % m;


            return (sum + m) % m;
        }

        long fpow(int b, int e, int m) {
            if (e == 0)
                return 1;
            if (e == 1)
                return b;

            long res = fpow(b, e / 2, m);
            if (e % 2 == 0)
                return (res * res) % m;
            return (((res * res) % m) * b) % m;
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

