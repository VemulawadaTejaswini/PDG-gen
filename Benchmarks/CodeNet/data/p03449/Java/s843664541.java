import java.util.*;

public class Main {
    static int MAX_COUNT = 0;
    static int[][] grid;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[2][n];
        for(int row = 0; row < 2; row++) {
            for(int col = 0; col < n; col++) {
                grid[row][col] = sc.nextInt();
            }
        }
        count(0, 0, 0);
        System.out.println(MAX_COUNT);
    }

    public static void count(int currentCount, int row, int col) {
        if(row >= 2 || col >= n) return;
        if(row == 1 && col == n-1) {
            MAX_COUNT = Math.max(currentCount + grid[row][col], MAX_COUNT);
            return;
        }
        count(currentCount + grid[row][col], row+1, col);
        count(currentCount + grid[row][col], row, col+1);
        return;
    }
}