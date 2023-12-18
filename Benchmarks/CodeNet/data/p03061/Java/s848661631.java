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
        long[] left = new long[n + 1];
        long[] right = new long[n + 1];
        for (int i = 0; i < n; i++) {
            left[i + 1] = gcd(left[i], a[i]);
            right[n - i - 1] = gcd(right[n - i], a[n - i - 1]);
        }
        long max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, gcd(left[i], right[i + 1]));
        }
        System.out.println(max);
    }

}
