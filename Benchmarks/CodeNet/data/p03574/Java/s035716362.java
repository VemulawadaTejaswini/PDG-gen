import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AtCoder solver = new AtCoder();
        solver.solve(1, in, out);
        out.close();
    }

    static class AtCoder {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int dx[] = {1, 1, 0, -1, -1, -1, 0, 1};
            int dy[] = {0, 1, 1, 1, 0, -1, -1, -1};
            char[][] board = new char[50][50];

            int X = in.nextInt();
            int Y = in.nextInt();

            String s = in.nextLine();

            for (int i = 0; i < X; i++) {
                s = in.nextLine();
                for (int j = 0; j < Y; j++) {
                    board[i][j] = s.charAt(j);
                }
            }

            for (int i = 0; i < X; i++) {
                for (int j = 0; j < Y; j++) {
                    if (board[i][j] == '.') {
                        int cnt = 0;
                        for (int k = 0; k < 8; k++) {
                            int x = i + dx[k];
                            int y = j + dy[k];
                            if (x >= 0 && x < X && y >= 0 && y < Y && board[x][y] == '#') cnt++;
                        }
                        board[i][j] = (char) ('0' + cnt);
                    }
                }
            }

            for (int i = 0; i < X; i++) {
                for (int j = 0; j < Y; j++) {
                    out.print(board[i][j]);
                }
                out.println();
            }
        }
    }
}
