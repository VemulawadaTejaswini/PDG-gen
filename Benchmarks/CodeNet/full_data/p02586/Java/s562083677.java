

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String[] line = in.nextLine().split(" ");
        final int r = Integer.parseInt(line[0]);
        final int c = Integer.parseInt(line[1]);
        final int k = Integer.parseInt(line[2]);
        final int[][] matrix = new int[r][c];
        for (int i = 0; i < k; i++) {
            line = in.nextLine().split(" ");
            final int row = Integer.parseInt(line[0]);
            final int col = Integer.parseInt(line[1]);
            final int v = Integer.parseInt(line[2]);
            matrix[row - 1][col - 1] = v;
        }
        System.out.println(dfs(matrix, 0, 0, 3, new long[r][c][4]));
    }

    private static long dfs(int[][] matrix, int r, int c, int pickedOnRow, long[][][] dp) {
        if (r == matrix.length - 1 && c == matrix[0].length - 1) {
            return pickedOnRow > 0 ? matrix[r][c] : 0;
        }
        if (dp[r][c][pickedOnRow] > 0) {
            return dp[r][c][pickedOnRow];
        }
        long res = 0;
        if (matrix[r][c] > 0 && pickedOnRow > 0) {
            if (c < matrix[0].length - 1) {
                res = Math.max(res, matrix[r][c] + dfs(matrix, r, c + 1, pickedOnRow - 1, dp));
            }
            if (r < matrix.length - 1) {
                res = Math.max(res, matrix[r][c] + dfs(matrix, r + 1, c, 3, dp));
            }
        }
        if (c < matrix[0].length - 1) {
            res = Math.max(res, dfs(matrix, r, c + 1, pickedOnRow, dp));
        }
        if (r < matrix.length - 1) {
            res = Math.max(res, dfs(matrix, r + 1, c, 3, dp));
        }
        return dp[r][c][pickedOnRow] = res;
    }
}
