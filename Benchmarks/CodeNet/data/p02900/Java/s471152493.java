
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

        // max integer requred
        int UPPER_BOUND = (int) (Math.sqrt(Math.max(a, b)));

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

        int ans = 1;

        for (int i = 0; i < c; i++) {
            if (a % plist[i] == 0 && b % plist[i] == 0) {
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        // input
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        // solve
        int p = new Main(a, b).solve();

        // display
        System.out.println(p);
    }

}
