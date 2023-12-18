import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    private void solve(FastScanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        UnionFind kuf = new UnionFind(n);
        UnionFind luf = new UnionFind(n);
        for (int i = 0; i < k; i++) {
            int p = sc.nextInt() - 1;
            int q = sc.nextInt() - 1;
            kuf.unite(p, q);
        }
        for (int i = 0; i < l; i++) {
            int s = sc.nextInt() - 1;
            int t = sc.nextInt() - 1;
            luf.unite(s, t);
        }
        Map<Integer, Set<Integer>> ks = new HashMap<>();
        Map<Integer, Set<Integer>> ls = new HashMap<>();
        for (int i = 0; i < n; i++) {
            ks.putIfAbsent(kuf.find(i), new HashSet<>());
            ks.get(kuf.find(i)).add(i);
            ls.putIfAbsent(luf.find(i), new HashSet<>());
            ls.get(luf.find(i)).add(i);
        }
        StringBuilder sb = new StringBuilder();
        Map<Integer, Set<Integer>> memo = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int kpar = kuf.find(i);
            int lpar = luf.find(i);
            int key = kpar*20001 + lpar;
            if (memo.containsKey(key)) {
                sb.append(memo.get(key).size());
            } else if (ks.get(kpar).size() == 1 || ls.get(lpar).size() == 1) {
                sb.append(1);
            } else {
                Set<Integer> kss = new HashSet<>(ks.get(kpar));
                Set<Integer> lss = ls.get(lpar);
                kss.retainAll(lss);
                memo.put(key, kss);
                sb.append(kss.size());
            }
            if (i < n - 1) sb.append(" ");
        }
        System.out.println(sb.toString());
    }

    /*
     * template
     */

    class UnionFind {

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
}