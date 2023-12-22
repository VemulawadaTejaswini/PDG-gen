import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;

public class Main {

    static int N, M;
    static int[] A, B;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        A = new int[M];
        B = new int[M];
        for (int i = 0; i < M; i++) {
            A[i] = sc.nextInt()-1;
            B[i] = sc.nextInt()-1;
        }

        Result r = solve();
        writeLines(r.ord);
        System.out.println(r.another ? 1 : 0);
    }

    static Result solve() {
        int[][] G = adjD(N, A, B);
        return khan(N, G);
    }

    static void debug(Object... args) {
        StringJoiner j = new StringJoiner(" ");
        for (Object arg : args) {
            if( arg == null ) j.add("null");
            else if( arg instanceof int[] ) j.add( Arrays.toString((int[])arg) );
            else if( arg instanceof long[] ) j.add( Arrays.toString((long[])arg) );
            else if( arg instanceof double[] ) j.add( Arrays.toString((double[])arg) );
            else if( arg instanceof Object[] ) j.add( Arrays.toString((Object[])arg) );
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }
    static class Result {
        int[] ord;
        boolean another;

        public Result(int[] ord, boolean another) {
            this.ord = ord;
            this.another = another;
        }
    }

    static Result khan(int V, int[][] G) {
        int[] deg = new int[V];
        for (int[] tos : G) {
            for (int to : tos) {
                deg[to]++;
            }
        }

        boolean another = false;

        int[] q = new int[V];
        int a = 0, b = 0;
        for (int v = 0; v < V; v++) {
            if( deg[v] == 0 ) q[b++] = v;
        }
        if( b > 1 ) another = true;

        int[] ret = new int[V];
        int idx = 0;
        while( a != b ) {
            int v = q[a++];
            ret[idx++] = v+1;
            int cnt = 0;
            for (int to : G[v]) {
                deg[to]--;
                if( deg[to] == 0 ) {
                    q[b++] = to;
                    cnt++;
                }
            }
            if( cnt > 1 ) another = true;
        }

        // ないはず
        for (int v = 0; v < V; v++) {
            if( deg[v] != 0 ) throw new IllegalArgumentException("wtf");
        }

        return new Result(ret, another);
    }

    static int[][] adjD(int n, int[] from, int[] to) {
        int[][] adj = new int[n][];
        int[] cnt = new int[n];
        for (int f : from) {
            cnt[f]++;
        }
        for (int i = 0; i < n; i++) {
            adj[i] = new int[cnt[i]];
        }
        for (int i = 0; i < from.length; i++) {
            adj[from[i]][--cnt[from[i]]] = to[i];
        }
        return adj;
    }

    static void writeLines(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int a : as) pw.println(a);
        pw.flush();
    }

    static class FastScanner {
        private final BufferedReader in;
        private int pos;
        private int readLen;
        private final char[] buffer = new char[1024 * 8];
        private char[] str = new char[500 * 8 * 2];
        private static boolean[] isSpace = new boolean[256];

        static {
            isSpace[' '] = isSpace['\r'] = isSpace['\n'] = isSpace['\t'] = true;
        }

        public FastScanner(InputStream is) {
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
                    throw new EndOfFileRuntimeException();
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
            for (; i < len; i++)
                ret = ret * 10 + str[i] - '0';
            if (str[0] == '-') {
                ret = -ret;
            }
            return ret;
        }

        public long nextLong() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            int i = 0;
            long ret = 0;
            if (str[0] == '-') {
                i = 1;
            }
            for (; i < len; i++)
                ret = ret * 10 + str[i] - '0';
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

        public String nextString() {
            return new String(nextChars());
        }

        public char[] nextChars() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            return Arrays.copyOf(str, len);
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
            } catch (FastScanner.EndOfFileRuntimeException e) {
                // ignore
            }
            return len;
        }

        static class EndOfFileRuntimeException extends RuntimeException {
        }
    }
}

