import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

class Edge {
    int a;
    int b;
    int color;

    public Edge(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
public class Main {
    final static long MOD07 = 1_000_000_007;
    final static long MOD09 = 1_000_000_009;
    public static void main(String[] args) {
        final FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int N = fs.nextInt();
        List<Edge>[] graph = new List[N];

        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
        }
        List<Edge> edges = new ArrayList<>();
        int root = -1;
        for (int i = 0; i < N - 1; i++) {
            int a = fs.nextInt() -1;
            int b = fs.nextInt() - 1;
            if (root < 0) {
                root = a;
            }
            Edge edge = new Edge(a, b);
            edges.add(edge);
            graph[a].add(edge);
            graph[b].add(edge);
        }
        int[] maxRef = { 0 };
        dfs(graph, 0, -1, -1, maxRef);
        out.println(maxRef[0]);
        for (Edge edge : edges) {
            out.println(
                    edge.color
            );
        }
        out.flush();
    }

    private static void dfs(List<Edge>[] graph, int current, int parent,  int parentColor, int[] maxRef) {
        int color = 1;
        for (Edge edge : graph[current]) {
            int node = edge.a == current ? edge.b : edge.a;
            if (node != parent) {
                if (color == parentColor) {
                    color++;
                }
                edge.color = color;
                dfs(graph, node, current, color, maxRef);
                maxRef[0] = Math.max(maxRef[0], color);
                color++;
            }
        }
    }

    static void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    // Execute func for all patterns can be represented with n bit.
    // O(n2^n)
    static void forAllBit(int n, Consumer<List<Boolean>> func) {
        for (int i = 0; i < (1 << n); i++) {
            List<Boolean> arg = new ArrayList();
            for (int j = 0; j < n; j++) {
                boolean isJthBitSet = ((i >> j) & 1) == 1;
                arg.add(isJthBitSet);
            }
            func.accept(arg);
        }
    }

    static class Pair<F extends Comparable<F>, S extends Comparable<S>> implements Comparable<Pair<F, S>> {
        F f;
        S s;

        Pair() {
        }

        Pair(F f, S s) {
            this.f = f;
            this.s = s;
        }

        Pair(Pair<F, S> p) {
            f = p.f;
            s = p.s;
        }

        @Override
        public int compareTo(Pair<F, S> p) {
            if (f.compareTo(p.f) != 0) {
                return f.compareTo(p.f);
            }
            return s.compareTo(p.s);
        }

        @Override
        public int hashCode() {
            return f.hashCode() ^ s.hashCode();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || this.f == null || this.s == null) {
                return false;
            }
            if (this.getClass() != o.getClass()) {
                return false;
            }
            Pair p = (Pair) o;
            return this.f.equals(p.f) && this.s.equals(p.s);
        }

        @Override
        public String toString() {
            return "{" + f.toString() + ", " + s.toString() + "}";
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= ((int) Math.sqrt(n)); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n != 1;
    }

    public static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static void reverse(long[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            long temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static boolean isPrime(long n) {
        for (long i = 2; i <= ((long) Math.sqrt(n)); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n != 1;
    }

    public static Map<Long, Long> primeFactor(long n) {
        Map<Long, Long> map = new HashMap<>();
        long num = n;
        for (long i = 2; i <= ((long) Math.sqrt(n)); i++) {
            while (num % i == 0L) {
                map.put(i, map.getOrDefault(i, 0L) + 1L);
                num /= i;
            }
        }
        if (num != 1) {
            map.put(num, 1L);
        }

        return map;
    }

    public static List<Long> divisors(long n) {
        List<Long> list = new ArrayList<>();
        for (long i = 1; i <= ((long) Math.sqrt(n)); i++) {
            if (n % i == 0) {
                list.add(i);
                if (i != n / i) {
                    list.add(n / i);
                }
            }
        }

        return list;
    }

    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    public static long nCk(int n, int k, long M) {
        long ret = 1;
        int min = Math.min(k, n - k);
        for (int i = 1; i <= min; i++) {
            ret = (ret * pow(i, M - 2, M)) % M;
        }
        for (int i = n - min + 1; i <= n; i++) {
            ret = (ret * i) % M;
        }
        return (long) ret;
    }

    //return a^b mod M O(logB)
    public static long pow(long a, long b, long M) {
        long ret = 1;
        long tmp = a;
        while (b > 0) {
            if ((b & 1) == 1) ret = (ret * tmp) % M;
            tmp = (tmp * tmp) % M;
            b = b >> 1;
        }
        return ret;
    }


    public static int find(int[] tree, int idx) {
        if (tree[idx] == idx) return idx;
        else return tree[idx] = find(tree, tree[idx]);
    }

    public static void union(int[] tree, int idx1, int idx2) {
        int root1 = find(tree, idx1);
        int root2 = find(tree, idx2);
        tree[root2] = root1;
    }

    public static int lowerBound(int[] list, int target) {
        int ok = list.length;
        int ng = -1;
        while (Math.abs(ok - ng) > 1) {
            int mid = (ok + ng) / 2;
            if (list[mid] >= target) {
                ok = mid;
            } else {
                ng = mid;
            }
        }
        return ok;
    }

    public static int lowerBound(long[] list, long target) {
        int ok = list.length;
        int ng = -1;
        while (Math.abs(ok - ng) > 1) {
            int mid = (ok + ng) / 2;
            if (list[mid] >= target) {
                ok = mid;
            } else {
                ng = mid;
            }
        }
        return ok;
    }

    public static <T extends Comparable<? super T>> int lowerBound(List<T> list, T target) {
        return ~Collections.binarySearch(list, target, (x, y) -> (x.compareTo(y) >= 0) ? 1 : -1);
    }

    public static <T extends Comparable<? super T>> int upperBound(List<T> list, T target) {
        return ~Collections.binarySearch(list, target, (x, y) -> (x.compareTo(y) > 0) ? 1 : -1);
    }
}


class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() {
        if (hasNextByte()) return buffer[ptr++];
        else return -1;
    }

    private boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}
