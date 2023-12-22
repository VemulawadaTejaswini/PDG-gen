import java.util.*;

class Main {

    static boolean [] primes;

    static void makePrimeList() {

        for(int i = 0; i < 50001; i++) {
            primes[i] = true;
        }

        primes[0] = false;
        primes[1] = false;

        for(int n = 2; n < 50001; n++) {
            if (primes[n]) {
                for(int k = 2 * n; k < 50001; k += n) {
                    primes[k] = false;
                }
            }
        }

    }

    static void solve (int n) {

        int result = 0;

        for(int i = 2; i <= n / 2; i++) {
            if (primes[i] && primes[n-i]) result += 1;
        }

        System.out.println(result);
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        primes = new boolean[50001];
        makePrimeList();

        while (true) {
            int n = sc.nextInt();

            if ( n == 0 )   break;

            solve(n);
        }

    }
}