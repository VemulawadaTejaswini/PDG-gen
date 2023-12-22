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
    static final long inf = 0x1fffffffffffffffL;
    static final int iinf = 0x3fffffff;
    static final double eps = 1e-9;
    static final long mod = 1000000007;

    Set<Integer> or;
    List<Integer> primes = new ArrayList<>();
    void solve() {
        linearPrimeTable(1000, primes);
        int n = in.nextInt();
        int[] a = in.nextIntArray(n);
        int count = 0;
        or = new HashSet<>();
        Set<Integer> all = null;
        for (int i = 0; i < n; i++) {
            Set<Integer> primeFactors = getPrimeFactors(a[i]);
            if (i == 0) {
                all = primeFactors;
            } else {
                all.removeIf(prime -> !primeFactors.contains(prime));
            }
            count += primeFactors.size();
        }
        if (!all.isEmpty()) {
            out.println("not coprime");
        } else if (count == or.size()) {
            out.println("pairwise coprime");
        } else {
            out.println("setwise coprime");
        }
    }

    int[] linearPrimeTable(int n, List<Integer> primes) {
        int[] minPrimeFactor = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            minPrimeFactor[i] = i;
        }
        for (int i = 2; i <= n; i++) {
            if (minPrimeFactor[i] == i) {
                primes.add(i);
            }
            for (int prime : primes) {
                if (prime > minPrimeFactor[i] || (long)prime * i > n) {
                    break;
                }
                minPrimeFactor[prime * i] = prime;
            }
        }
        return minPrimeFactor;
    }

    Set<Integer> getPrimeFactors(int n) {
        Set<Integer> primeFactors = new HashSet<>();
        int c = n;
        for (Integer prime : primes) {
            if (c % prime != 0) {
                continue;
            }
            while (c % prime == 0) {
                c /= prime;
            }
            primeFactors.add(prime);
            or.add(prime);
        }
        if (c > 1) {
            primeFactors.add(c);
            or.add(c);
        }
        return primeFactors;
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
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

    List<List<Integer>> nextEdges(int n, int m) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int u = nextInt() - 1;
            int v = nextInt() - 1;
            res.get(u).add(v);
            res.get(v).add(u);
        }
        return res;
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
