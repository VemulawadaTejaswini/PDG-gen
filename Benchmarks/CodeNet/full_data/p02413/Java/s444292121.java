import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    private void solv() {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int c = input.nextInt();
        int[][] matrix = new int[r+1][c+1];
        for (int i = 0; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++) {
                matrix[i][j] = input.nextInt();
                sum += matrix[i][j];
            }
            matrix[i][c] = sum;
        }
        for (int i = 0; i < c + 1; i++) {
            int sum = 0;
            for (int j = 0; j < r; j++) {
                sum += matrix[j][i];
            }
            matrix[r][i] = sum;
        }
        for (int i = 0; i < r + 1; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < c + 1; j++) {
                sb.append(matrix[i][j]).append(' ');
            }
            System.out.println(sb.toString().trim());
        }
    }
}