import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class Main {
    static In in = new In();
    static Out out = new Out();
    static final long mod = 1000000007;
    static final long inf = 0x1fffffffffffffffL;
    static final int iinf = 0x3fffffff;
    static final int[] da = {-1, 0, 1, 0, -1, 1, 1, -1, -1};

    void solve() {
        int n = in.nextInt();
        LongPair[] a = new LongPair[n];
        for (int i = 0; i < n; i++) {
            a[i] = new LongPair(n % 2 == 0 ? in.nextLong() * 2 : in.nextLong(), n % 2 == 0 ? in.nextLong() * 2 : in.nextLong());
        }
        Arrays.sort(a, Comparator.comparingLong(pair -> pair.first));
        long left = n % 2 == 0 ? (a[n / 2 - 1].first + a[n / 2].first) / 2 : a[n / 2].first;
        Arrays.sort(a, Comparator.comparingLong(pair -> pair.second));
        long right = n % 2 == 0 ? (a[n / 2 - 1].second + a[n / 2].second) / 2 : a[n / 2].second;
        out.println(right - left + 1);

//        PriorityQueue<Query> queue = new PriorityQueue<>(Comparator.<Query>comparingInt(query -> query.x).thenComparingInt(query -> query.type));
//        for (int i = 0; i < n; i++) {
//            queue.add(new Query(n % 2 == 0 ? in.nextInt() * 2 : in.nextInt(), 1));
//            queue.add(new Query(n % 2 == 0 ? in.nextInt() * 2 : in.nextInt(), -1));
//        }
//        int rem = 0;
//        int used = 0;
//        int left = -1;
//        int right = -1;
//        int lastt = -1;
//        int lastu = -1;
//        while (!queue.isEmpty()) {
//            Query peek = queue.peek();
//            while (!queue.isEmpty() && peek.x == queue.peek().x && queue.peek().type == -1) {
//                Query query = queue.poll();
//                rem++;
//                println(rem, used, query.x, query.type, lastt, lastu);
//                if (n % 2 == 1) {
//                    if ((n + 1) / 2 - 1 == rem) {
//                        right = query.x;
//                    }
//                } else {
//                    if (n / 2 == rem) {
//                        lastt = query.x;
//                        right = (lastu + query.x) / 2;
//                    } else if (n / 2 + 1 == rem) {
//                        lastu = query.x;
//                    }
//                }
//            }
//            while (!queue.isEmpty() && peek.x == queue.peek().x && queue.peek().type == 1) {
//                Query query = queue.poll();
//                used++;
//                println(rem, used, query.x, query.type, lastt, lastu);
//                if (left != -1) {
//                    continue;
//                }
//                if (n % 2 == 1) {
//                    if ((n + 1) / 2 == used) {
//                        left = query.x;
//                    }
//                } else {
//                    if (n / 2 == used) {
//                        lastt = query.x;
//                    } else if (n / 2 + 1 == used) {
//                        left = (lastt + query.x) / 2;
//                        lastu = query.x;
//                    }
//                }
//            }
//        }
//        println(left, right);
//        out.println(right - left + 1);
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class Query {
    int x;
    int type;

    public Query(int x, int type) {
        this.x = x;
        this.type = type;
    }
}

class IntPair {
    int first;
    int second;

    IntPair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof IntPair)) {
            return false;
        }
        IntPair that = (IntPair)o;
        return first == that.first && second == that.second;
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    @Override
    public String toString() {
        return String.format("[%s, %s]", first, second);
    }
}

class LongPair {
    long first;
    long second;

    LongPair(long first, long second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof LongPair)) {
            return false;
        }
        LongPair that = (LongPair)o;
        return first == that.first && second == that.second;
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    @Override
    public String toString() {
        return String.format("[%s, %s]", first, second);
    }
}

class In {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 0x10000);
    private StringTokenizer tokenizer;

    String next() {
        try {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
        } catch (IOException ignored) {
        }
        return tokenizer.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    char[] nextCharArray() {
        return next().toCharArray();
    }

    char[][] nextCharGrid(int n, int m) {
        char[][] a = new char[n][m];
        for (int i = 0; i < n; i++) {
            a[i] = next().toCharArray();
        }
        return a;
    }

    int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    int[] nextIntArray(int n, IntUnaryOperator op) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsInt(nextInt());
        }
        return a;
    }

    long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextLong();
        }
        return a;
    }

    long[] nextLongArray(int n, LongUnaryOperator op) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsLong(nextLong());
        }
        return a;
    }
}

class Out {
    private PrintWriter out = new PrintWriter(System.out);
    boolean autoFlush = false;

    void println(Object... a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (Object obj : a) {
            joiner.add(String.valueOf(obj));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(char[] s) {
        out.println(String.valueOf(s));
        if (autoFlush) {
            out.flush();
        }
    }

    void println(int[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i : a) {
            joiner.add(Integer.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(long[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (long i : a) {
            joiner.add(Long.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void flush() {
        out.flush();
    }
}
