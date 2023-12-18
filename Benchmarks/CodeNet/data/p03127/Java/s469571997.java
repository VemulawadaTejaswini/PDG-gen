import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextLong();
        }
        long ans = Long.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            ans = Math.min(ans, gcd(a[i], a[i+1]));
        }
        System.out.println(ans);
    }

    public static long gcd(final long x, final long y) {
        if(x < y) {
            return gcd(y, x);
        }
        if(y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }
}