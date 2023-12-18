import java.io.*;
import java.util.*;

public class Main {

    static int N, D, A;
    static int[] X, H;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        D = sc.nextInt();
        A = sc.nextInt();
        X = new int[N];
        H = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = sc.nextInt();
            H[i] = sc.nextInt();
        }

        System.out.println(solve());
    }

    static long solve() {
        // 何にせよ端っこのやつをぶっ殺す必要がある -> 端から殺していけばとりあえずよさそう
        // イベントソートで何とかなりそうなので何とかする
        PriorityQueue<Event> q = new PriorityQueue<>(Comparator.<Event>comparingLong(ev -> ev.x).thenComparingInt(ev -> ev.type));
        for (int i = 0; i < N; i++) {
            q.add( Event.enemy(X[i], H[i]));
        }

        long time = 0;
        long power = 0; // 現在の爆弾の威力
        while(!q.isEmpty()) {
            Event ev = q.poll();
            if( ev.type == EVENT_ENEMY ) {
                // debug("enemy", ev.x, ev.h, "power", power);
                if( ev.h > power ) {
                    long last = ev.h - power;

                    long bomb = (last+A-1) / A;
                    time += bomb;
                    power += bomb * A;

                    // debug("bomb", bomb, "now power", power);

                    q.add( Event.bombClose(ev.x+D*2, bomb * A) );
                }

            } else {
                power -= ev.a;
            }
        }
        return time;
    }

    static int EVENT_ENEMY = 1;
    static int EVENT_BOMB_CLOSE = 2;

    static class Event {

        public static Event enemy(long x, long h) {
            return new Event(EVENT_ENEMY, x, h, -1);
        }

        public static Event bombClose(long x, long a) {
            return new Event(EVENT_BOMB_CLOSE, x, -1, a);
        }

        int type;
        long x;
        long h; // enemyの体力
        long a; // bombの威力

        public Event(int type, long x, long h, long a) {
            this.type = type;
            this.x = x;
            this.h = h;
            this.a = a;
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
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        int[] nextIntArray(int n, int delta) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt() + delta;
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }
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

    static void writeSingleLine(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < as.length; i++) {
            if (i != 0) pw.print(" ");
            pw.print(as[i]);
        }
        pw.println();
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
            if (arg == null) j.add("null");
            else if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }

    static void printSingleLine(int[] array) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < array.length; i++) {
            if (i != 0) pw.print(" ");
            pw.print(array[i]);
        }
        pw.println();
        pw.flush();
    }

    static int lowerBound(int[] array, int value) {
        int lo = 0, hi = array.length, mid;
        while (lo < hi) {
            mid = (hi + lo) / 2;
            if (array[mid] < value) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    static int upperBound(int[] array, int value) {
        int lo = 0, hi = array.length, mid;
        while (lo < hi) {
            mid = (hi + lo) / 2;
            if (array[mid] <= value) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}
