
import java.io.*;
import java.util.*;
import java.util.function.Function;


/**
 * Created by Katushka on 11.03.2020.
 */
public class Main {

    public static final Comparator<int[]> COMPARATOR = Comparator.comparingInt(o -> o[0]);

    static Integer[] readArray(int size, InputReader in) {
        Integer[] a = new Integer[size];
        for (int i = 0; i < size; i++) {
            a[i] = in.nextInt();
        }
        return a;
    }

    static long[] readLongArray(int size, InputReader in) {
        long[] a = new long[size];
        for (int i = 0; i < size; i++) {
            a[i] = in.nextLong();
        }
        return a;
    }

    static void sortArray(int[] a) {
        Random random = new Random();

        for (int i = 0; i < a.length; i++) {
            int randomPos = random.nextInt(a.length);
            int t = a[i];
            a[i] = a[randomPos];
            a[randomPos] = t;
        }
        Arrays.sort(a);
    }

    interface AssociativeFunction<A> {
        A apply(A a, A b);
    }

    static class SegTree<A, B> {
        private final AssociativeFunction<A> func;
        private final A start;
        private final Function<B, A> converter;
        private int size;
        private final A[] tree;

        SegTree(B[] a, AssociativeFunction<A> func, Function<Integer, A[]> arrayConstructor, A start, Function<B, A> converter) {
            this.func = func;
            this.start = start;
            this.converter = converter;
            size = 1;
            while (size < a.length) {
                size *= 2;
            }
            tree = arrayConstructor.apply(2 * size - 1);

            build(a, 0, 0, size, converter);
        }

        private void build(B[] a, int x, int lx, int rx, Function<B, A> converter) {
            if (rx - lx == 1) {
                if (lx < a.length) {
                    tree[x] = converter.apply(a[lx]);
                }
            } else {
                int m = (rx + lx) / 2;
                build(a, 2 * x + 1, lx, m, converter);
                build(a, 2 * x + 2, m, rx, converter);
                tree[x] = func.apply(tree[2 * x + 1], tree[2 * x + 2]);
            }
        }

        public void set(int i, B v) {
            set(i, v, 0, 0, size);
        }

        private void set(int i, B v, int x, int lx, int rx) {
            if (rx - lx == 1) {
                tree[x] = converter.apply(v);
                return;
            }
            int m = (rx + lx) / 2;
            if (i >= m) {
                set(i, v, 2 * x + 2, m, rx);
            } else {
                set(i, v, 2 * x + 1, lx, m);
            }
            tree[x] = func.apply(tree[2 * x + 1], tree[2 * x + 2]);
        }

        public A result(int l, int r) {
            return result(l, r, 0, 0, size);
        }

        private A result(int l, int r, int x, int lx, int rx) {
            if (l >= rx || lx >= r) {
                return start;
            }
            if (lx >= l && rx <= r) {
                return tree[x];
            }
            int m = (lx + rx) / 2;
            return func.apply(result(l, r, 2 * x + 1, lx, m), result(l, r, 2 * x + 2, m, rx));
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        int n = in.nextInt();
        Integer[] a = readArray(n, in);

        int[] pos = new int[n + 1];
        for (int i = 0; i < n; i++) {
            pos[a[i]] = i;
        }
        SegTree<Integer, Integer> segTree = new SegTree<>(a, Math::min, t -> {
            Integer[] res = new Integer[t];
            Arrays.fill(res, Integer.MAX_VALUE);
            return res;
        }, Integer.MAX_VALUE, integer -> integer);
        long ans = solve(0, n, segTree, pos, n);
        out.println(ans);
        out.close();
    }

    private static long solve(int l, int r, SegTree<Integer, Integer> segTree, int[] pos, int n) {
        int min = segTree.result(l, r);
        int p = pos[min];
        long ans = (p - l + 1) * (r - p) * min;
        if (r - l > 1) {
            if (p > l) {
                ans += solve(l, p, segTree, pos, n);
            }
            if (p < r - 1) {
                ans += solve(p + 1, r, segTree, pos, n);
            }
        }
        return ans;
    }


    private static void outputArray(long[] ans, PrintWriter out) {
        StringBuilder str = new StringBuilder();
        for (long an : ans) {
            str.append(an).append(" ");
        }
        out.println(str);
    }

    private static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                createTokenizer();
            }
            return tokenizer.nextToken();
        }

        private void createTokenizer() {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public String nextString() {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public char nextChar() {
            return next().charAt(0);
        }

        public int[] nextInts() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                createTokenizer();
            }
            List<Integer> res = new ArrayList<>();
            while (tokenizer.hasMoreElements()) {
                res.add(Integer.parseInt(tokenizer.nextToken()));
            }
            int[] resArray = new int[res.size()];
            for (int i = 0; i < res.size(); i++) {
                resArray[i] = res.get(i);
            }
            return resArray;
        }
    }
}