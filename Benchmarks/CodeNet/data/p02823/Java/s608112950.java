import java.math.*;
import java.util.*;

public class Main {
    static long find(long x, long y, long z) {
        double a = (double) x;
        double b = (double) y;
        double n = (double) z;
        double ans = 0;
        if (a <= n / 2 && b <= n / 2) {
            ans = Math.min(b - 1, b - a);
        } else if (a >= n / 2 && b >= n / 2) {
            ans = Math.min(n - a, b - a);
        } else if (a <= n / 2 && b >= n / 2) {
            ans = Math.min(Math.min(n - a, b - 1), b - a);
        }
        return (long) (int) ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n;
        long a;
        long b;
        n = sc.nextLong();
        a = sc.nextLong();
        b = sc.nextLong();
        long ans = 0;
        if ((b - a) % 2 == 1)
            ans = find(a, b, n);
        else
            ans = (b - a) / 2;
        System.out.println(ans);
    }
}
