import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author tanzaku
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyInput in = new MyInput(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        char[] ans;
        char[] buf = new char[5];
        char[] alpha = new char[26];
        char[] cs;
        TreeSet<Integer>[] chars = new TreeSet[26];

        public void solve(int testNumber, MyInput in, PrintWriter out) {
            for (int i = 0; i < alpha.length; i++) alpha[i] = (char) ('a' + i);
            cs = in.next();
            for (int i = 0; i < chars.length; i++) chars[i] = new TreeSet<>();
            for (int i = 0; i < cs.length; i++) {
                chars[cs[i] - 'a'].add(i);
            }
            dfs(0);
            out.println(new String(ans));
        }

        void dfs(int depth) {
            if (depth != 0 && !exist(buf, depth)) {
                if (ans == null || ans.length > depth) {
                    ans = Arrays.copyOf(buf, depth);
                }
            }
            if (depth >= 5) return;
            for (char c : alpha) {
                buf[depth] = c;
                dfs(depth + 1);
            }
        }

        boolean exist(char[] buf, int len) {
            for (int i = 0, j = 0; i < len; i++) {
                Integer k = chars[buf[i] - 'a'].ceiling(j);
                if (k == null) return false;
                j = k + 1;
            }
            return true;
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

        public char[] next() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            return Arrays.copyOf(str, len);
        }

        static class EndOfFileRuntimeException extends RuntimeException {
        }

    }
}

