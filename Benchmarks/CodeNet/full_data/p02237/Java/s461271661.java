import java.util.Scanner;

public class Main {

    private static int f[] = new int[45];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            int row = scanner.nextInt();
            int neighborCount = scanner.nextInt();
            for (int j = 0; j < neighborCount; j++) {
                matrix[row - 1][scanner.nextInt() - 1] = 1;
            }
        }

        StringBuilder sb = new StringBuilder(n * 4);
        for (int i = 0; i < n; i++) {
            sb.append(matrix[i][0]);
            for (int j = 1; j < n; j++) {
                sb.append(" ");
                sb.append(matrix[i][j]);
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }

}

