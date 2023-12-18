import java.util.*;

public class Main {
        public static void main(String[] args) {
            int[][] grid = new int[3][3];
            Scanner sc = new Scanner(System.in);
            for(int row = 0; row < 3; row++) {
                for(int col = 0; col < 3; col++) {
                    grid[row][col] = sc.nextInt();
                }
            }
            int aDiff1 = grid[0][0] - grid[0][1];
            int aDiff2 = grid[0][1] - grid[0][2];
            int bDiff1 = grid[0][0] - grid[1][0];
            int bDiff2 = grid[1][0] - grid[2][0];
            if((grid[1][0] - aDiff1 != grid[1][1]) || (grid[1][1] - aDiff2 != grid[1][2]) || (grid[2][0] - aDiff1 != grid[2][1]) || (grid[2][1] - aDiff2 != grid[2][2]) ||
                            (grid[0][1] - bDiff1 != grid[1][1]) || (grid[1][1] - bDiff2 != grid[2][1]) || (grid[0][2] - bDiff1 != grid[1][2]) || (grid[1][2] - bDiff2 != grid[2][2])) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
}
