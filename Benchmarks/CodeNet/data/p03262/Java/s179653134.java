import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        a[n] = x;
        Arrays.sort(a);
        long ans = a[1] - a[0];
        for (int i = 0; i < n; i++) {
            long dif1 = a[i + 1] - a[i];
            ans = gcd(ans, dif1);
        }
        System.out.println(ans);

    }

    private static long gcd(long m, long n) {
        if (m < n)
            return gcd(n, m);
        if (n == 0)
            return m;
        return gcd(n, m % n);
    }

}