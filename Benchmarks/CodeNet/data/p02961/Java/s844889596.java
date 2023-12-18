import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static int K, X, Y;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        K = sc.nextInt();
        X = sc.nextInt();
        Y = sc.nextInt();

        List<Cord> ans = solve();
        if( ans == null ) {
            System.out.println(-1);
        } else {
            PrintWriter pw = new PrintWriter(System.out);
            pw.println(ans.size());
            for (Cord cord : ans) {
                pw.println(cord.x + " " + cord.y);
            }
            pw.flush();
        }
    }

    static List<Cord> solve() {
        // Kが偶数だと奇数マスに到達できない
        if( K%2 == 0 && (X+Y)%2 == 1 ) return null;

        List<Cord> ans = new ArrayList<>();
        Cord curr = new Cord(0, 0);
        // とりあえず二打で到達できるところまで寄る
        while( true ) {
            int xd = X - curr.x;
            int yd = Y - curr.y;
            if( Math.abs(xd) + Math.abs(yd) <= K*2 ) break;

            int rd = K;
            if( Math.abs(xd) >= K ) {
                int nx = curr.x + Integer.signum(xd) * K;
                int ny = curr.y;
                Cord next = new Cord(nx, ny);
                ans.add( next );
                curr = next;
                continue;

            } else {
                // xを同じにする
                rd -= Math.abs(xd);
            }
            int nx = X;
            // yを調整する
            int ny = curr.y + Integer.signum(yd) * rd;
            Cord next = new Cord(nx, ny);
            ans.add( next );
            curr = next;
        }

        // なんかゴールできるのでゴールする
        if( curr.dist(X, Y) == K ) {
            ans.add(new Cord(X, Y));
            return ans;
        }

        // 偶奇があってないと困るので合わせる
        if( K%2 == 1 && curr.dist(X, Y) %2 == 1 ) {
            // (できれば)近づく方向で動く, 2Kより遠くならなければまぁよい
            int d = Math.abs(curr.dist(X, Y) - K);
            Cord next = new Cord(X, Y+d);
            ans.add(next);
            curr = next;
        }

        //45して交点を探す
        int x1 = curr.x + curr.y - K;
        int x2 = curr.x + curr.y + K;
        int y1 = curr.x - curr.y - K;
        int y2 = curr.x - curr.y + K;

        int gx1 = X + Y - K;
        int gx2 = X + Y + K;
        int mx = (x1 <= gx1 && gx1 <= x2) ? gx1 : gx2;
        Cord m1 = new Cord((mx + y1)/2, (mx - y1)/2);
        Cord m2 = new Cord((mx + y2)/2, (mx - y2)/2);
        if( m1.dist(curr.x, curr.y) == K && m1.dist(X, Y) == K ) {
            ans.add(m1);
            ans.add(new Cord(X, Y));
            return ans;
        } else if( m2.dist(curr.x, curr.y) == K && m2.dist(X, Y) == K ) {
            ans.add(m2);
            ans.add(new Cord(X, Y));
            return ans;
        } else {
            throw new IllegalArgumentException("wtf");
        }
    }

    static class Cord {
        int x, y;

        public Cord(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int dist(int x, int y) {
            return Math.abs(x - this.x) + Math.abs(y - this.y);
        }
    }

    @SuppressWarnings("unused")
    static class FastScanner {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        int[] nextIntArray(int n, int delta) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt() + delta;
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }

    static <A> void writeLines(A[] as, Function<A, String> f) {
        PrintWriter pw = new PrintWriter(System.out);
        for (A a : as) {
            pw.println(f.apply(a));
        }
        pw.flush();
    }

    static void writeLines(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int a : as) pw.println(a);
        pw.flush();
    }

    static void writeLines(long[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (long a : as) pw.println(a);
        pw.flush();
    }

    static int max(int... as) {
        int max = Integer.MIN_VALUE;
        for (int a : as) max = Math.max(a, max);
        return max;
    }

    static int min(int... as) {
        int min = Integer.MAX_VALUE;
        for (int a : as) min = Math.min(a, min);
        return min;
    }

    static void debug(Object... args) {
        StringJoiner j = new StringJoiner(" ");
        for (Object arg : args) {
            if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }
}
