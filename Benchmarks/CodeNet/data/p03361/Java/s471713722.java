import java.util.Scanner;

public class Main {

    static int Y;
    static int X;
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
        Y = Integer.parseInt(HW[0]);
        X = Integer.parseInt(HW[1]);

        boolean isAllWhite = true;
        String[][] grid = new String[Y][X];
        for (int i = 0; i < Y; i++) {
            char[] row = sc.nextLine().toCharArray();
            for (int j = 0; j < X; j++) {
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

        for (int i = 0; i < Y; i++) {
            for (int j = 0; j < X; j++) {
                String point = grid[i][j];
                if (!point.equals("#")) {
                    continue;
                }
                if (!isMatch(grid, j, i)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isMatch(String[][] grid, int xi, int yi) {
        boolean isMatch = false;
        for (int[] row : NEIGHBOR_GRID) {
            int y = row[0] + yi;
            int x = row[1] + xi;

            // 枠外
            if (x < 0 || y < 0 || x >= X || y >= Y) {
                continue;
            }

            // 4方向を全探索して、1か所でも連続していれば条件に合う状態
            if (grid[y][x].equals("#")) {
                isMatch = true;
            }
        }
        return isMatch;
    }
}

