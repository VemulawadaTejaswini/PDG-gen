import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] dp = new int[N];
        for (int i = 0; i < N; i++) {
            dp[i] = scan.nextInt();
        }
        for (int t = 0; t < K; t++) {
            int[] diff = new int[N];
            for (int i = 0; i < N; i++) {
                diff[Math.max(0, i - dp[i])] += 1;
                if (i + dp[i] + 1< N) {
                    diff[i + dp[i] + 1] += -1;
                }
            }
            int[] next_dp = new int[N];
            next_dp[0] = diff[0];
            boolean found = false;
            for (int i = 1; i < N; i++) {
                next_dp[i] = next_dp[i-1] + diff[i];
                if (next_dp[i] < N) {
                    found = true;
                }
            }
            dp = next_dp;
            if (!found) {
                break;
            }
        }
        System.out.println(Arrays.stream(dp).mapToObj(i -> Integer.toString(i)).collect(Collectors.joining(" ")));
    }
}
