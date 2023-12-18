import java.util.*;
import java.util.stream.IntStream;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        char[][] s = IntStream.range(0, h).mapToObj(i -> scanner.next().toCharArray()).toArray(char[][]::new);
        int[][] a = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (s[i][j] != '#') {
                    a[i][j] = j == 0 ? 1 : a[i][j - 1] + 1;
                }
            }
            for (int j = w - 2; j >= 0; j--) {
                if (s[i][j] != '#') {
                    a[i][j] = Math.max(a[i][j], a[i][j + 1]);
                }
            }
        }
        int[][] b = new int[h][w];
        for (int j = 0; j < w; j++) {
            for (int i = 0; i < h; i++) {
                if (s[i][j] != '#') {
                    b[i][j] = i == 0 ? 1 : b[i - 1][j] + 1;
                }
            }
            for (int i = h - 2; i >= 0; i--) {
                if (s[i][j] != '#') {
                    b[i][j] = Math.max(b[i][j], b[i + 1][j]);
                }
            }
        }
        long ans = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                ans = Math.max(ans, a[i][j] + b[i][j] - 1);
            }
        }
        System.out.println(ans);
    }
}