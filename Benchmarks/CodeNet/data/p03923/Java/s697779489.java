import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.math.BigInteger;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public long n;
        public long a;
        public HashMap<Long, BigInteger> mp;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextLong();
            a = in.nextLong();
            mp = new HashMap<>();
            long need = 1;
            while (getCookies(need).compareTo(BigInteger.valueOf(n)) < 0) {
                need *= 2;
            }
            long lo = need / 2, hi = need;
            while (lo < hi) {
                long mid = (lo + hi) / 2;
                if (getCookies(mid).compareTo(BigInteger.valueOf(n)) < 0) lo = mid + 1;
                else hi = mid;
            }
            out.println(lo);
        }

        public BigInteger getCookies(long days) {
            if (days == 0) return BigInteger.ZERO;
            if (days == 1) return BigInteger.ONE;
            if (days == 2) return BigInteger.valueOf(2);
            BigInteger x = mp.get(days);
            if (x != null) return x;
            BigInteger make = BigInteger.valueOf(days);
            long lo = a, hi = days - 1;
            while (hi - lo > 5) {
                long f1 = (2 * lo + hi) / 3, f2 = (lo + 2 * hi) / 3;
                BigInteger a1 = getCookies(f1 - a).multiply(BigInteger.valueOf(days - f1));
                BigInteger a2 = getCookies(f2 - a).multiply(BigInteger.valueOf(days - f2));
                if (a1.compareTo(a2) < 0) {
                    lo = f1;
                } else {
                    hi = f2;
                }
            }
            for (long i = lo; i <= hi; i++) {
                BigInteger cmp = getCookies(i - a).multiply(BigInteger.valueOf(days - i));
                if (cmp.compareTo(make) > 0) {
                    make = cmp;
                }
            }
            mp.put(days, make);
            return make;
        }

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

    }
}

