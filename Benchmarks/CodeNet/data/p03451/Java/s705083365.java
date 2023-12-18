import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[][] A = new int[2][N];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < N; j++) {
                    A[i][j] = in.nextInt();
                }
            }

            int[][] cumsum = new int[2][N];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < N; j++) {
                    cumsum[i][j] = A[i][j] + (j - 1 >= 0 ? cumsum[i][j - 1] : 0);
                }
            }

            int max = 0;
            for (int j = 0; j < N; j++) {
                int row0 = cumsum[0][j];
                int row1 = cumsum[1][N - 1] - (j - 1 >= 0 ? cumsum[1][j - 1] : 0);
                max = Math.max(max, row0 + row1);
            }
            System.out.println(max);
        }
    }
}
