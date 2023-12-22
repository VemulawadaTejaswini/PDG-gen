import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        long all_gcd = gcd(A);
        if (1 < all_gcd) {
            System.out.println("not coprime");
            return;
        }
        if (this.pairwise_coprime(A)) {
            System.out.println("pairwise coprime");
            return;
        }
        System.out.println("setwise coprime");
    }

    private boolean pairwise_coprime(int[] A) {
        int len = A.length;
        HashMap<Long, HashSet<Integer>> primes = new HashMap<>();
        for (int i = 0; i < len; i++) {
            long current = A[i];
            for (long j = 2; j * j <= A[i]; j++) {
                if (current % j != 0) {
                    continue;
                }
                if (primes.containsKey(j)) {
                    return false;
                }
                HashSet<Integer> set = new HashSet<>();
                primes.put(j, set);
                while (current % j == 0) {
                    current /= j;
                    set.add(A[i]);
                }
            }
        }
        for (long x : primes.keySet()) {
            if (1 < primes.get(x).size()) {
                return false;
            }
        }
        return true;
    }

    private int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }

    private int gcd(int[] A) {
        int gcd = A[0];
        for (int i = 0; i < A.length; i++) {
            gcd = this.gcd(gcd, A[i]);
        }
        return gcd;
    }
}
