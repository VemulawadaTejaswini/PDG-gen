import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,m,l;
        n = input.nextInt();
        m = input.nextInt();
        l = input.nextInt();
        int[][] A = new int[n][m];
        int[][] B = new int[m][l];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                A[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < m; i++){
            for (int j = 0; j < l; j++){
                B[i][j] = input.nextInt();
            }
        }
        long[][] grid = new long[n][l];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < l; j++){
                for (int k = 0; k < m; k++){
                    grid[i][j] += A[i][k]*B[k][j];
                }
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < l; j++){
                if (j == l-1){
                    System.out.println(grid[i][j]);
                } else {
                    System.out.printf("%d ",grid[i][j]);
                }
            }
        }
    }
}
