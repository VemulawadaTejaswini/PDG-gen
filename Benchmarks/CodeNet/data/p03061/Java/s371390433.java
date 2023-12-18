import java.util.Scanner;

public class Main {

    private static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        long maxGcd = 1;
        for (int i = 0; i <= n; i++) {
            // a[i]を無視する
            long g = 0;
            long next = 0;
            for (int j = 0; j < n - 1; j++) {
                if (j == i || (j == i - 1 && j >= n - 2)) {
                    continue;
                }
                if (j == i - 1) {
                    next = a[j + 2];
                } else {
                    next = a[j + 1];
                }
                g = gcd(a[j], next);
            }
            if (g > maxGcd) {
                maxGcd = g;
            }
        }
        System.out.println(maxGcd);
    }

}
