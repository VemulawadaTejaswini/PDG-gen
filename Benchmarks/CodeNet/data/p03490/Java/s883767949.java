import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.Optional;
import java.io.BufferedReader;
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
            List<Integer> xs = new ArrayList<>();
            List<Integer> ys = new ArrayList<>();
            List<Integer>[] xy = new List[]{xs, ys};
            char[] cs = in.nextChars();
            int x = in.nextInt();
            int y = in.nextInt();
            int d = 0;
            int cur = 0;
            for (char c : cs) {
                if (c == 'F') cur++;
                else {
                    xy[d].add(cur);
                    cur = 0;
                    d ^= 1;
                }
            }
            xy[d].add(cur);
            x -= xs.get(0);
            xs.remove(0);
            x = Math.abs(x);
            y = Math.abs(y);
            out.println(can(xs, x) && can(ys, y) ? "Yes" : "No");
        }

        boolean can(List<Integer> xs, int x) {
            if (xs.isEmpty()) return x == 0;
            int sum = xs.stream().reduce((a, b) -> a + b).get();
            if (sum < x) return false;
            boolean[] vis1 = new boolean[sum + 1];
            boolean[] vis2 = new boolean[sum + 1];
            vis1[0] = true;
            for (int v : xs) {
                System.arraycopy(vis1, 0, vis2, 0, sum + 1);
                for (int i = 0; i < sum + 1; i++) {
                    if (i + v < sum + 1) vis2[i + v] |= vis1[i];
                    if (i - v >= 0) vis2[i - v] |= vis1[i];
                }
                System.arraycopy(vis2, 0, vis1, 0, sum + 1);
                if (vis1[x]) return true;
            }
            return false;
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

        public char[] nextChars() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            return Arrays.copyOf(str, len);
        }

        static class EndOfFileRuntimeException extends RuntimeException {
        }

    }
}

