import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sumA += a[i];
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
            sumB += b[i];
        }
        sumA -= a[0];
        sumB -= b[n - 1];
        int ans = a[0];
        if (n == 1) {
            System.out.println(a[0] + b[0]);
            return;
        }
        for (int i = 1; i < n; i++) {
            if (sumA > sumB) {
                ans += a[i];
                sumA -= a[i];
                sumB -= b[i - 1];
            } else {
                ans += sumB + b[n - 1];
                break;
            }
        }
        System.out.println(ans);
    }
}
