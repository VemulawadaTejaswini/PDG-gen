import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        a[n] = x;
        Arrays.sort(a);
        for (int i = 0; i <= n; i++) {
            a[i] -= x;
        }
        for (int i = 1; i <= n; i++) {
            a[i] -= a[0];
        }
        a[0] = 0;
        int ans = a[1] - a[0];
        for (int i = 2; i <= n; i++) {
            ans = gcd(ans, a[i] - a[i - 1]);
        }
        System.out.println(ans);

    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

}
