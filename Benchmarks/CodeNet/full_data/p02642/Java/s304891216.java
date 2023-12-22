import java.util.*;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        final int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        final boolean[] dp = new boolean[N];
        for (int i = 0; i < N; i++) {
            dp[i] = true;
        }

        for (int i = 0; i < N; i++) {
            if (!dp[i]) continue;
            for (int j = 0; j < N; j++) {
                if (j != i && a[i] % a[j] == 0) dp[i] = false;
                if (j != i && a[j] % a[i] == 0) dp[j] = false;
            }
        }

        int ans = 0;
        
        for (int i = 0; i < N; i++) {
            if (dp[i]) ans++;
        }

        System.out.println(ans);
    }

}
