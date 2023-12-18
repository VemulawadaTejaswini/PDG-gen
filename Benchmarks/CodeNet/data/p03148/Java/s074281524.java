import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.AbstractCollection;
import java.util.PriorityQueue;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.Reader;
import java.util.Comparator;
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
        DVariousSushi solver = new DVariousSushi();
        solver.solve(1, in, out);
        out.close();
    }

    static class DVariousSushi {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] t = new int[n];
            int[] d = new int[n];
            PriorityQueue<int[]> que = new PriorityQueue<>(Comparator.comparingInt(x -> -x[1]));
            PriorityQueue<int[]> used = new PriorityQueue<>(Comparator.comparingInt(x -> x[1]));
            for (int i = 0; i < n; i++) {
                t[i] = in.nextInt() - 1;
                d[i] = in.nextInt();
                que.add(new int[]{t[i], d[i]});
            }
            long ans = 0;
            long sum = 0;
            long kind = 0;
            int[] deg = new int[n];
            for (int i = 0; i < n; i++) {
                int[] q = que.poll();
                if (i < k) {
                    if (deg[q[0]]++ == 0) {
                        kind++;
                    }
                    sum += q[1];
                    used.add(q);
                } else {
                    while (!used.isEmpty() && deg[used.peek()[0]] == 1) {
                        used.poll();
                    }
                    if (used.isEmpty() || deg[q[0]] != 0) {
                        continue;
                    }
                    int[] p = used.poll();
                    used.add(q);
                    deg[q[0]]++;
                    deg[p[0]]--;
                    kind++;
                    sum += q[1] - p[1];
                }
                ans = Math.max(ans, sum + kind * kind);
            }
            out.println(ans);
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

