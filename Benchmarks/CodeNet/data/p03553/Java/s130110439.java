// package arc.arc085;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    static class UnionFind {
        int[] rank;
        int[] parent;
        int[] cnt;

        public UnionFind(int n) {
            rank = new int[n];
            parent = new int[n];
            cnt = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                cnt[i] = 1;
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
                cnt[b] += cnt[a];
                cnt[a] = cnt[b];
            } else {
                parent[b] = a;
                cnt[a] += cnt[b];
                cnt[b] = cnt[a];
                if (rank[a] == rank[b]) {
                    rank[a]++;
                }
            }
        }

        public int groupCount(int a) {
            return cnt[find(a)];
        }

        private boolean issame(int a, int b) {
            return find(a) == find(b);
        }
    }


    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        long[] a = new long[101];
        for (int i = 1 ; i <= n ; i++) {
            a[i] = in.nextLong();
        }

        List<Integer>[] groups = new List[35];
        for (int i = 0; i < 35 ; i++) {
            groups[i] = new ArrayList<>();
        }

        boolean[] alive = new boolean[101];

        long ans = 0;
        for (int ptn = 0 ; ptn < 1<<15; ptn++) {
            Arrays.fill(alive, true);
            for (int i = 0 ; i < 15 ; i++) {
                if ((ptn & (1<<i)) >= 1) {
                    int num = 2+i;
                    for (int j = num ; j <= n ; j += num) {
                        alive[j] = false;
                    }
                }
            }

            UnionFind uf = new UnionFind(34);
            for (int nu = 17 ; nu <= n/2 ; nu++) {
                if (alive[nu] && alive[nu*2]) {
                    if (nu*2 <= n/2) {
                        uf.unite(nu-17, nu*2-17);
                    }
                }
            }

            for (int i = 0; i < 35 ; i++) {
                groups[i].clear();
            }
            for (int i = 0; i < uf.parent.length ; i++) {
                groups[uf.find(i)].add(17+i);
            }

            for (int i = 0; i < groups.length ; i++) {
                int gn = groups[i].size();
                if (gn >= 1) {
                    long best = 0;
                    int bestWay = -1;
                    int gi = 0;
                    for (int g : groups[i]) {
                        long score = 0;
                        for (int gg = g ; gg <= 100 ; gg += g) {
                            score += a[gg];
                        }
                        if (best > score) {
                            best = score;
                            bestWay = gi;
                        }
                        gi++;
                    }
                    if (bestWay != -1) {
                        int g = groups[i].get(bestWay);
                        for (int gg = g ; gg <= 100 ; gg += g) {
                            alive[gg] = false;
                        }
                    }
                }
            }

            for (int i = n/2+1 ; i <= n ; i++) {
                if (a[i] < 0) {
                    alive[i] = false;
                }
            }
            long total = 0;
            for (int i = 1 ; i <= n ; i++) {
                if (alive[i]) {
                    total += a[i];
                }
            }
            ans = Math.max(ans, total);
        }

        out.println(ans);
        out.flush();
    }

    /**
     * Computes Euler's totient function value of num : φ(num)
     *
     * O(sqrt(n))
     *
     * @param num
     * @return
     */
    static long totient(long num) {
        int[] primes = generatePrimes((int)Math.sqrt(num)+10);

        long ans = 1;
        for (long p : primes) {
            if (num < p) {
                break;
            }
            long pn = 1;
            while (num % p == 0) {
                pn *= p;
                num /= p;
            }
            ans *= (pn / p) * (p - 1);
        }
        if (num >= 2) {
            ans *= num - 1;
        }
        return ans;
    }


    /**
     * Generates primes less than upto.
     *
     * O(nlog(logn))
     *
     * @param upto limit
     * @return array of primes
     */
    static int[] generatePrimes(int upto) {
        boolean[] isp = new boolean[upto];
        Arrays.fill(isp, true);
        isp[0] = isp[1] = false;

        int pi = 0;
        for (int i = 2; i < upto ; i++) {
            if (isp[i]) {
                pi++;
                for (int j = i * 2; j < upto; j += i) {
                    isp[j] = false;
                }
            }
        }

        int[] ret = new int[pi];
        int ri = 0;
        for (int i = 2 ; i < upto ; i++) {
            if (isp[i]) {
                ret[ri++] = i;
            }
        }
        return ret;
    }

    /**
     * Moebius function. Returns array of μ(n).
     * O(n)
     *
     * @param n limit
     * @return array of μ(n)
     */
    public static int[] moebius(int n) {
        boolean[] isp = new boolean[n];
        Arrays.fill(isp, true);
        isp[1] = isp[0] = false;
        for (int i = 2 ; i < isp.length ; i++) {
            if (isp[i]) {
                for (int ii = i*2 ; ii < isp.length ; ii += i) {
                    isp[ii] = false;
                }
            }
        }

        int[] mb = new int[n];
        Arrays.fill(mb, 1);
        for (int x = 1 ; x < mb.length ; x++) {
            if (isp[x]) {
                int cnt = 1;
                for (int xx = x ; xx < mb.length ; xx += x) {
                    if (cnt % x == 0) {
                        mb[xx] = 0;
                    } else {
                        mb[xx] *= -1;
                    }
                    cnt++;
                }
            }
        }
        return mb;
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