import java.math.*;
import java.util.*;

public class Main {
    static long find(long a, long b, long n) {
        long ans = 0;
        if (a <= n / 2 && b <= n / 2) {
            ans = b - 1;
        } else if (a >= n / 2 && b >= n / 2) {
            ans = n - a;
        } else if (a <= n / 2 && b >= n / 2) {
            ans = Math.min(n - a, b - 1);
        }
        return ans;
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
