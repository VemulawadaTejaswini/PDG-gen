import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        // long startTime = System.currentTimeMillis();

        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int w = scanner.nextInt();

        char[][] map = new char[h][w];
        for (int i = 0; i < h; i++) {
            String str = scanner.next();
            for (int j = 0; j < w; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        scanner.close();

        boolean result = true;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if ('.' == map[i][j]) {
                    continue;
                }

                if ((i - 1) > 0 && '#' == map[i - 1][j]) {
                    continue;
                } else if ((i + 1) < h && '#' == map[i + 1][j]) {
                    continue;
                } else if ((j - 1) > 0 && '#' == map[i][j - 1]) {
                    continue;
                } else if ((j + 1) < w && '#' == map[i][j + 1]) {
                    continue;
                }
                result = false;
                break;
            }
            if (!result) {
                break;
            }
        }
        System.out.println((result) ? "Yes" : "No");

        // System.out.println(System.currentTimeMillis() - startTime);
    }
}