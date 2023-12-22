import java.util.Scanner;

/**
 * Pond
 */
public class Main {

    int d;
    int h;
    int[][] depth;
    int max = 0;

    public void scan() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            d = sc.nextInt();
            h = sc.nextInt();
            if (d == 0 && h == 0) {
                return;
            }
            max = 0;
            depth = new int[d][h];
            for (int i = 0; i < d; i++) {
                for (int j = 0; j < h; j++) {
                    depth[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < d; i++) {
                for (int j = 0; j < h; j++) {
                    for (int k = i; k < d; k++) {
                        for (int n = j; n < h; n++) {
                            calc(i, j, k, n);
                        }
                    }
                }
            }
            System.out.println(max);
        }
    }

    public void calc(int x0, int y0, int x1, int y1) {
        int borderMinHeight = -1;
        int innerMaxHeight = -1;
        for (int i = x0; i <= x1; i++) {
            for (int j = y0; j <= y1; j++) {
                if (i == x0 || i == x1 || j == y0 || j == y1) {
                    if (borderMinHeight == -1 || borderMinHeight > depth[i][j]) {
                        borderMinHeight = depth[i][j];
                    }
                } else {
                    if (innerMaxHeight == -1 || innerMaxHeight < depth[i][j]) {
                        innerMaxHeight = depth[i][j];
                    }
                }
            }
        }
        if (borderMinHeight <= innerMaxHeight) {
            return;
        } else {
            int sum = 0;
            for (int i = x0 + 1; i < x1; i++) {
                for (int j = y0 + 1; j < y1; j++) {
                    sum += (borderMinHeight - depth[i][j]);
                }
            }
            if (max < sum) {
                max = sum;
            }
        }
    }

    public static void main(String[] args) {
        Main cui = new Main();
        cui.scan();
    }
}
