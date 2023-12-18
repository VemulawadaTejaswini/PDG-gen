import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyInput in = new MyInput(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int q = in.nextInt();
            while (q-- > 0) {
                int a = in.nextInt();
                int b = in.nextInt();
                int c = in.nextInt();
                int d = in.nextInt();

                char c0 = 'A';
                char c1 = 'B';
                if (a < b) {
                    int t = a;
                    a = b;
                    b = t;
                    c0 = 'B';
                    c1 = 'A';
                }

                char[] cs = new char[a + b];
                Arrays.fill(cs, c0);
                int sep = (a + b) / (b + 1);
//            dump(a, b, sep);
                int cnt = b;
                if (c0 == 'A') {
                    for (int i = 0, j = sep; i < b && j < a + b; i++, j += sep + 1, cnt--) {
                        cs[j] = c1;
                    }
                    int cont = 0;
                    for (int i = a + b - 1; cnt > 0; i--) {
                        if (cs[i] == c1) {
                            cont++;
                            continue;
                        }
                        if (cont < sep || cs[i - 1] == c1 && cont + 1 < sep) {
                            cs[i] = c1;
                            cnt--;
                            cont++;
                        } else {
                            cont = 0;
                        }
                    }
                } else {
                    for (int i = 0, j = a + b - 1 - sep; i < b && j >= 0; i++, j -= sep + 1, cnt--) {
                        cs[j] = c1;
                    }
                    int cont = 0;
                    for (int i = 0; cnt > 0; i++) {
                        if (cs[i] == c1) {
                            cont++;
                            continue;
                        }
                        if (cont < sep || cs[i + 1] == c1 && cont + 1 < sep) {
                            cs[i] = c1;
                            cnt--;
                            cont++;
                        } else {
                            cont = 0;
                        }
                    }
                }
//            out.println(new String(cs));
                out.println(new String(cs, c - 1, d - c + 1));
//            break;
            }
        }

    }

    static class MyInput {
        private final BufferedReader in;
        private static int pos;
        private static int readLen;
        private static final char[] buffer = new char[1024 * 8];
        private static char[] str = new char[500 * 8 * 2];
        private static boolean[] isDigit = new boolean[256];
        private static boolean[] isSpace = new boolean[256];
        private static boolean[] isLineSep = new boolean[256];

        static {
            for (int i = 0; i < 10; i++) {
                isDigit['0' + i] = true;
            }
            isDigit['-'] = true;
            isSpace[' '] = isSpace['\r'] = isSpace['\n'] = isSpace['\t'] = true;
            isLineSep['\r'] = isLineSep['\n'] = true;
        }

        public MyInput(InputStream is) {
            in = new BufferedReader(new InputStreamReader(is));
        }

        public int read() {
            if (pos >= readLen) {
                pos = 0;
                try {
                    readLen = in.read(buffer);
                } catch (IOException e) {
                    throw new RuntimeException();
                }
                if (readLen <= 0) {
                    throw new MyInput.EndOfFileRuntimeException();
                }
            }
            return buffer[pos++];
        }

        public int nextInt() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            int i = 0;
            int ret = 0;
            if (str[0] == '-') {
                i = 1;
            }
            for (; i < len; i++) ret = ret * 10 + str[i] - '0';
            if (str[0] == '-') {
                ret = -ret;
            }
            return ret;
        }

        public char nextChar() {
            while (true) {
                final int c = read();
                if (!isSpace[c]) {
                    return (char) c;
                }
            }
        }

        int reads(int len, boolean[] accept) {
            try {
                while (true) {
                    final int c = read();
                    if (accept[c]) {
                        break;
                    }
                    if (str.length == len) {
                        char[] rep = new char[str.length * 3 / 2];
                        System.arraycopy(str, 0, rep, 0, str.length);
                        str = rep;
                    }
                    str[len++] = (char) c;
                }
            } catch (MyInput.EndOfFileRuntimeException e) {
            }
            return len;
        }

        static class EndOfFileRuntimeException extends RuntimeException {
        }

    }
}

