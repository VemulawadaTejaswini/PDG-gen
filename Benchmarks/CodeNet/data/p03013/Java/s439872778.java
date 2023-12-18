import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        HashSet<Integer> bad = new HashSet<>();
        for (int i = 0; i < M; i++) {
            bad.add(scan.nextInt());
        }
        long[] dp = new long[N+1];
        dp[0] = 1;
        dp[1] = bad.contains(1) ? 0 : dp[0];
        if (bad.contains(2)) {
            dp[2] = 0;
        } else {
            dp[2] = dp[1]+dp[0];
        }
        for (int i = 3; i <= N; i++) {
            if (bad.contains(i)) {
                dp[i] = 0;
                continue;
            }
            dp[i] = dp[i - 2] + dp[i - 1];
            dp[i] = dp[i] % 1000000007;
        }
        long answer = dp[N];
        System.out.println(answer);
    }
}
