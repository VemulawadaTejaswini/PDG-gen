import javax.swing.text.MutableAttributeSet;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        int[] cost = new int[n];
        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j <= k; j++) {
                if (i - j < 0) continue;
                min = Math.min(cost[i-j] + Math.abs(h[i-j] - h[i]) , min);
            }
            cost[i] = min;
        }

        System.out.println(cost[n-1]);

    }
}
