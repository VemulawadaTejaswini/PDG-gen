import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.StringJoiner;

class Main {

    static PrintWriter out;
    static InputReader sc;

    static final int MOD = (int) 1e9 + 7;

    static List<List<Integer>> graph;
    static int[] memo;

    public static void main(String[] args) {
        sc = new InputReader(System.in);
        out = new PrintWriter(System.out);
        solve();
        out.flush();
    }

    static void solve() {
        int N = sc.nextInt();
        graph = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        memo = new int[N];
        Arrays.fill(memo, -1);
        size(0, -1);
        int s = memo[N - 1];
        Arrays.fill(memo, -1);
        size(N - 1, -1);
        int f = memo[0];
        Arrays.fill(memo, -1);
        Queue<Integer> que = new ArrayDeque<>();
        memo[0] = 0;
        que.add(0);
        while (!que.isEmpty()) {
            int v = que.poll();
            for (int u : graph.get(v)) {
                if (memo[u] == -1) {
                    memo[u] = memo[v] + 1;
                    que.add(u);
                }
            }
        }
        int p = memo[N - 1] - 1;
        f += (p + 1) / 2;
        s += p / 2;
        out.println(f > s ? "Fennec" : "Snuke");
    }

    static int size(int s, int p) {
        int res = 1;
        for (int v : graph.get(s)) {
            if (v != p) {
                res += size(v, s);
            }
        }
        return memo[s] = res;
    }

    static void debug(Object... args) {
        StringJoiner j = new StringJoiner(" ");
        for (Object arg : args) {
            Class<?> type = arg.getClass();
            if (type.getComponentType().isArray()) {
                for (Object o : (Object[]) arg) {
                    debug(o);
                }
            } else if (arg instanceof int[]) {
                j.add(Arrays.toString((int[]) arg));
            } else if (arg instanceof long[]) {
                j.add(Arrays.toString((long[]) arg));
            } else if (arg instanceof double[]) {
                j.add(Arrays.toString((double[]) arg));
            } else if (arg instanceof char[]) {
                j.add(Arrays.toString((char[]) arg));
            } else if (arg instanceof boolean[]) {
                j.add(Arrays.toString((boolean[]) arg));
            } else if (arg instanceof Object[]) {
                j.add(Arrays.toString((Object[]) arg));
            } else {
                j.add(arg.toString());
            }
        }
        System.err.println(j.toString());
    }

    static class InputReader {

        private InputStream in;
        private byte[] buffer = new byte[1024];
        private int curbuf;
        private int lenbuf;

        public InputReader(InputStream in) {
            this.in = in;
            this.curbuf = this.lenbuf = 0;
        }

        public boolean hasNextByte() {
            if (this.curbuf >= this.lenbuf) {
                this.curbuf = 0;
                try {
                    this.lenbuf = this.in.read(this.buffer);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (this.lenbuf <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (this.hasNextByte()) {
                return this.buffer[this.curbuf++];
            } else {
                return -1;
            }
        }

        private boolean isSpaceChar(int c) {
            return !(c >= 33 && c <= 126);
        }

        private void skip() {
            while (this.hasNextByte() && this.isSpaceChar(this.buffer[this.curbuf])) {
                this.curbuf++;
            }
        }

        public boolean hasNext() {
            this.skip();
            return this.hasNextByte();
        }

        public String next() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            StringBuilder sb = new StringBuilder();
            int b = this.readByte();
            while (!this.isSpaceChar(b)) {
                sb.appendCodePoint(b);
                b = this.readByte();
            }
            return sb.toString();
        }

        public int nextInt() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            int c = this.readByte();
            while (this.isSpaceChar(c)) {
                c = this.readByte();
            }
            boolean minus = false;
            if (c == '-') {
                minus = true;
                c = this.readByte();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res = res * 10 + c - '0';
                c = this.readByte();
            } while (!this.isSpaceChar(c));
            return minus ? -res : res;
        }

        public long nextLong() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            int c = this.readByte();
            while (this.isSpaceChar(c)) {
                c = this.readByte();
            }
            boolean minus = false;
            if (c == '-') {
                minus = true;
                c = this.readByte();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res = res * 10 + c - '0';
                c = this.readByte();
            } while (!this.isSpaceChar(c));
            return minus ? -res : res;
        }

        public double nextDouble() {
            return Double.parseDouble(this.next());
        }

        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = this.nextInt();
            }
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = this.nextLong();
            }
            return a;
        }

        public char[][] nextCharMap(int n, int m) {
            char[][] map = new char[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = this.next().toCharArray();
            }
            return map;
        }
    }
}