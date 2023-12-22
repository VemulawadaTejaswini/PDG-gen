import java.util.Scanner;

public class Main {
    private static char[][] chars;  // using to store inputs
    private static int n, row, col;    // the output
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char symbol;
        while (true) {
            row = input.nextInt();
            col = input.nextInt();
            if (row == 0 && col == 0) {
                return;
            }
            chars = new char[row][col];
            for (int i = 0; i < row; i++) {
                String str = input.next();
                for (int j = 0; j < col; j++) {
                    chars[i][j] = str.charAt(j);
                }
            }
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    symbol = chars[i][j];
                    if (symbol == '@' || symbol == '#' || symbol == '*') {
                        dfs(i, j, symbol);
                        n++;
                    }
                }
            }
            System.out.println(n);
            n = 0;
        }
    }
    private static void dfs(int x, int y, char symbol) {
        chars[x][y] = '.';
        int dx, dy;
        int[] x_mov = {-1, 0, 0, 1}, y_mov = {0, -1, 1, 0};
        for (int i = 0; i < x_mov.length; i++) {
            dx = x + x_mov[i]; dy = y + y_mov[i];
            if (0 <= dx && dx < row && 0 <= dy && dy < col &&
                    chars[dx][dy] == symbol) {
                dfs(dx, dy, symbol);
            }
        }
    }
}