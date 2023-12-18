import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        long startTime = System.nanoTime();
        int t = 1;
        while (t-- > 0) {
            solve();
        }
        long endTime = System.nanoTime();
        err.println("Execution Time : +" + (endTime - startTime) / 1000000 + " ms");
        exit(0);
    }

    static void solve() {
        long A = in.nextLong();
        long B = in.nextLong();
        boolean[] primes = primeSieve(1000010);
        Set<Long> f = new HashSet<>(divisors(A));
        Set<Long> g = new HashSet<>(divisors(B));

        Set<Long> fp = new HashSet<>(facotrs(A, primes));
        Set<Long> gp = new HashSet<>(facotrs(B, primes));
        //        out.println(fp);
        //        out.println(gp);

        fp.retainAll(gp);
        g.retainAll(f);
        //        out.println(fp);
        //        out.println(g);
        int ans = g.size() + fp.size();
        for (long a : g) {
            for (long j : fp) {
                if (a % j == 0) {
                    ans--;
                    break;
                }
            }
        }
        out.println(ans);

    }

    static ArrayList<Long> facotrs(long a, boolean[] primes) {
        ArrayList<Long> f = new ArrayList<>();
        for (int i = 2; 1L * i * i <= a; i++) {
            if (primes[i] && a % i == 0) {
                f.add((long) i);
            }
        }
        return f;
    }

    //GCD Long
    static long gcd(long a, long b) {
        while (b != 0) {
            long t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    static boolean[] primeSieve(int n) {
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (primes[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }
        return primes;
    }

    static ArrayList<Long> divisors(long a) {
        ArrayList<Long> div = new ArrayList<Long>();
        div.add(1L);
        for (long i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                div.add(i);
                if (i * i != a) {
                    div.add(a / i);
                }
            }
        }
        div.add(a);
        return div;
    }

    static void debug(Object... args) {
        for (Object a : args) {
            out.println(a);
        }
    }

    static void y() {
        out.println("YES");
    }

    static void n() {
        out.println("NO");
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] readAllInts(int n) {
            int[] p = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = in.nextInt();
            }
            return p;
        }

        public int[] readAllInts(int n, int s) {
            int[] p = new int[n + s];
            for (int i = s; i < n + s; i++) {
                p[i] = in.nextInt();
            }
            return p;
        }

        public long[] readAllLongs(int n) {
            long[] p = new long[n];
            for (int i = 0; i < n; i++) {
                p[i] = in.nextInt();
            }
            return p;
        }

        public long[] readAllLongs(int n, int s) {
            long[] p = new long[n + s];
            for (int i = s; i < n + s; i++) {
                p[i] = in.nextInt();
            }
            return p;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    static void exit(int a) {
        out.close();
        err.close();
        System.exit(a);
    }

    static InputStream inputStream = System.in;
    static OutputStream outputStream = System.out;
    static OutputStream errStream = System.err;
    static InputReader in = new InputReader(inputStream);
    static PrintWriter out = new PrintWriter(outputStream);
    static PrintWriter err = new PrintWriter(errStream);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

}
