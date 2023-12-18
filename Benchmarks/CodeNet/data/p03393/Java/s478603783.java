import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.Writer;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author palayutm
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        boolean isDiverse(char[] s) {
            for (int i = 0; i < s.length; i++) {
                for (int j = 0; j < i; j++) {
                    if (s[i] == s[j]) {
                        return false;
                    }
                }
            }
            return true;
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            char[] s = in.nextCharArray(30);
            if (s.length < 26) {
                char[] t = new char[s.length + 1];
                System.arraycopy(s, 0, t, 0, s.length);
                for (int i = 'a'; i <= 'z'; i++) {
                    t[s.length] = (char) i;
                    if (isDiverse(t)) {
                        out.println(t);
                        return;
                    }
                }
            } else {
                for (int i = 25; i >= 0; i--) {
                    char c = s[i];
                    for (int j = c + 1; j <= 'z'; j++) {
                        s[i] = (char) j;
                        char[] t = Arrays.copyOf(s, i + 1);
                        if (isDiverse(t)) {
                            out.println(t);
                            return;
                        }
                    }
                    s[i] = c;
                }
                out.println(-1);
            }
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] inbuf = new byte[1024];
        private int lenbuf = 0;
        private int ptrbuf = 0;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        private int readByte() {
            if (lenbuf == -1) throw new UnknownError();
            if (ptrbuf >= lenbuf) {
                ptrbuf = 0;
                try {
                    lenbuf = stream.read(inbuf);
                } catch (IOException e) {
                    throw new UnknownError();
                }
                if (lenbuf <= 0) return -1;
            }
            return inbuf[ptrbuf++];
        }

        private boolean isSpaceChar(int c) {
            return !(c >= 33 && c <= 126);
        }

        private int skip() {
            int b;
            while ((b = readByte()) != -1 && isSpaceChar(b)) ;
            return b;
        }

        public char[] nextCharArray(int n) {
            char[] buf = new char[n];
            int b = skip(), p = 0;
            while (p < n && !(isSpaceChar(b))) {
                buf[p++] = (char) b;
                b = readByte();
            }
            return n == p ? buf : Arrays.copyOf(buf, p);
        }

    }

    static class OutputWriter extends PrintWriter {
        public OutputWriter(OutputStream out) {
            super(out);
        }

        public OutputWriter(Writer out) {
            super(out);
        }

        public void close() {
            super.close();
        }

    }
}

