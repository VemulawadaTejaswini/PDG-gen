import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(); // Rows of the 1st matrix
        int b = input.nextInt(); // Columns of 1st Matrix and Rows of 2 Matrix
        int c = input.nextInt(); // Columns of 2nd matrix

        int[][] A = new int[a][b];
        int[][] B = new int[b][c];

        // Build matrix A
        for(int row = 0; row < a; row++){
            for(int col = 0; col < b; col++){
                A[row][col] = input.nextInt();
            }
        }

        // Build martix B
        for(int row = 0; row < b; row++){
            for(int col = 0; col < c; col++){
                B[row][col] = input.nextInt();
            }
        }

        // Multiple out
        int[][] result = new int[a][c];

        for(int row = 0; row < a; row++){
            for(int col = 0; col < c; col++){
                int temp = sum(A[row], B, col);
                result[row][col] = temp;
            }
        }
        showSheet(result); // Display the result
    }

    // Helper function that computes the value of a cell in the result matrix
    // Takes an (a x 1) vector that is a row of A and then the entire B matrix, and a colIndex that indicates where to index B
    private static int sum(int[] row, int[][] matrix, int colIndex){
        int total = 0;
        for(int i = 0; i < row.length; i++){
            total += row[i]*matrix[i][colIndex];
        }
        return total;
    }

    // Helper function that displays a 2D int array
    private static void showSheet(int[][] result){
        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[0].length; j++){
                System.out.print(result[i][j]);
                if( j < result[0].length - 1) System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
