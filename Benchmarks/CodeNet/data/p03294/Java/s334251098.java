import java.util.Scanner;

public class Main {

    private static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        long l = lcm(a[0], a[1]);
        for (int i = 2; i < n; i++) {
            l = lcm(l, a[i]);
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += (l - 1) % a[i];
        }
        System.out.println(ans);
    }

}
