import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean[][] board = new boolean[8][8];
        boolean[] rowFilled = new boolean[8];
        boolean[] colFilled = new boolean[8];
        for (int i = 0; i < n; i++) {
            int r = in.nextInt();
            int c = in.nextInt();
            board[r][c] = true;
            rowFilled[r] = true;
            colFilled[c] = true;
        }
        in.close();
        Solution s = solve(board, 0, rowFilled, colFilled);
        System.out.print(printBoard(s.board));
    }

    private static String printBoard(boolean[][] board) {
        StringBuilder sb = new StringBuilder();
        for (boolean[] r : board) {
            for (boolean c : r) {
                if (c) {
                    sb.append("Q");
                } else {
                    sb.append(".");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    static class Solution {
        boolean[][] board;
        boolean valid;

        public Solution(boolean[][] board, boolean valid) {
            this.board = board;
            this.valid = valid;
        }
    }

    /**
     * @return true if no diagonal conflicts
     */
    private static boolean checkDiagonals(boolean[][] board, int row, int col) {
        // Up left
        int rowTemp = row;
        int colTemp = col;
        while (rowTemp > 0 && colTemp > 0) {
            rowTemp--;
            colTemp--;
            if (board[rowTemp][colTemp]) {
                return false;
            }
        }
        // Up right
        rowTemp = row;
        colTemp = col;
        while (rowTemp > 0 && colTemp < 7) {
            rowTemp--;
            colTemp++;
            if (board[rowTemp][colTemp]) {
                return false;
            }
        }
        // Down left
        rowTemp = row;
        colTemp = col;
        while (rowTemp < 7 && colTemp > 0) {
            rowTemp++;
            colTemp--;
            if (board[rowTemp][colTemp]) {
                return false;
            }
        }
        // Down right
        rowTemp = row;
        colTemp = col;
        while (rowTemp < 7 && colTemp < 7) {
            rowTemp++;
            colTemp++;
            if (board[rowTemp][colTemp]) {
                return false;
            }
        }

        return true;
    }

    private static Solution solve(boolean[][] board, int row, boolean[] rowFilled, boolean[] colFilled) {
        if (row > 7) {
            return new Solution(board, true);
        }

        if (rowFilled[row]) {
            return solve(board, row+1, rowFilled, colFilled);
        } else {
            ArrayList<Integer> validCols = new ArrayList<>();
            for (int c = 0; c < 8; c++) {
                if (!colFilled[c] && checkDiagonals(board, row, c)) {
                    validCols.add(c);
                }
            }

            if (!validCols.isEmpty()) {
                for (int c : validCols) {
                    boolean[][] newBoard = new boolean[8][8];
                    for(int r = 0; r < 8; r++) {
                        boolean[] newRow = board[r];
                        newBoard[r] = Arrays.copyOf(newRow, 8);
                    }
                    boolean[] newRowFilled = Arrays.copyOf(rowFilled, 8);
                    boolean[] newColFilled = Arrays.copyOf(colFilled, 8);
                    newBoard[row][c] = true;
                    newRowFilled[row] = true;
                    newColFilled[c] = true;
                    Solution s = solve(newBoard, row + 1, newRowFilled, newColFilled);
                    if (s.valid) {
                        return s;
                    }
                }
            }
            return new Solution(board, false);
        }
    }
}

