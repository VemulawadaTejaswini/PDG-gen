import java.util.Scanner;

public class Main {

    private static int h, w;
    private static int matrix[][];
    private static int doneX;
    private static int[] doneY;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ret = 0;

        h = Integer.valueOf(sc.next());
        w = Integer.valueOf(sc.next());
        matrix = new int[h][w];
        doneY = new int[w];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                matrix[i][j] = 2000;
            }
        }

        for (int i = 0; i < h; i++) {
            String s = sc.next();
            for (int j = 0; j < w; j++) {
                if (s.charAt(j) == '#') {
                    calc(j, i);
                    doneX = j;
                    doneY[j] = i;
                }
            }
            doneX = 0;
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                ret = Math.max(ret, matrix[i][j]);
            }
        }

//        dumpLog();
        System.out.println(ret);
    }

    private static void calc(int x, int y) {
        for (int i = 0; i < h; i++) {
            for (int j = doneX; j < w; j++) {
                if (i < doneY[j]) {
                    continue;
                }
                int tmp = Math.abs(x - j) + Math.abs(y - i);
                matrix[i][j] = Math.min(matrix[i][j], tmp);
            }
        }
    }

    private static void dumpLog() {
        for (int[] aMatrix : matrix) {
            for (int anAMatrix : aMatrix) {
                System.out.print(anAMatrix);
            }
            System.out.println();
        }
    }
}
