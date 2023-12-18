import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.AbstractQueue;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.List;
import java.util.AbstractCollection;
import java.io.BufferedReader;
import java.util.Comparator;
import java.util.Collections;
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
        FJewels solver = new FJewels();
        solver.solve(1, in, out);
        out.close();
    }

    static class FJewels {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();

            List<Long>[] val = new List[k];
            for (int i = 0; i < k; i++) {
                val[i] = new ArrayList<>();
            }
            for (int i = 0; i < n; i++) {
                int c = in.nextInt() - 1;
                long v = in.nextInt();
                val[c].add(v);
            }

            S s = new S();
            for (List<Long> x : val) {
                Collections.sort(x, Comparator.comparingLong(y -> -y));
                s.unused2.add(x);
                if (x.size() > 2) {
                    s.unused3.add(x);
                }
            }

            long ans = 0;
            final long inf = 1L << 60;
            Set<List<Long>> used = new TreeSet<>((x, y) -> {
                if (x.size() != y.size()) return x.size() - y.size();
                for (int i = 0; i < x.size(); i++) {
                    if (x.get(i) != y.get(i)) return Long.compare(x.get(i), y.get(i));
                }
                return 0;
            });
            long minPair = inf;
            long minSingle = inf;

            out.println(-1);
            for (int i = 2; i <= n; i += 2) {
                {
                    while (!s.unused2.isEmpty() && used.contains(s.unused2.peek())) {
                        s.unused2.poll();
                    }
                    long x = s.unused2.isEmpty() ? -inf : s.unused2.peek().get(0) + s.unused2.peek().get(1);
                    long z1 = s.used.isEmpty() ? -inf : s.used.poll();
                    long z2 = s.used.isEmpty() ? -inf : s.used.poll();
                    long z = z1 + z2;
                    if (x >= z) {
                        ans += x;
                        List<Long> xs = s.unused2.poll();
                        s.used.addAll(xs.subList(2, xs.size()));
                        if (z1 != -inf) s.used.add(z1);
                        if (z2 != -inf) s.used.add(z2);
                        used.add(xs);
                        minPair = Math.min(minPair, x);
                    } else {
                        ans += z;
                        minPair = Math.min(minPair, z);
                        minSingle = Math.min(minSingle, z2);
                    }
                }
                out.println(ans);

                if (i + 1 <= n) {
                    while (!s.unused3.isEmpty() && used.contains(s.unused3.peek())) {
                        s.unused3.poll();
                    }

                    long x = s.unused2.isEmpty() ? -inf : s.unused2.peek().get(0) + s.unused2.peek().get(1);
                    long y = s.unused3.isEmpty() ? -inf : s.unused3.peek().get(0) + s.unused3.peek().get(1) + s.unused3.peek().get(2);
                    long z1 = s.used.isEmpty() ? -inf : s.used.peek();
                    long z = z1;
                    long v = -1;
                    v = Math.max(v, ans + y - minPair);
                    v = Math.max(v, ans + z1);
                    v = Math.max(v, ans + x - minSingle);
                    out.println(v);
                }
            }
        }

        class S {
            PriorityQueue<Long> used = new PriorityQueue<>(Comparator.comparingLong(x -> -x));
            PriorityQueue<List<Long>> unused2 = new PriorityQueue<>((x, y) -> -Long.compare(x.get(0) + x.get(1), y.get(0) + y.get(1)));
            PriorityQueue<List<Long>> unused3 = new PriorityQueue<>((x, y) -> -Long.compare(x.get(0) + x.get(1) + x.get(2), y.get(0) + y.get(1) + y.get(2)));

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

