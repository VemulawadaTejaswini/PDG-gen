import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] left = new int[n + 1];
        int[] right = new int[n + 1];
        left[0] = 0;
        right[n] = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            left[i + 1] = gcd(left[i], a[i]);
        }
        for (int i = n - 1; i >= 0; i--) {
            right[i] = gcd(right[i + 1], a[i]);
        }
        for (int i = 0; i < n; i++) {
            int m = gcd(left[i], right[i + 1]);
            if (ans < m)
                ans = m;
        }
        System.out.println(ans);
    }

    static int gcd(int x, int y) {
        if (y > x)
            return gcd(y, x);
        if (y == 0)
            return x;
        else
            return gcd(y, x % y);
    }
}
