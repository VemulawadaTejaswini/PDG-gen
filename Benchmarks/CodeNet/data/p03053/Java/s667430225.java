import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    private static int H = 0;
    private static int W = 0;
    private static char[][] AHW;

    public static void main(String[] args) {
        Main main = new Main();

        Scanner sc = new Scanner(System.in);

        String[] HW = sc.nextLine().split(" ");
        H = Integer.parseInt(HW[0]);
        W = Integer.parseInt(HW[1]);

        AHW = new char[H][W];
        Queue<Cell> queue = new ArrayDeque<>();

        for (int i = 0; i < H; i++) {
            String A = sc.nextLine();
            AHW[i] = A.toCharArray();
            for (int j = 0; j < W; j++) {
                if (AHW[i][j] == '#') {
                    queue.add(main.new Cell(i, j, 0));
                }
            }
        }

        int times = 0;
        while (!queue.isEmpty()) {

            Cell cell = queue.poll();
            int row = cell.row;
            int col = cell.col;
            int layer = cell.layer;

            try {
                if (row > 0 && AHW[row - 1][col] == '.') {
                    // 上のセルが白だった場合
                    AHW[row - 1][col] = '#';
                    queue.add(main.new Cell(row - 1, col, layer + 1));
                }

                if (row < W - 1 && AHW[row + 1][col] == '.') {
                    // 下のセルが白だった場合
                    AHW[row + 1][col] = '#';
                    queue.add(main.new Cell(row + 1, col, layer + 1));
                }

                if (col > 0 && AHW[row][col - 1] == '.') {
                    // 左のセルが白だった場合
                    AHW[row][col - 1] = '#';
                    queue.add(main.new Cell(row, col - 1, layer + 1));
                }

                if (col < H - 1 && AHW[row][col + 1] == '.') {
                    // 右のセルが白だった場合
                    AHW[row][col + 1] = '#';
                    queue.add(main.new Cell(row, col + 1, layer + 1));
                }
            } catch (Exception e) {
                break;
            }
            times = layer;
        }

        System.out.println(times);
    }

    private class Cell {
        int row;
        int col;
        int layer;

        Cell(int row, int col, int layer) {
            this.row = row;
            this.col = col;
            this.layer = layer;
        }
    }
}
