// package arc.arc085;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    static class UnionFind {
        int[] rank;
        int[] parent;

        public UnionFind(int n) {
            rank = new int[n];
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public void init() {
            int n = rank.length;
            for (int i = 0; i < n ; i++) {
                rank[i] = 0;
                parent[i] = i;
            }
        }

        public int find(int a) {
            if (parent[a] == a) {
                return a;
            }
            parent[a] = find(parent[a]);
            return parent[a];
        }

        public void unite(int a, int b) {
            a = find(a);
            b = find(b);
            if (a == b) {
                return;
            }
            if (rank[a] < rank[b]) {
                parent[a] = b;
            } else {
                parent[b] = a;
                if (rank[a] == rank[b]) {
                    rank[a]++;
                }
            }
        }

        private boolean issame(int a, int b) {
            return find(a) == find(b);
        }
    }


    static final int SEARCH_ALL_TILL = 16;

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        long[] a = new long[101];
        for (int i = 1 ; i <= n ; i++) {
            a[i] = in.nextLong();
        }
        // n = 100;
        
        int groupSize = 50-SEARCH_ALL_TILL+1;
        List<Integer>[] groups = new List[groupSize];
        for (int i = 0; i < groupSize ; i++) {
            groups[i] = new ArrayList<>();
        }

        boolean[] alive = new boolean[101];

        long ans = 0;
        for (int ptn = 0 ; ptn < 1<<(SEARCH_ALL_TILL-1); ptn++) {
            Arrays.fill(alive, true);
            for (int i = 0 ; i < 15 ; i++) {
                if ((ptn & (1<<i)) >= 1) {
                    int num = 2+i;
                    for (int j = num ; j <= 100 ; j += num) {
                        alive[j] = false;
                    }
                }
            }

            UnionFind uf = new UnionFind(34);
            for (int nu = SEARCH_ALL_TILL+1 ; nu <= 50 ; nu++) {
                for (int gg = nu ; gg <= 100 ; gg += nu) {
                    if (alive[gg]) {
                        for (int pv = 1 ; pv * pv <= nu ; pv++) {
                            if (gg % pv == 0) {
                                if (SEARCH_ALL_TILL+1 <= gg / pv && gg / pv <= 50) {
                                    uf.unite(nu-SEARCH_ALL_TILL-1, gg/pv-SEARCH_ALL_TILL-1);
                                }
                            }
                        }
                    }
                }
            }

            for (int i = 0; i < 35 ; i++) {
                groups[i].clear();
            }
            for (int i = 0; i < uf.parent.length ; i++) {
                groups[uf.find(i)].add(17+i);
            }


            for (int i = 0 ; i < groups.length ; i++) {
                if (groups[i].size() >= 1) {
                    solve(groups[i], alive, a);
                }
            }

            for (int i = 51 ; i <= 100 ; i++) {
                if (a[i] < 0) {
                    alive[i] = false;
                }
            }
            long total = 0;
            for (int i = 1 ; i <= 100 ; i++) {
                if (alive[i]) {
                    total += a[i];
                }
            }
            ans = Math.max(ans, total);

            break;
        }

        out.println(ans);
        out.flush();
    }

    private static void solve(List<Integer> group, boolean[] alive, long[] a) {
        int n = group.size();

        int bestPtn = 0;
        long bestDec = 0;
        for (int ptn = 1  ; ptn < (1<<n) ; ptn++) {
            boolean[] al = alive.clone();
            long dec = 0;
            for (int f = 0 ; f < n ; f++) {
                if ((ptn & (1<<f)) >= 1) {
                    int g = group.get(f);
                    for (int gg = g ; gg <= 100 ; gg += g) {
                        if (al[gg]) {
                            al[gg] = false;
                            dec += a[gg];
                        }
                    }
                }
            }
            if (bestDec > dec) {
                bestDec = dec;
                bestPtn = ptn;
            }
        }

        for (int f = 0 ; f < n ; f++) {
            if ((bestPtn & (1<<f)) >= 1) {
                int g = group.get(f);
                for (int gg = g ; gg <= 100 ; gg += g) {
                    if (alive[gg]) {
                        alive[gg] = false;
                    }
                }
            }
        }
    }

    public static void debug(Object... o) {
        System.err.println(Arrays.deepToString(o));
    }

    public static class InputReader {
        private static final int BUFFER_LENGTH = 1 << 12;
        private InputStream stream;
        private byte[] buf = new byte[BUFFER_LENGTH];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        private int next() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public char nextChar() {
            return (char) skipWhileSpace();
        }

        public String nextToken() {
            int c = skipWhileSpace();
            StringBuilder res = new StringBuilder();
            do {
                res.append((char) c);
                c = next();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public int nextInt() {
            return (int) nextLong();
        }

        public long nextLong() {
            int c = skipWhileSpace();
            long sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = next();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = next();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble() {
            return Double.valueOf(nextToken());
        }

        int skipWhileSpace() {
            int c = next();
            while (isSpaceChar(c)) {
                c = next();
            }
            return c;
        }

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
    }
}