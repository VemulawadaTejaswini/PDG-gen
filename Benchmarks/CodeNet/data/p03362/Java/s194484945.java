import java.util.Scanner;
 
public class Main {
 
    static int n;
    static boolean[] primes;
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
 
        sieve();
 
        solve();
    }
 
    static void solve() {
        int count = 0;
        for (int i = 5; i < primes.length; i++) {
            if (!primes[i]) {
                continue;
            }
 
            if (i % 5 == 1) {
                count++;
                if (count != n) {
                    System.out.print(i + " ");
                } else {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
 
    static void sieve() {
        int n = 55555;
 
        final int MAX = n + 1;
        primes = new boolean[MAX];
 
        for (int i = 3; i < MAX; i+=2) {
            primes[i] = true;
        }
        primes[2] = true;
 
        for (int i = 3; i <= Math.sqrt(MAX); i += 2) {
            if (primes[i]) {
                for (int j = i*2; j < MAX; j += i) {
                    primes[j] = false;
                }
            }
        }
    }
}