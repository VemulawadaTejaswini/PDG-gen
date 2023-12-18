import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        double[] ev = new double[n];
        for (int i = 0; i < n; i++) {
            ev[i] = (double) (1 + p[i]) / 2;
        }
        double[] sum = new double[n + 1];
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i - 1] + ev[i - 1];
        }
        double ans = 0;
        for (int i = 0; i + k <= n; i++) {
            ans = Math.max(ans, sum[i + k] - sum[i]);
        }
        System.out.println(ans);
    }
}