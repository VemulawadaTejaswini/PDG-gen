import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextLong();
        Arrays.sort(a);
        long ans = 0;
        if (n % 2 == 0) {
            for (int i = 0; i < n; i++) {
                if (i < (n - 2) / 2) ans -= a[i] * 2;
                else if (i < n / 2) ans -= a[i];
                else if (i < (n + 2) / 2) ans += a[i];
                else ans += a[i] * 2;
            }
        }
        else {
            for (int i = 0; i < n; i++) {
                if (i < (n - 2) / 2) ans -= a[i] * 2;
                else if (i < (n - 2) / 2 + 2) ans -= a[i];
                else ans += a[i] * 2;
            }
            long ans2 = 0;
            for (int i = 0; i < n; i++) {
                if (i < (n - 1) / 2) ans2 -= a[i] * 2;
                else if (i < (n - 1) / 2 + 2) ans2 += a[i];
                else ans2 += a[i] * 2; 
            }
            ans = Math.max(ans, ans2);
        }
        System.out.println(ans);
    }
}