import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        int[] b = new int[n];
        for (int i = 0; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int m = a[n] + a[n - 1];
        int sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (b[i] >= m) {
                sum += m;
                try {
                    m = a[i - 1];
                } catch (Exception e) {

                }
            } else {
                sum += b[i];
                try {
                    if (b[i] > a[i])
                        m = m - b[i] + a[i - 1];
                    else
                        m = m - a[i + 1] + a[i - 1];
                } catch (Exception e) {

                }
            }
        }
        System.out.println(sum);
    }
}