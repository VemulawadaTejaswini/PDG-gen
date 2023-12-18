import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
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
            int n = in.nextInt();
            char[] c = in.next();

            List<List<Integer>> xss = new ArrayList<>();
            List<Integer> cur = new ArrayList<>();
            for (int i = 0, j; ; ) {
                for (j = i; j < n && c[j] == '0'; j++) ;
                if ((j == n || j - i > 1) && !cur.isEmpty()) {
                    xss.add(new ArrayList<>(cur));
                    cur.clear();
                }
                if (j == n) break;
                for (i = j; i < n && c[i] == '1'; i++) ;
                cur.add(i - j);
//            dump(i, j);
            }

//        dump("come", xss);
            List<Integer> cont = new ArrayList<>();
            int ans = 0;
            for (List<Integer> xs : xss)
                if (xs.size() > 1) {
                    final int m = xs.size();

                    int cnt1 = 0, cnt2 = 0;
                    for (int i = 0, j; i < m; ) {
                        for (j = i; j < m && xs.get(j) == 1; j++) ;
                        if (i != j) cnt1++;
                        for (i = j; i < m && xs.get(i) != 1; i++) ;
                        if (i != j) cnt2++;
                    }

//            dump(cnt1, cnt2);
                    int curValue = 0;
                    if (cnt2 > cnt1) {
                        int sum = 0;
                        int min = Integer.MAX_VALUE;
                        for (int i = 0; i < m; i++) {
                            int v = xs.get(i);
                            if (v == 1) continue;
                            sum += v - 1;
                            if (i == 0 || xs.get(i - 1) == 1 || i >= m - 1 || xs.get(i + 1) == 1) {
                                v = v * 2 + 1;
                            } else {
                                v = v * 2 + 0;
                            }
                            min = Math.min(min, v);
                        }
                        sum += cnt2;
                        sum -= min / 2 - 1;
                        sum += 1 - min % 2;
                        curValue += sum;
                    } else {
                        int bombL = 0;
                        for (int i = 0, j; i < m; ) {
                            for (j = i; j < m && xs.get(j) == 1; j++) ;
                            final int cont1 = j - i - bombL;
                            int sum = 0;
                            for (i = j; i < m && xs.get(i) != 1; i++) {
                                sum += xs.get(i);
                            }
//                dump(cont1, sum, i, j);
                            if (cont1 % 2 == 1) {
                                bombL = 0;
                                curValue += cont1 / 2;
                                curValue += sum - Math.max(0, i - j - 1);
                            } else {
                                if (i < m || cnt2 == 0) {
                                    curValue += cont1 / 2;
                                    bombL = 1;
                                } else {
                                    bombL = 0;
                                    curValue += (cont1 - 1) / 2;
                                }
                                curValue += sum - Math.max(0, i - j - 1);
                            }
                        }
                    }
                    ans += curValue;
//            dump(xs, curValue);
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

