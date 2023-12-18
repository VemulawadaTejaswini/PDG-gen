//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.InputMismatchException;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Main.InputReader in = new Main.InputReader(inputStream);
        Main.OutputWriter out = new Main.OutputWriter(outputStream);
        Main.TaskA solver = new Main.TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            this.writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            this.writer.close();
        }

        public void println(int i) {
            this.writer.println(i);
        }
    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private Main.InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (this.numChars == -1) {
                throw new InputMismatchException();
            } else {
                if (this.curChar >= this.numChars) {
                    this.curChar = 0;

                    try {
                        this.numChars = this.stream.read(this.buf);
                    } catch (IOException var2) {
                        throw new InputMismatchException();
                    }

                    if (this.numChars <= 0) {
                        return -1;
                    }
                }

                return this.buf[this.curChar++];
            }
        }

        public int nextInt() {
            int c;
            for(c = this.read(); this.isSpaceChar(c); c = this.read()) {
                ;
            }

            int sgn = 1;
            if (c == 45) {
                sgn = -1;
                c = this.read();
            }

            int res = 0;

            while(c >= 48 && c <= 57) {
                res *= 10;
                res += c - 48;
                c = this.read();
                if (this.isSpaceChar(c)) {
                    return res * sgn;
                }
            }

            throw new InputMismatchException();
        }

        public boolean isSpaceChar(int c) {
            return this.filter != null ? this.filter.isSpaceChar(c) : isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == 32 || c == 10 || c == 13 || c == 9 || c == -1;
        }

        public interface SpaceCharFilter {
            boolean isSpaceChar(int var1);
        }
    }

    static class TaskA {
        TaskA() {
        }

        public void solve(int testNumber, Main.InputReader in, Main.OutputWriter out) {
            int x = in.nextInt();
            int y = in.nextInt();
            if (x % y == 0) {
                out.println(-1);
            } else {
                out.println(x);
            }

        }
    }
}
