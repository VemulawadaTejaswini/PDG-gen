import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        char[][] hw = new char[h][w];
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            for (int j = 0; j < w; j++) {
                hw[i][j] = s.charAt(j);
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (hw[i][j] == '.') {
                    continue;
                }
                if (i > 0 && hw[i - 1][j] == '#') {
                    continue;
                }
                if (i < h - 1 && hw[i + 1][j] == '#') {
                    continue;
                }
                if (j > 0 && hw[i][j - 1] == '#') {
                    continue;
                }
                if (j < w - 1 && hw[i][j + 1] == '#') {
                    continue;
                }
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}