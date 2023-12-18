import java.io.*;
import java.util.*;

class Main {
    static Scanner scanner = new Scanner();
    static long mod = 1000000007;

    public static void main(String[]$) {
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long gcd = gcd(a, b);
        System.out.println(getPrimeFactors(gcd).size() + 1);
    }

    static long gcd(long a, long b) {
        return 0 < b ? gcd(b, a % b) : a;
    }

    static Map<Long, Integer> getPrimeFactors(long n) {
        Map<Long, Integer> primeFactors = new HashMap<>();
        long c = n;
        for (long i = 2; i * i <= n && c > 1; i++) {
            int count = 0;
            while (c % i == 0) {
                count++;
                c /= i;
            }
            if (count > 0) {
                primeFactors.put(i, count);
            }
        }
        if (c > 1) {
            primeFactors.put(c, 1);
        }
        return primeFactors;
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

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
    }
}
