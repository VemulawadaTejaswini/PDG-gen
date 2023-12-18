
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static long mod = 1000000007;

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = Integer.parseInt(sc.next());

        }
        List<Integer> primeList = primeList(1000);
        int[] primeArray = new int[1000007];

        for (int i = 0 ; i < n ; i++) {
            int b = a[i];
            for (Integer j : primeList) {
                int cnt = 0;
                while (b % j == 0) {
                    cnt++;
                    b /= j;
                }
                primeArray[j] = Math.max(primeArray[j], cnt);
                if (j * j > b) break;
            }
            if (b != 1) {
                primeArray[b] = Math.max(primeArray[b], 1);
                if (!primeList.contains(b)) primeList.add(b);
            }
        }
        long ans = 0;
        for (int i = 0 ; i < n ; i++) {
            long z = 1l;
            int b = a[i];
            for (int p : primeList) {
                int cnt = 0;
                if (primeArray[p] > 0) {
                    while (b % p == 0) {
                        b /= p;
                        cnt++;
                    }
                    z *= pow(p, primeArray[p] - cnt);
                    z %= mod;
                }
            }
            ans += z % mod;
        }
        System.out.println(ans % mod);

    }

    private static List<Integer> primeList(int max) {
        final List<Integer> prime = new ArrayList<Integer>();
        prime.add(2);
        for (int i = 3; i <= max; i += 2) {
            for (int wari : prime) {
                if (i % wari == 0)
                    break;
                if (wari * wari > i) {
                    prime.add(i);
                    break;
                }
            }
        }
        return prime;
    }
    static boolean isPrime(int i) {
        for (int j = 2 ; j <= Math.sqrt(i) ; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

    static long pow (long x, long n) {
        long sum = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                sum = sum * x % mod;
            }
            x = x * x % mod;
            n >>= 1;
        }
        return sum;
    }

}