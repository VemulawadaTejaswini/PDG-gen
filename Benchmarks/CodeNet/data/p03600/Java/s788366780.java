import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    private static boolean debug = false;
    private static boolean elapsed = false;

    private static PrintWriter _out = new PrintWriter(System.out);
    private static PrintWriter _err = new PrintWriter(System.err);

    private static final int INF = Integer.MAX_VALUE / 2;

    private static class Road {
        int u;
        int v;
        int d;
        public Road(int u, int v, int d) {
            this.u = u;
            this.v = v;
            this.d = d;
        }
        @Override
        public boolean equals(Object o) {
            if (o instanceof Road) {
                Road that = (Road)o;
                return this.u == that.u && this.v == that.v;
            }
            return false;
        }
        @Override
        public int hashCode() {
            int hashCode = 17;
            hashCode = hashCode * 31 + u;
            hashCode = hashCode * 31 + v;
            return hashCode;
        }
    }

    private void solve(Scanner sc) {
        int N = sc.nextInt();
        int[][] A = new int[N][N];
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                A[i][j] = sc.nextInt();
            }
        }

        int[][] B = new int[N][N];
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                B[i][j] = A[i][j];
            }
        }

        for (int k = 0; k < N; ++k) {
            for (int i = 0; i < N; ++i) {
                for (int j = 0; j < N; ++j) {
                    if (B[i][j] > B[i][k] + B[k][j]) {
                        B[i][j] = B[i][k] + B[k][j];
                    }
                }
            }
        }
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                if (B[i][j] < A[i][j]) {
                    _out.println(-1);
                    return;
                }
            }
        }

        Set<Road> set = new HashSet<>();
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                if (i != j) {
                    set.add(new Road(i, j, A[i][j]));
                }
            }
        }

        for (int w = 0; w < N; ++w) {
            Iterator<Road> it = set.iterator();
            while (it.hasNext()) {
                Road road = it.next();
                if (road.u != w && road.v != w) {
                    if (B[road.u][road.v] == B[road.u][w] + B[w][road.v]) {
                        it.remove();
                    }
                }
            }
        }

        long ans = 0;
        for (Road road : set) {
            ans += road.d;
        }
        _out.println((ans / 2));
    }
    private static BigInteger C(long n, long r) {
        BigInteger res = BigInteger.ONE;
        for (long i = n; i > n - r; --i) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        for (long i = r; i > 1; --i) {
            res = res.divide(BigInteger.valueOf(i));
        }
        return res;
    }
    private static BigInteger P(long n, long r) {
        BigInteger res = BigInteger.ONE;
        for (long i = n; i > n - r; --i) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
    /*
     * 10^10 > Integer.MAX_VALUE = 2147483647 > 10^9
     * 10^19 > Long.MAX_VALUE = 9223372036854775807L > 10^18
     */
    public static void main(String[] args) {
        long S = System.currentTimeMillis();

        Scanner sc = new Scanner(System.in);
        new Main().solve(sc);
        _out.flush();

        long G = System.currentTimeMillis();
        if (elapsed) {
            _err.println((G - S) + "ms");
        }
        _err.flush();
    }
}