import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, c, ans;
        int[] a = new int[20];
        int[] b = new int[20];
        n = sc.nextInt();
        m = sc.nextInt();
        c = sc.nextInt();
        ans = 0;
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[j] = sc.nextInt();
            }
            int sum;
            sum = 0;
            for (int j = 0; j < m; j++) {
                sum += a[j] * b[j];
            }
            if (sum + c > 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}