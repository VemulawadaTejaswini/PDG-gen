import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] lis = new int[n];

        for (int i = 0; i < n; ++i) {
            lis[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 1; i < n - 1; ++i) {
            // System.out.println(String.format("%d -- %d %d %d", i, lis[i - 1], lis[i], lis[i + 1]));
            if ((lis[i - 1] < lis[i] && lis[i] < lis[i + 1]) ||
                (lis[i - 1] > lis[i] && lis[i] > lis[i + 1])) {
                ans += 1;
            }
        }

        System.out.println(ans);
    }
}

