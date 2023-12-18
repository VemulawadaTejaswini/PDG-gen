import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    private void solve(FastScanner sc) {
        final int W = 0;
        final int H = 1;
        int w = sc.nextInt();
        int h = sc.nextInt();
        long ans = 0;
        int[] p = new int[w];
        for (int i = 0; i < w; i++) {
            p[i] = sc.nextInt();
        }
        int[] q = new int[h];
        for (int i = 0; i < h; i++) {
            q[i] = sc.nextInt();
        }
        List<Integer> ps = Arrays.stream(p).sorted().boxed().collect(Collectors.toList());
        List<Integer> qs = Arrays.stream(q).sorted().boxed().collect(Collectors.toList());
        Comparator<Integer> lbc = new LowerBoundComparator<>();
        Comparator<Integer> lebc = new LowerEqualBoundComparator<>();
        for (int i = 0; i < w; i++) {
            int cnt = ~Collections.binarySearch(qs, p[i], lbc);
            ans += p[i] * (long) (h + 1 - cnt);
        }
        for (int i = 0; i < h; i++) {
            int cnt = ~Collections.binarySearch(ps, q[i], lebc);
            ans += q[i] * (long) (w + 1 - cnt);
        }
        System.out.println(ans);
    }

    /*
     * template
     */

    class LowerBoundComparator<T extends Comparable<? super T>>
            implements Comparator<T>
    {
        public int compare(T x, T y)
        {
            return (x.compareTo(y) >= 0) ? 1 : -1;
        }
    }

    class LowerEqualBoundComparator<T extends Comparable<? super T>>
            implements Comparator<T>
    {
        public int compare(T x, T y)
        {
            return (x.compareTo(y) > 0) ? 1 : -1;
        }
    }

    static class Pair {

        public int fst;
        public int snd;

        public Pair(int fst, int snd) {
            this.fst = fst;
            this.snd = snd;
        }

        public Pair(List<Integer> list) {
            this.fst = list.get(0);
            this.snd = list.get(1);
        }

        public Pair(int[] array) {
            this.fst = array[0];
            this.snd = array[1];
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Pair)) return false;

            Pair pair = (Pair) o;

            return fst == pair.fst && snd == pair.snd;

        }

        @Override
        public int hashCode() {
            int result = fst;
            result = 31 * result + snd;
            return result;
        }

        @Override
        public String toString() {
            return "(" + fst + ", " + snd + ")";
        }

        public void swap() {
            int swap = fst;
            fst = snd;
            snd = swap;
        }
    }

    public static final int GETA = 10001;

    public static int toTuple(int fst, int snd) {
        return fst * GETA + snd;
    }

    public static int getFst(int t) {
        return t / GETA;
    }

    public static int getSnd(int t) {
        return t % GETA;
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        new Main().solve(sc);
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int bufLen = 0;

        private boolean hasNextByte() {
            if (ptr < bufLen) {
                return true;
            } else {
                ptr = 0;
                try {
                    bufLen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (bufLen <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
            return hasNextByte();
        }

        String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        long nextLong() {
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

        int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    static class UnionFind {

        private int[] par;
        private int[] rank;

        public UnionFind(int n) {
            par = IntStream.range(0, n).toArray();
            rank = new int[n];
        }

        public int find(int x) {
            return par[x] == x ? x : (par[x] = find(par[x]));
        }

        public void unite(int x, int y) {
            x = find(x);
            y = find(y);
            if (x == y) return;
            if (rank[x] < rank[y]) {
                par[x] = y;
            } else {
                par[y] = x;
                if (rank[x] == rank[y]) rank[x]++;
            }
        }

        public boolean same(int x, int y) {
            //noinspection SuspiciousNameCombination
            return find(x) == find(y);
        }
    }
}