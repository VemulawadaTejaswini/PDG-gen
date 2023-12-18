import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class Main {
    static In in = new In();
    static Out out = new Out();
    static final long mod = 1000000007;
    static final long inf = 0xfffffffffffffffL;
    static final int iinf = 0xfffffff;
    static final int[] da = {-1, 0, 1, 0, -1, 1, 1, -1, -1};

    void solve() {
        int n = in.nextInt();
        int[] a = in.nextIntArray(n);
        Swag<Integer> plusSwag = new Swag<>(new Monoid<>(0, (x, y) -> x + y));
        Swag<Integer> xorSwag = new Swag<>(new Monoid<>(0, (x, y) -> x ^ y));
        long ans = 0;
        for (int i = 0; i < n; i++) {
            plusSwag.push(a[i]);
            xorSwag.push(a[i]);
            while (!plusSwag.fold().equals(xorSwag.fold())) {
                plusSwag.pop();
                xorSwag.pop();
            }
            ans += plusSwag.size();
        }
        out.println(ans);
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class Monoid<T> {
    final T identity;
    private final BiFunction<T, T, T> operation;

    Monoid(T identity, BiFunction<T, T, T> operation) {
        this.identity = identity;
        this.operation = operation;
    }

    T merge(T x, T y) {
        if (Objects.equals(x, identity)) {
            return y;
        } else if (Objects.equals(y, identity)) {
            return x;
        } else {
            return operation.apply(x, y);
        }
    }
}

class Swag<T> {
    private List<T> frontValue = new ArrayList<>();
    private List<T> backValue = new ArrayList<>();
    private List<T> frontSum = new ArrayList<>();
    private List<T> backSum = new ArrayList<>();
    private int frontSize = 0;
    private int backSize = 0;
    private Monoid<T> monoid;

    Swag(Monoid<T> monoid) {
        this.monoid = monoid;
    }

    T fold() {
        if (isEmpty()) {
            return monoid.identity;
        } else if (frontSize == 0) {
            return backSum.get(backSize - 1);
        } else if (backSize == 0) {
            return frontSum.get(frontSize - 1);
        } else {
            return monoid.merge(frontSum.get(frontSize - 1), backSum.get(backSize - 1));
        }
    }

    void push(T x) {
        if (backSize == 0) {
            backValue.add(x);
            backSum.add(x);
        } else {
            T s = monoid.merge(backSum.get(backSize - 1), x);
            backValue.add(x);
            backSum.add(s);
        }
        backSize++;
    }

    T pop() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        if (frontSize == 0) {
            T sum = backValue.remove(backSize - 1);
            backSum.remove(backSize - 1);
            frontValue.add(sum);
            frontSum.add(sum);
            frontSize++;
            backSize--;
            while (backSize > 0) {
                T value = backValue.remove(backSize - 1);
                backSum.remove(backSize - 1);
                sum = monoid.merge(sum, value);
                frontValue.add(value);
                frontSum.add(sum);
                frontSize++;
                backSize--;
            }
        }
        T res = frontValue.remove(frontSize - 1);
        frontSum.remove(frontSize - 1);
        frontSize--;
        return res;
    }

    void clear() {
        frontValue.clear();
        backValue.clear();
        frontSum.clear();
        backSum.clear();
        frontSize = 0;
        backSize = 0;
    }

    boolean isEmpty() {
        return size() == 0;
    }

    int size() {
        return frontSize + backSize;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        for (int i = frontSize - 1; i >= 0; i--) {
            joiner.add(String.valueOf(frontValue.get(i)));
        }
        for (int i = 0; i < backSize; i++) {
            joiner.add(String.valueOf(backValue.get(i)));
        }
        return joiner.toString();
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

    char[][] nextCharArray(int n, int m) {
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
