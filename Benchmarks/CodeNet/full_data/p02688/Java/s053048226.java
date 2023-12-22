import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i < k; i++) {
            int d = sc.nextInt();
            for (int j = 0; j < d; j++) {
                int m = sc.nextInt();
                arr[m]++;
            }
        }

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (arr[i] == 0) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
