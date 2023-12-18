import java.util.*;

public class Main {
    private static int solve(int H, int W, char[][] grid) {
        int[][] paths = new int[H][W];
        paths[0][0] = 1;

        for (int d = 1; d < H + W - 1; d++)
            for (int r = Math.min(d, H-1), c = d-r; r >= 0 && c < W; r--, c++) {
                if (grid[r][c] == '#') continue;

                paths[r][c] = ((r > 0 ? paths[r - 1][c] : 0) + (c > 0 ? paths[r][c - 1] : 0)) % 1000000007;
            }

        return paths[H-1][W-1];
    }

    public static int run(Scanner scanner) {
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        char[][] grid = new char[H][W];
        for (int r=0; r < H; r++) {
            String line = scanner.next();
            for (int c = 0; c < W; c++) grid[r][c] = line.charAt(c);
        }

        return solve(H, W, grid);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(run(scanner));
        }
        //Tests.run();
    }
}