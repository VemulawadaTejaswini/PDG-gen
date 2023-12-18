import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.util.Queue;
import java.util.ArrayDeque;
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
        CThREE solver = new CThREE();
        solver.solve(1, in, out);
        out.close();
    }

    static class CThREE {
        int n;
        Queue<Integer>[] mod3Q;
        List<Integer>[] g;
        int[] ans;

        boolean dfs(int v, int p, int d) {
            if (mod3Q[d % 2 + 1].isEmpty()) {
                if (mod3Q[0].isEmpty()) {
                    return false;
                }
                ans[v] = mod3Q[0].poll();
            } else {
                ans[v] = mod3Q[d % 2 + 1].poll();
            }

            for (int t : g[v])
                if (t != p) {
                    if (!dfs(t, v, d + 1)) {
                        return false;
                    }
                }
            return true;
        }

        void solve(MyInput in, PrintWriter out) {
            n = in.nextInt();
            g = new List[n];
            for (int i = 0; i < n; i++) {
                g[i] = new ArrayList<>();
            }
            for (int i = 0; i < n - 1; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                g[a].add(b);
                g[b].add(a);
            }
            List<Integer>[] mod3 = new List[3];
            for (int i = 0; i < mod3.length; i++) {
                mod3[i] = new ArrayList<>();
            }
            for (int i = 1; i <= n; i++) {
                mod3[i % 3].add(i);
            }

            ans = new int[n];
            mod3Q = new Queue[3];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) mod3Q[j] = new ArrayDeque<>(mod3[j]);
                if (dfs(0, -1, i)) {
                    printList(out, ans);
                    return;
                }
            }
            out.println(-1);
        }

        public void solve(int testNumber, MyInput in, PrintWriter out) {
            Thread th = new Thread(null, () -> {
                // write here
                solve(in, out);
            }, "", 1 << 27);
            th.start();
            try {
                th.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        static void printList(PrintWriter out, int[] p) {
            for (int i = 0; i < p.length; i++) {
                out.print(p[i] + (i == p.length - 1 ? "\n" : " "));
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

