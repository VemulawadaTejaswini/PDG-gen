import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ret = 0;

        int h = Integer.valueOf(sc.next());
        int w = Integer.valueOf(sc.next());

        boolean matrix[][] = new boolean[h][w];

        for (int i = 0; i < h; i++) {
            String s = sc.next();
            for (int j = 0; j < w; j++) {
                matrix[i][j] = s.charAt(j) == '#';
            }
        }

        boolean[][] tmp = new boolean[h][w];
        while (!isCompleted(matrix)) {
            darker(h, w, matrix, tmp);
            ret++;
        }

        System.out.println(ret);
    }

    private static boolean isCompleted(boolean[][] matrix) {
        for (boolean[] aMatrix : matrix) {
            for (boolean anAMatrix : aMatrix) {
                if (!anAMatrix) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void darker(int h, int w, boolean[][] matrix, boolean[][] tmp) {

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (matrix[i][j]) {
                    tmp[i][j] = true;
                    if (i - 1 >= 0) {
                        tmp[i - 1][j] = true;
                    }
                    if (i + 1 < h) {
                        tmp[i + 1][j] = true;
                    }
                    if (j - 1 >= 0) {
                        tmp[i][j - 1] = true;
                    }
                    if (j + 1 < w) {
                        tmp[i][j + 1] = true;
                    }
                }
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                matrix[i][j] = tmp[i][j];
                tmp[i][j] = false;
            }
        }
    }

    private static void dumpLog(boolean[][] matrix) {
        for (boolean[] aMatrix : matrix) {
            for (boolean anAMatrix : aMatrix) {
                System.out.print(anAMatrix ? 'o' : 'x');
            }
            System.out.println();
        }
    }
}
