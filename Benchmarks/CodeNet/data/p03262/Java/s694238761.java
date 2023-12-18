import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long x = Long.parseLong(sc.next());
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            long temp = Long.parseLong(sc.next());
            a[i] = Math.abs(temp - x);
        }
        long ans = a[0];
        for (int i = 1; i < n - 1; i++) {
            ans = getGcd(ans, a[i]);
        }
        System.out.println(ans);
    }

    private static long getGcd(long x, long y) {
        return y == 0 ? x : getGcd(y, x % y);
    }
}