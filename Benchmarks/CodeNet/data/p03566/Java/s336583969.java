import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.nextLine());
        int[] ts = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 1; i < N; i++) {
            ts[i] += ts[i - 1];
        }
        int[] vs = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] dp = new int[201];
        int curr = 0;
        for (int i = 1; i < 201; i++) {
            if (i >= ts[N - 1] && dp[i - 1] == 0) {
                break;
            }
            int vNext = curr == N - 1 ? 0 : vs[curr + 1];
            if (dp[i - 1] - vNext == ts[curr] - i + 1) {
                dp[i] =  dp[i - 1] - 1;
            } else if (vs[curr] > dp[i - 1]) {
                dp[i] =  dp[i - 1] + 1;
            } else if (vs[curr] == dp[i - 1]) {
                dp[i] =  dp[i - 1];
            }
            // System.out.printf("%d %d \n", i, dp[i]);
            if (curr != N - 1 && ts[curr] == i) {
                curr++;
            }
        }
        System.out.println(Arrays.stream(dp).sum());
    }

}