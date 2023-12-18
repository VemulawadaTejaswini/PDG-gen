
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int l = -2000000000;
        int r = 2000000000;
        long anss = 0;
        while (l < r) {

            int tmp = (l + r) / 2;

            int b = tmp;
            long ans = 0;
            for (int i = 0; i < n; i++) {
                ans += Math.abs(a[i] - 1 - i - b);
            }

            b = tmp + 1;
            long ans2 = 0;
            for (int i = 0; i < n; i++) {
                ans2 += Math.abs(a[i] - 1 - i - b);
            }

            b = tmp - 1;
            long ans3 = 0;
            for (int i = 0; i < n; i++) {
                ans3 += Math.abs(a[i] - 1 - i - b);
            }

            if (ans3 >= ans && ans2 >= ans) {
                anss = ans;
                break;
            }
            if (ans2 < ans) {
                l = tmp;
            } else if (ans3 < ans) {
                r = tmp;
            }

            if (l >= r) {
                anss = Math.min(ans, Math.min(ans2, ans3));
            }
        }

        System.out.println(anss);

    }

}
