import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        scanner.nextLine();
        final int[] a = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[][] matrix = new int[a.length][a.length + 1];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == (i + a.length + 1) % a.length) matrix[i][j] = 1;
                if (j == i % a.length) matrix[i][j] = 1;
                if (j == a.length) matrix[i][j] = a[i];
            }
        }

//        System.out.println(Arrays.deepToString(matrix));
        for (int pivot = 0; pivot < a.length; pivot++) {
            for (int i = pivot; i < a.length; i++) {
                if (matrix[i][pivot] != 0) {
                    swapRow(matrix, i, pivot);
                    multiplyRow(matrix, i, matrix[i][i]);
                    break;
                }
            }
//            System.out.println(Arrays.deepToString(matrix));

            for (int i = 0; i < a.length; i++) {
                if (matrix[i][pivot] != 0 && i != pivot) {
                    subtractRow(matrix, i, pivot, matrix[i][pivot]);
                }
            }
//            System.out.println(Arrays.deepToString(matrix));
//            System.out.println("-----");
        }

        for (int i = 0; i < a.length; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(matrix[i][a.length] * 2);
        }
        System.out.println();
    }

    private static void swapRow(int[][] m, int i, int j) {
        int[] sw = m[i];
        m[i] = m[j];
        m[j] = sw;
    }

    private static void subtractRow(int[][] m, int i, int j, int multiplier) {
        for (int k = 0; k < m[i].length; k++) {
            m[i][k] -= m[j][k] * multiplier;
        }
    }

    private static void multiplyRow(int[][] m, int i, int multiplier) {
        for (int k = 0; k < m[i].length; k++) {
            m[i][k] /= multiplier;
        }
    }
}