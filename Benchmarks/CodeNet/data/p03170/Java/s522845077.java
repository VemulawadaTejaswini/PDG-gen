import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        boolean[] dp = new boolean[K + 1];
        Arrays.fill(dp, false);
        for (int stones = 0; stones <= K; stones++) { // stones
            for (int num : A) {
                if (stones >= num && !dp[stones - num]) {
                    dp[stones] = true;
                }
            }
        }

        if (dp[K] == true) {
            System.out.println("First");
        } else {
            System.out.println("Second");
        }
    }

}