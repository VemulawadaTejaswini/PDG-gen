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
            System.out.println(s);
            for (int j = 0; j < w; j++) {
                matrix[i][j] = s.charAt(j) == '#';
            }
        }

        while (!isCompleted(matrix)) {
            matrix = darker(h, w, matrix);
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

    private static boolean[][] darker(int h, int w, boolean[][] matrix) {
        boolean[][] ret = new boolean[h][w];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (matrix[i][j]) {
                    ret[i][j] = true;
                    if (i - 1 >= 0) {
                        ret[i - 1][j] = true;
                    }
                    if (i + 1 < h) {
                        ret[i + 1][j] = true;
                    }
                    if (j - 1 >= 0) {
                        ret[i][j - 1] = true;
                    }
                    if (j + 1 < w) {
                        ret[i][j + 1] = true;
                    }
                }
            }
        }

        return ret;
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
