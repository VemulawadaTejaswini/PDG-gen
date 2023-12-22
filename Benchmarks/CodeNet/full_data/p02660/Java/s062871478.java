import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {
    long N;
    TreeMap<Integer, Integer> primes;
    public static List<Integer> generatePrimeList(int N) {
        List<Integer> primes = new ArrayList<>();
        for(int i = 2;i < N + 1;i++) {
            boolean notDivisible = true;
            for(int j = 2;j * j <= i;j++) {
                if (i % j == 0) {
                    notDivisible = false;
                    break;
                }
            }

            if (notDivisible) {
                primes.add(i);
            }
        }
        return primes;
    }
    private void prime(long n) {
        primes = new TreeMap<>();
        List<Integer> primeList = generatePrimeList(1000000);
        for(int p : primeList) {
            int f = 0;
            while(n % p == 0) {
                f++;
                n /= p;
            }
            if (f > 0) {
                primes.put(p, f);
            }
        }
    }
    public static boolean isPrime(long N) {
        if (N <= 1) {
            return false;
        }

        for(long i = 2;(long)i * i <= N && i <= 1000000;i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }

    private void solve() {
        N = nextLong();
        if (N == 1) {
            out.println(0);
            return;
        }
        if (isPrime(N)) {
            out.println(1);
            return;
        }
        prime(N);
        Queue<Integer> q = new ArrayDeque<>(), nq;
        for(int i = 2;i < 1000000 + 1;i++) {
            if (primes.containsKey(i)) {
                q.add(primes.get(i));
            }
        }

        int ans = 0;
        for(int i = 1;i < 20;i++) {
            nq = new ArrayDeque<>();
            while(!q.isEmpty()) {
                int p = q.poll();
                if (p < i) {
                    continue;
                }
                ans += 1;
                p -= i;
                if (p > i) {
                    nq.add(p);
                }
            }
            q = nq;
        }
        out.println(ans);
    }

    public static void main(String[] args) {
        out.flush();
        new Main().solve();
        out.close();
    }

    /* Input */
    private static final InputStream in = System.in;
    private static final PrintWriter out = new PrintWriter(System.out);
    private final byte[] buffer = new byte[4096];
    private int p = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (p < buflen)
            return true;
        p = 0;
        try {
            buflen = in.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (buflen <= 0)
            return false;
        return true;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrint(buffer[p])) {
            p++;
        }
        return hasNextByte();
    }

    private boolean isPrint(int ch) {
        if (ch >= '!' && ch <= '~')
            return true;
        return false;
    }

    private int nextByte() {
        if (!hasNextByte())
            return -1;
        return buffer[p++];
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = -1;
        while (isPrint((b = nextByte()))) {
            sb.appendCodePoint(b);
        }
        return sb.toString();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}