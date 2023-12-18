import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        a[0] = 0;
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            ans += Math.abs(a[i] - a[(i + 1) % (n + 1)]);
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(ans + Math.abs(a[i - 1] - a[(i + 1) % (n + 1)])
                    - (Math.abs(a[i - 1] - a[i]) + Math.abs(a[i] - a[(i + 1) % (n + 1)])));
        }
    }
}
