
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] left = new int[n + 1];
        for (int i = 0; i < a.length; i++) {
            left[i + 1] = gcd(left[i], a[i]);
        }

        int[] right = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            right[i] = gcd(right[i + 1], a[i]);
        }

        int gcd = 0;
        for (int i = 0; i < n; i++) {
            gcd = Math.max(gcd(left[i], right[i + 1]), gcd);
        }
        System.out.println(gcd);

    }

    public static int gcd(int x, int y) {
        if (y == 0)
            return x;
        return gcd(y, x % y);
    }
}
