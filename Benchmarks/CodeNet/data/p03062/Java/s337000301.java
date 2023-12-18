import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        int minus = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 1; i < n; i++) {
             if (a[i - 1] < 0 && a[i] > 0) {
                minus++;
            }
        }
        if (minus % 2 != 0) {
            a[n - 1] = a[n - 1] * - 1;
        }
        long ans = 0;
        for (int i = 0; i < n - 1; i++) {
            ans += Math.abs(a[i]);
        }
        ans += a[n - 1];
        System.out.println(ans);
    }
}