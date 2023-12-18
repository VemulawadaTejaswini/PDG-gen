
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int h = scanner.nextInt();
        final int w = scanner.nextInt();

        final boolean[][] table = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            final String s = scanner.next();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '.') {
                    table[i][j] = true;
                }
            }
        }

        final int answer = dfs(0, 0, h, w, table, table[0][0] ? 0 : 1);
        System.out.println(answer);
    }

    private static int dfs(final int i, final int j, final int h, final int w, final boolean[][] table, final int count) {
        if (i == h - 1 && j == w - 1) {
            return count;
        }

        final boolean isWhite = table[i][j];
        int min = Integer.MAX_VALUE;
        if (i < h - 1) {
            if (table[i + 1][j] || !isWhite && !table[i + 1][j]) {
                min = Math.min(min, dfs(i + 1, j, h, w, table, count));
            } else {
                min = Math.min(min, dfs(i + 1, j, h, w, table, count + 1));
            }
        }

        if (j < w - 1) {
            if (table[i][j + 1] || !isWhite && !table[i][j + 1]) {
                min = Math.min(min, dfs(i, j + 1, h, w, table, count));
            } else {
                min = Math.min(min, dfs(i, j + 1, h, w, table, count + 1));
            }
        }
        return min;
    }
}
