
import java.util.Scanner;

public class Main {

    long a;
    long b;

    Main(long a, long b) {
        this.a = a;
        this.b = b;
    }

    /**
     * 
     * @return greeting message
     */
    public int solve() {

        long g = gcd(a, b);

        // max integer requred
        int UPPER_BOUND = (int) (Math.sqrt(g)) + 1;

        // prime sieve
        boolean[] isPrime = new boolean[UPPER_BOUND];

        // prime list
        int[] plist = new int[UPPER_BOUND];

        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i < UPPER_BOUND; i++) {
            isPrime[i] = true;
        }

        int c = 0;
        for (int i = 2; i < UPPER_BOUND; i++) {
            if (isPrime[i]) {
                plist[c++] = i;
                for (int j = i * 2; j < UPPER_BOUND; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // including 1
        int ans = 1;

        for (int i = 0; i < c; i++) {
            if (g % plist[i] == 0) {
                ans++;
            }
        }

        if (ans == 1 && g != 1) {
            // g is prime
            ans++;
        }

        return ans;
    }

    static long gcd(long a, long b) {
        long x;
        long y;

        if (a < b) {
            x = b;
            y = a;
        } else {
            x = a;
            y = b;
        }

        if (y == 0) {
            return x;
        }

        while (x >= 0) {
            x -= y;
        }
        return gcd(x + y, y);
    }

    public static void main(String[] args) {

        // input
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        sc.close();

        // solve
        int p = new Main(a, b).solve();

        // display
        System.out.println(p);
    }

}
