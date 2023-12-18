import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();

        int[][] matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = 0;
            }
        }

        int markedRow = sc.nextInt();
        int markedColumn = sc.nextInt();

        // 行をマークする
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < markedRow; j++) {
                matrix[j][i] = 1;
            }
        }

        // 列をマークする
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < markedColumn; j++) {
                matrix[i][j] = 1;
            }
        }

        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] == 0) count++;
            }
        }

        System.out.println(count);
    }
}
