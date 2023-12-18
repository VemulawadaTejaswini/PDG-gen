import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        String matrix[] = new String[rows];
        for (int i = 0; i < rows; i++) {
            matrix[i] = scanner.next();

        }

        System.out.println(getPath(matrix));

    }

    public static long getPath(String matrix[]) {
        long ans[][] = new long[matrix.length][matrix[0].length()];
        ans[matrix.length - 1][matrix[0].length() - 1] = 1;
        for (int j = matrix[0].length() - 1; j >= 0; j--) {
            for (int i = matrix.length - 1; i >= 0; i--) {
                if (i == matrix.length - 1 && j == matrix[0].length() - 1) {
                    continue;
                }
                if (matrix[i].charAt(j) == '#') {
                    ans[i][j] = 0;
                    continue;
                }
                if (i + 1 < matrix.length) {

                    ans[i][j] += (ans[i + 1][j] % 1000000007);
                }
                if (j + 1 < matrix[0].length()) {
                    ans[i][j] += (ans[i][j + 1] % 1000000007);
                }

            }

        }

        return ans[0][0] % 1000000007;
    }

}