import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans1 = 0;
        for (int i = 0; i < n; i++) {
            ans1 = gcd(ans1, a[i]);
        }
        for (int i = 0; i < n; i++) {
            int m = a[i];
            a[i] = 0;
            int ans2 = 0;
            for (int j = 0; j < n; j++) {
                ans2 = gcd(ans2, a[j]);
            }
            a[i] = m;
            ans1 = Math.max(ans1, ans2);
        }
        System.out.println(ans1);
        sc.close();
    }

    static int gcd(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        if (min == 0) {
            return max;
        }
        return gcd(min, max % min);
    }
}