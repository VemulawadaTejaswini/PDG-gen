import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    int[] smallestDivisorOf;

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(f.readLine());
        int[] ar = new int[n];
        StringTokenizer tokenizer = new StringTokenizer(f.readLine());
        for (int i = 0; i < n; i++) {
            ar[i] = Integer.parseInt(tokenizer.nextToken());
        }

        smallestDivisorOf = new int[1000001];
        for (int i = 2; i < smallestDivisorOf.length; i++) {
            for (int j = i; j < smallestDivisorOf.length; j += i) {
                if (smallestDivisorOf[j] == 0) {
                    smallestDivisorOf[j] = i;
                }
            }
        }

        if (isPairwise(ar)) {
            out.println("pairwise coprime");
        } else if (isSetwise(ar)) {
            out.println("setwise coprime");
        } else {
            out.println("not coprime");
        }

        out.close();
    }

    private boolean isPairwise(int[] ar) {
        ar = Arrays.copyOf(ar, ar.length);
        HashSet<Integer> primes = new HashSet<Integer>();
        while (ar[0] != 1) {
            primes.add(smallestDivisorOf[ar[0]]);
            ar[0] /= smallestDivisorOf[ar[0]];
        }

        for (int i =  1; i < ar.length; i++) {
            HashSet<Integer> currentPrimes = new HashSet<Integer>();
            while (ar[i] != 1) {
                currentPrimes.add(smallestDivisorOf[ar[i]]);
                ar[i] /= smallestDivisorOf[ar[i]];
            }

            for (int j : currentPrimes) {
                if (primes.contains(j)) return false;
                primes.add(j);
            }
        }

        return true;
    }

    private boolean isSetwise(int[] ar) {
        int gcd = ar[0];
        for (int i = 1; i < ar.length; i++) {
            gcd = gcd(gcd, ar[i]);
        }

        return gcd == 1;
    }

    private int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}