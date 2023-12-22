import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int[][] x = new int[a[0]][a[1]];
        int[][] y = new int[a[1]][a[2]];
        long[][] z = new long[a[0]][a[2]];
        for (int i = 0; i < a[0]; i++) {
            for (int j = 0; j < a[1]; j++) {
                x[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < a[1]; i++) {
            for (int j = 0; j < a[2]; j++) {
                y[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < a[0]; i++) {
            for (int j = 0; j < a[2]; j++) {
                long sum = 0;
                for (int k = 0; k < a[1]; k++) {
                    sum += x[i][k] * y[k][j];
                }
                z[i][j] = sum;
            }
        }
        print2DArray(z);
    }

    private static void print2DArray(long[][] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sb.append(array[i][j]);
                if (j != array[i].length - 1) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}