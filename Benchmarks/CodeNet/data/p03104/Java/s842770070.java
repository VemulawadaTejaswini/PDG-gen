import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
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
        OutputWriter out = new OutputWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            long A = in.readLong();
            long B = in.readLong();
            String binA = Long.toBinaryString(A);
            String binB = Long.toBinaryString(B);
            for (int i = 0; i < binB.length() - binA.length(); i++) {
                binA = '0' + binA;
            }

            int[] numOfOneByDigit = new int[binB.length()];
            long digit;
            long QofA;//商
            long RofA;//あまり
            long QofB;
            long RofB;
            for (int i = 0; i < binB.length(); i++) {
                digit = (long) Math.pow(2, i);
                QofA = A / digit;
                RofA = A % digit;
                QofB = B / digit;
                RofB = B % digit;

                if (i == 0) {
                    if (A + 1 == B) {
                        numOfOneByDigit[i] = 1;
                        continue;
                    }
                    if (A % 2 == 1) {
                        numOfOneByDigit[i] += (B - A + 1) / 2;
                    } else {
                        numOfOneByDigit[i] += (B - A) / 2;
                    }
                    numOfOneByDigit[i] += B % 2;
                } else {
                    if (QofA == QofB) {
                        if (QofA % 2 == 0) {
                            if (QofB % 2 == 0) {
                                continue;
                            } else {
                                numOfOneByDigit[i] += RofB + 1;
                            }
                        } else {
                            numOfOneByDigit[i] += (RofB - RofA + 1);
                        }
                        continue;
                    }
                    if (QofA % 2 == 0) {
                        numOfOneByDigit[i] += digit;
                    } else {
                        numOfOneByDigit[i] += digit - RofA;
                    }
                    if (QofB % 2 == 1) {
                        numOfOneByDigit[i] += RofB + 1;
                    }
                }
            }

            String strAns = "";
            for (int i = 0; i < binB.length(); i++) {
                strAns = (numOfOneByDigit[i] % 2) + strAns;
            }
            out.printLine(Long.parseLong(strAns, 2));
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

        public void close() {
            writer.close();
        }

        public void printLine(long i) {
            writer.println(i);
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

        public long readLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
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
}

