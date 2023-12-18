import java.util.Scanner;

public class Main {

    static int H;
    static int W;
    static boolean CAN_PAINT = true;
    // @formatter:off
    static int[][] NEIGHBOR_GRID =
        {             {  0, -1 },
          { -1,  0 },              {  1,  0 },
                      {  0,  1 },};
    // @formatter:on
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] HW = sc.nextLine().split(" ");
        H = Integer.parseInt(HW[0]);
        W = Integer.parseInt(HW[1]);

        boolean isAllWhite = true;
        String[][] grid = new String[H][W];
        for (int i = 0; i < H; i++) {
            char[] row = sc.nextLine().toCharArray();
            for (int j = 0; j < W; j++) {
                grid[i][j] = String.valueOf(row[j]);
                if (grid[i][j].equals("#")) {
                    isAllWhite = false;
                }
            }
        }

        if (isAllWhite) {
            System.out.println("No");
        } else {
            System.out.println(canPaint(grid) ? "Yes" : "No");
        }

    }

    private static boolean canPaint(String[][] grid) {

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                String point = grid[i][j];
                if (!point.equals("#")) {
                    continue;
                }
                if (!isMatch(grid, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isMatch(String[][] grid, int i, int j) {
        boolean isMatch = false;
        for (int[] row : NEIGHBOR_GRID) {
            int x = row[0] + i;
            int y = row[1] + j;

            // 枠外
            if (x < 0 || y < 0 || x >= H || y >= W) {
                continue;
            }

            // 4方向を全探索して、1か所でも連続していれば条件に合う状態
            if (grid[x][y].equals("#")) {
                isMatch = true;
            }
        }
        return isMatch;
    }
}

