import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static int MODULO = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();

        String[] grid = new String[H];

        for(int i=0; i<H; i++) {
            grid[i] = scanner.next();
        }

        int[][] memo = new int[H][W];

        for(int i=0; i<H; i++)
            Arrays.fill(memo[i], -1);

        System.out.println(findWays(0, 0, H, W, grid, memo));
    }

    private static int findWays(int rowIdx, int colIdx, int rowSize, int colSize, String[] grid, int[][] memo) {
        if(!isInRange(rowIdx, colIdx, rowSize, colSize)) {
            return 0;
        }

        if(rowIdx == rowSize - 1 && colIdx == colSize - 1) {
            return 1;
        }

        if(memo[rowIdx][colIdx] != -1) {
            return memo[rowIdx][colIdx];
        }


        int poss1 = (rowIdx + 1 < rowSize && grid[rowIdx+1].charAt(colIdx) == '.') ? findWays(rowIdx + 1, colIdx , rowSize, colSize, grid, memo) : 0;
        int poss2 = (colIdx + 1 < colSize && grid[rowIdx].charAt(colIdx+1) == '.') ? findWays(rowIdx , colIdx + 1 , rowSize, colSize, grid, memo) : 0;

        return memo[rowIdx][colIdx] = (poss1 + poss2) % MODULO;
    }

    private static boolean isInRange(int rowIdx, int colIdx, int rowSize, int colSize) {
        return (rowIdx >= 0 && rowIdx < rowSize && colIdx >= 0 && colIdx < colSize);
    }
}
