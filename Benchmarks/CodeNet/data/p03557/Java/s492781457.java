import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();

            int[][] ABC = new int[3][N];
            for (int i = 0; i < N; i++) {
                ABC[0][i] = in.nextInt();
            }
            for (int i = 0; i < N; i++) {
                ABC[1][i] = in.nextInt();
            }
            for (int i = 0; i < N; i++) {
                ABC[2][i] = in.nextInt();
            }
            Arrays.sort(ABC[0]);
            Arrays.sort(ABC[1]);
            Arrays.sort(ABC[2]);

            for (int i = 0; i < dp.length; i++) {
                Arrays.fill(dp[i], -1);
            }
            long count = dfs(0, -1, ABC);

            System.out.println(count);
        }
    }

    private static long[][] dp = new long[3][(int) (1e5 + 2)];

    private static long dfs(int i, int abi, int[][] a) {

        if (i == 2) {
            long count = 0;
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > a[i - 1][abi]) {
                    count++;
                }
            }
            return count;
        }
        if (i == 1) {

            if (dp[i][a[i - 1][abi]] != -1) {
                return dp[i][a[i - 1][abi]];
            }

            long count = 0;
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > a[i - 1][abi]) {
                    count += dfs(i + 1, j, a);
                }
            }
            dp[i][a[i - 1][abi]] = count;
            return count;
        }

        long count = 0;
        for (int j = 0; j < a[i].length; j++) {
            count += dfs(i + 1, j, a);
        }
        return count;
    }
}
