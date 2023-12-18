import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] A = new long[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextLong();
        }

        System.out.println(solve(N, A));
    }

    public static int solve(int N, long[] A) {
        if (N == 2) {
            return (int)Math.max(A[0], A[1]);
        }

        int i=0;
        long gcd=gcd(A[1], A[2]);
        if (gcd < gcd(A[2], A[0])) {
            i = 1;
            gcd = gcd(A[2], A[0]);
        }
        if (gcd < gcd(A[0], A[1])) {
            i = 2;
            gcd = gcd(A[0], A[1]);
        }

        if (N == 3) {
            return (int)gcd;
        }

        for (int k=3; k<N; k++) {
            if (gcd(gcd, A[k]) < gcd(gcd, A[i])) {
                gcd = gcd(gcd, A[i]);
                i = k;
            }
        }

        return (int)gcd;
    }

    private static long gcd(long a, long b, long c) {
        return gcd(gcd(a, b), c);
    }

    private static long gcd(long a, long b) {
        if (a > b) return gcd(b, a);

        if (b%a == 0) return a;

        return gcd(b%a, a);
    }

    private static Set<Integer> eratosthenes(int x) {
        Set<Integer> primeSet = new HashSet<>();

        IntStream.rangeClosed(2, x)
                .filter(i -> IntStream.rangeClosed(2, (int) Math.sqrt(i))
                        .allMatch(j -> i % j != 0))
                .forEach(n -> {
                    primeSet.add(n);
                });

        return primeSet;
    }
}