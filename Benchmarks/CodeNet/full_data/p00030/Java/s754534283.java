import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = Integer.parseInt(sc.next());
            int s = Integer.parseInt(sc.next());

            if (n == 0 && s == 0) break;

            System.out.println(dfs(0, n, 0, s, -1));
        }
    }

    private static int dfs(int depth, int maxDepth, int sum, int maxSum, int maxNum) {
        if (depth == maxDepth) return ((sum == maxSum)? 1 : 0);

        int ans = 0;
        int lim = Math.min(maxSum - sum, 9);

        for (int i = maxNum + 1; i <= lim; i++) {
            ans += dfs(depth + 1, maxDepth, sum + i, maxSum, i);
        }
        return ans;
    }
}