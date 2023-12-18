import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] set = new int[N];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            set[i] = sc.nextInt();
            min = Math.min(min, set[i]);
        }

        boolean[] dp = new boolean[K + 1];
        for (int i = min; i <= K; i++) {
            for (int j = 0; j < N; j++) {
                if (i - set[j] >= 0 && !dp[i - set[j]]) {
                    dp[i] = true;
                }
                if (dp[i]) break;
            }
        }

        if (dp[K]) {
            System.out.println("First");
        } else {
            System.out.println("Second");
        }


    }
}
