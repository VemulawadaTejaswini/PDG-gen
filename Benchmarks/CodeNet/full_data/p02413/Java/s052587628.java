import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r,c;
        r = input.nextInt();
        c = input.nextInt();
        int[][] grid = new int[r+1][c+1];
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                grid[i][j] = input.nextInt();
                grid[i][c] += grid[i][j];
                grid[r][j] += grid[i][j];
                grid[r][c] += grid[i][j];
            }
        }
        for (int i = 0; i < r+1; i++){
            for (int j = 0; j < c+1; j++){
                if (j == c){
                    System.out.println(grid[i][j]);
                } else {
                    System.out.printf("%d ",grid[i][j]);
                }
            }
        }
    }
}
