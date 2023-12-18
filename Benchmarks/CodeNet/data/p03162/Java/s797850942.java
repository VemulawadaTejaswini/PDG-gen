import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    private static int getInt() {
        try {
            return Integer.parseInt(READER.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int[] getIntArr(int n) {
        int[] ans = new int[n];

        StringTokenizer stringTokenizer = null;
        try {
            stringTokenizer = new StringTokenizer(READER.readLine(), " ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < n && stringTokenizer.hasMoreTokens(); i++) {
            ans[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        return ans;
    }

    private static int solve() {
        int n = getInt();
        int[][] matrix = new int[n][3];
        for (int i = 0; i < n; i++) {
            matrix[i] = getIntArr(3);
        }
        return solveInternal(n, matrix);
    }

    private static int solveInternal(int n, int[][] matrix) {
        int[][] dp = new int[n][3];
        dp[0] = matrix[0].clone();

        for (int i = 1; i < n; i++) {
            dp[i][0] = matrix[i][0] + Math.max(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = matrix[i][1] + Math.max(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = matrix[i][2] + Math.max(dp[i - 1][0], dp[i - 1][1]);
        }

        return IntStream.of(dp[n - 1]).max().getAsInt();
    }

    public static void main(String... args) {
        System.out.println(solve());
//        System.out.println(
//                solveInternal(7, new int[][]{{6, 7, 8},
//                        {8, 8, 3},
//                        {2, 5, 2},
//                        {7, 8, 6},
//                        {4, 6, 8},
//                        {2, 3, 4},
//                        {7, 5, 1}}));
    }
}