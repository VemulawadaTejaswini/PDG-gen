import java.util.*;
import java.util.function.ToDoubleFunction;


public class Main {
    private static final String ex = "3 5\n" +
            "5\n" +
            "1 2 3 6 3";
//    private static final String ex = "2 2\n" +
//            "3\n" +
//            "2 1 1";

    public static void main(String[] args) {
        solve(new Scanner(System.in));
//        solve(new Scanner(ex));
    }

    private static void solve(Scanner scanner) {
        String[] split = scanner.nextLine().split(" ");
        int H = Integer.parseInt(split[0]);
        int W = Integer.parseInt(split[1]);
        int N = Integer.parseInt(scanner.nextLine());
        int[] a = new int[N];
        split = scanner.nextLine().split(" ");
        for (int i = 0; i < N; i ++) {
            a[i] = Integer.parseInt(split[i]);
        }

        int[][] matrix = new int[H][W];
        int row = 0;
        int col = 0;
        int add = 1;
        for (int i = 0; i < N; i ++) {
            for (int  j = 0; j < a[i]; j ++) {
                matrix[row][col] = i + 1;

                col += add;

                if (col == W) {
                    row ++;
                    add = -1;
                    col += add;
                } else if (col == -1) {
                    row ++;
                    add = 1;
                    col += add;
                }
            }
        }

        for (int i = 0; i < H; i ++) {
            for (int j = 0; j < W; j ++) {
                System.out.print(matrix[i][j]);
                if (j == W - 1) System.out.println();
                else System.out.print(" ");
            }
        }
    }
}
