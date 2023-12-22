import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt(); // rows
        int cols = input.nextInt(); // cols
        int[][] house = new int[12][10];
        int[][] a = new int[rows][cols];
        int[] b = new int[cols];
        // Build matrix A
        for(int row = 0; row < rows; row++){
            for(int col = 0; col < cols; col++){
                a[row][col] = input.nextInt();
            }
        }

        // Build vector B
        for(int col = 0; col < cols; col++){
            b[col] = input.nextInt();
        }

        // Multiple out
        int[] result = new int[rows];

        for(int row = 0; row < rows; row++){
            for(int col = 0; col < cols; col++){
                int temp =  a[row][col] * b[col];
                result[row] += a[row][col] * b[col];
            }
        }

        // Display result
        for(int i : result){
            System.out.println(i);
        }
    }
}
