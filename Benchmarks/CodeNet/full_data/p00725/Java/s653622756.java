import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int sx = 0, sy = 0;
            int w = sc.nextInt();
            int h = sc.nextInt();
            if (w == 0 && h == 0) break;
            int[][] board = new int[w][h];//x座標,y座標の順番
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    board[j][i] = sc.nextInt();
                    if (board[j][i] == 2) {
                        sx = j;
                        sy = i;
                        board[j][i] = 0;
                    }
                }
            }
            System.out.println(solve(w, h, board, sx, sy));
        }
    }

    public static int solve(int w, int h, int[][] board, int sx, int sy) {
        Queue<int[][]> que_board = new ArrayDeque<>();
        Queue<int[]> que_info = new ArrayDeque<int[]>();
        int[] info = {0, sx, sy};
        que_board.add(board);
        que_info.add(info);
        int[][] move = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while (!que_board.isEmpty()) {
            int[][] b_board = que_board.remove();
            int[] b_info = que_info.remove();
            if (b_info[0] > 10) break;
            for (int[] dir : move) {
                int[][] a_board = new int[w][h];
                for (int i = 0; i < w; i++) {
                    for (int j = 0; j < h; j++) {
                        a_board[i][j] = b_board[i][j] + 0;
                    }
                }
                int[] a_info = b_info.clone();

                if (0 <= a_info[1] + dir[0] && a_info[1] + dir[0] < w
                        && 0 <= a_info[2] + dir[1] && a_info[2] + dir[1] < h) {
                    if (a_board[a_info[1] + dir[0]][a_info[2] + dir[1]] != 1) {
                        while (true) {
                            if (0 <= a_info[1] + dir[0] && a_info[1] + dir[0] < w
                                    && 0 <= a_info[2] + dir[1] && a_info[2] + dir[1] < h) {
                                if (a_board[a_info[1] + dir[0]][a_info[2] + dir[1]] == 0) {
                                    a_info[1] += dir[0];
                                    a_info[2] += dir[1];
                                } else if (a_board[a_info[1] + dir[0]][a_info[2] + dir[1]] == 1) {
                                    a_board[a_info[1] + dir[0]][a_info[2] + dir[1]] = 0;
                                    a_info[0] += 1;
                                    que_board.add(a_board);
                                    que_info.add(a_info);
                                    break;
                                } else if (a_board[a_info[1] + dir[0]][a_info[2] + dir[1]] == 3) {
                                    return a_info[0] + 1;
                                }
                            } else break;
                        }
                    }
                }
            }
        }
        return -1;
    }
}

