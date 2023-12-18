import java.util.*;
import java.awt.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int tmp_sum = 0;
        int point = 0;
        while (tmp_sum < k) {
            if (point >= n) break;
            tmp_sum += a[point];
            point++;
        }

        int ans = 0;
        if (tmp_sum <= k) {
            System.out.println(n);
        } else {
            while (tmp_sum >= k) {
                if (ans >= n) break;
                tmp_sum -= a[ans];
                ans++;
            }

            System.out.println(ans-1);
        }
    }
}
