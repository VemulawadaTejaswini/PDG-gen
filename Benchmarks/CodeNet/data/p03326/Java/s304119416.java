import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = scanner.nextInt(), M = scanner.nextInt();
        scanner.nextLine();
        long[] nums = new long[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(Long::parseLong).sum();
        }
        memo = new long[N + 1][M + 1];
        long ans = dfs(nums, 0, M);
        System.out.println(ans);
    }

    static long[][] memo;
    static long dfs(long[] nums, int curr, int remaining) {
        if (curr == nums.length && remaining > 0) {
            return Long.MIN_VALUE;
        }
        if (remaining == 0) {
            return 0;
        }
        if (memo[curr][remaining] > 0) {
            return memo[curr][remaining];
        }
        long ans = Long.MIN_VALUE;
        ans = Math.max(ans, dfs(nums, curr + 1, remaining));
        ans = Math.max(ans, Math.abs(nums[curr]) + dfs(nums, curr + 1, remaining - 1));
        memo[curr][remaining] = ans;
        return ans;
    }

}