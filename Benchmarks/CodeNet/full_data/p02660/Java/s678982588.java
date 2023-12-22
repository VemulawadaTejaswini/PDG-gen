import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    static PrintWriter out;
    static CF_Reader in;

    public static void main(String[] args) throws IOException {
        out = new PrintWriter(new OutputStreamWriter(System.out));
        in = new CF_Reader();

        long n = in.longNext();
        ArrayList<Long> primes = generatePrimes((int) Math.sqrt(n));
        out.println(solve(primes, n));
        out.close();
    }

    static int solve(ArrayList<Long> primes, long n) {
        if (n <= 1) return 0;
        int res = 0;
        for (long prime: primes) {
            if (n % prime == 0) {
                HashSet<Integer> seen = new HashSet<>();
                seen.add(1);
                res++;
                n = n / prime;
                int j = 0;
                while(n % prime == 0) {
                    j += 1;
                    n = n / prime;
                    if (!seen.contains(j)) {
                        res++;
                        j = 0;
                    }
                }
            }
        }
        return (res > 0) ? res : 1;
    }

    static ArrayList<Long> generatePrimes(int n) {
        ArrayList<Long> primes = new ArrayList<>();
        boolean[] nonPrimes = new boolean[n + 1];
        for (long i = 2; i <= n; i++) {
            if (!nonPrimes[(int) i]) primes.add(i);
            long j = 2;
            while (j * i <= n) {
                nonPrimes[(int) (j * i)] = true;
                j++;
            }
        }
        return primes;
    }

    static class CF_Reader {
        BufferedReader br;
        StringTokenizer st;

        public CF_Reader() throws IOException {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine().trim());
            return st.nextToken();
        }

        long longNext() throws IOException {
            return Long.parseLong(next());
        }

        int intNext() throws IOException {
            return Integer.parseInt(next());
        }

        double doubleNext() throws IOException {
            return Double.parseDouble(next());
        }

        char charNext() throws IOException {
            return next().charAt(0);
        }

        public int[] nextIntArray(final int n) throws IOException {
            final int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = intNext();
            return a;
        }

        public long[] nextLongArray(final int n) throws IOException {
            final long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = longNext();
            return a;
        }

        String line() throws IOException {
            return br.readLine().trim();
        }
    }
}


