import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.AbstractCollection;
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
        TaskF solver = new TaskF();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskF {
        List<Integer>[] g0;

        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            g0 = new List[n];

            final int[] A = new int[n];
            final int[] B = new int[n];
            for (int i = 0; i < n; i++) {
                g0[i] = new ArrayList<>();
                A[i] = in.nextInt();
                B[i] = in.nextInt();
            }
            for (int i = 0; i < m; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                g0[a].add(b);
                g0[b].add(a);
            }

            PriorityQueue<Long> adj = new PriorityQueue<>();
            long min = Long.MAX_VALUE;
            int idx = -1;
            for (int i = 0; i < n; i++) {
                adj.add((long) Math.max(A[i], B[i]) << 32 | i);
//            if (min > Math.max(A[i], B[i])) {
//                min = Math.max(A[i], B[i]);
//                idx = i;
//            }
//            if (min > Math.min(A[i], B[i])) {
//                min = Math.min(A[i], B[i]);
//                idx = i;
//            }
//            if (min > A[i] - B[i]) {
//                min = A[i] - B[i];
//                idx = i;
//            }
                if (min > -B[i]) {
                    min = -B[i];
                    idx = i;
                }
//            if (min > A[i]) {
//                min = A[i];
//                idx = i;
//            }
            }

            long ans = Long.MAX_VALUE;
//        for (int rep = 0; rep < 100 && !adj.isEmpty(); rep++) {
            for (idx = 0; idx < n; idx++) {
//            dump(adj.peek()>>>32);
//            idx = (int)(adj.poll() & 0xFFFFFFFFL);
                PriorityQueue<S> q = new PriorityQueue<>();
                PriorityQueue<S> qa = new PriorityQueue<>();
                boolean[] vis = new boolean[n];
                boolean[] vis2 = new boolean[n];
                vis[idx] = true;
                vis2[idx] = true;
                q.add(new S(idx, 0));
                long cur = 0;
                while (!q.isEmpty()) {
                    S s = q.poll();
                    cur = Math.max(A[s.idx], B[s.idx] + cur);
//                dump(ans, s.idx, A[s.idx], B[s.idx]);
                    for (int t : g0[s.idx]) {
                        if (!vis2[t]) {
                            q.add(new S(t, A[t] - B[t]));
                            vis2[t] = true;
                        }
                        if (!vis[t]) {
                            vis[t] = true;
                            qa.add(new S(t, A[t]));
                        }
                    }
                    while (!qa.isEmpty() && qa.peek().diff <= cur) {
                        s = qa.poll();
                        for (int t : g0[s.idx]) {
                            if (!vis2[t]) {
                                q.add(new S(t, A[t] - B[t]));
                                vis2[t] = true;
                            }
                            if (!vis[t]) {
                                vis[t] = true;
                                qa.add(new S(t, A[t]));
                            }
                        }
                    }
                }
                ans = Math.min(ans, cur);
//        }
            }

            out.println(ans);
        }

        class S implements Comparable<S> {
            final int idx;
            final int diff;

            S(int i, int d) {
                idx = i;
                diff = d;
            }


            public int compareTo(S o) {
                return diff - o.diff;
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

