import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Mufaddal Naya
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        ECoprime solver = new ECoprime();
        solver.solve(1, in, out);
        out.close();
    }

    static class ECoprime {
        public void solve(int testNumber, InputReader c, OutputWriter w) {
//    	w.print("Case #"+testNumber+": ");

            int maxn = (int) (1e6 + 10);
            boolean[] is_prime = new boolean[maxn];
            for (int i = 2; i < maxn; i++) {
                is_prime[i] = true;
            }

            ArrayList<Integer>[] primeDivisors = new ArrayList[maxn];
            for (int i = 0; i < maxn; i++) {
                primeDivisors[i] = new ArrayList<>();
            }
            for (int i = 2; i < maxn; ++i) {
                if (is_prime[i]) {
                    primeDivisors[i].add(i);
                    for (int j = i * 2; j < maxn; j += i) {
                        primeDivisors[j].add(i);
                        is_prime[j] = false;
                    }
                }
            }

            int n = c.readInt();
            int[] a = c.readIntArray(n);
            int gcd = 0;
            for (int xx : a) {
                gcd = Utils.gcd(gcd, xx);
            }
            HashSet<Integer> ex = new HashSet<>();

            for (int xx : a) {
                for (int div : primeDivisors[xx]) {
                    if (ex.contains(div)) {
                        if (gcd != 1) {
                            w.printLine("not coprime");
                        } else {
                            w.printLine("setwise coprime");
                        }
                        return;
                    }
                    ex.add(div);
                }
            }

            w.printLine("pairwise coprime");

        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int[] readIntArray(int size) {
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = readInt();
            }
            return array;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int readInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void printLine(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

    }

    static class Utils {
        public static int gcd(int a, int b) {
            if (b == 0) {
                return a;
            }
            return gcd(b, a % b);
        }

    }
}

