import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Main {

    public static void main(String[] args) throws IOException {
        doit(args, System.in, System.out);
    }

    static void doit(String[] args, InputStream in, PrintStream out)
            throws IOException {
        int[] primes = new int[5133];
        fillPrimes(primes, 50000);

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        while (true) {
            int n = Integer.parseInt(reader.readLine());
            if (n == 0) {
                break;
            }
            int result = 0;
            int h = n / 2;
            for (int i = 0; i < primes.length; i++) {
                int p = primes[i];
                if (p > h) {
                    break;
                }
                for (int j = i; j < primes.length; j++) {
                    int sum = p + primes[j];
                    if (sum > n) {
                        break;
                    } else if (sum == n) {
                        result++;
                        break;
                    }
                }
            }
            out.println(result);
        }
    }

    private static int fillPrimes(int[] primes, int n) {
        boolean[] sieve = new boolean[n + 1];
        int k = (int) Math.sqrt(n);
        int i = 0;
        for (int p = 2; p <= n; p++) {
            if (sieve[p]) {
                continue;
            }
            primes[i++] = p;
            if (p <= k) {
                for (int q = p * 2; q <= n; q += p) {
                    sieve[q] = true;
                }
            }
        }
        return i;
    }
}