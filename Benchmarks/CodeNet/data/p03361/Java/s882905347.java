import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int H;
    static int W;
    static String[][] matrix;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        H = Integer.parseInt(sc.next());
        W = Integer.parseInt(sc.next());

        // 初期化
        matrix = new String[H+2][W+2];
        for (String[] a : matrix) {
            Arrays.fill(a, "");
        }

        for (int i = 1; i <= H; i++) {
            String line = sc.next();
            for (int j = 0; j < line.length(); j++) {
                matrix[i][j+1] = String.valueOf(line.charAt(j));
            }
        }

        solve();
    }

    // 上下左右のどこかに#があればOK
    // 完全に孤立したマスがひとつでもあるとNG
    static void solve() {
        for (int i = 1; i <= H; i++) {
            for (int j = 1; j <= W; j++) {
                String p = matrix[i][j];
                if (p.equals("#")) {
                    // 上下左右
                    String around = matrix[i-1][j] + matrix[i+1][j] + matrix[i][j-1] + matrix[i][j+1];
                    if (around.indexOf("#") == -1) {
                        System.out.println("No");
                        return;
                    }
                }
            }
        }
        System.out.println("Yes");
    }
}
