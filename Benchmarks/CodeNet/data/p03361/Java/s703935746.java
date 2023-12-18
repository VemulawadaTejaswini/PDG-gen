import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int h = sc.nextInt(), w = sc.nextInt();
        if (h == 1 && w == 1) {
            System.out.println("Yes");
            return;
        }
        boolean[][] s = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            String str = sc.next();
            for (int j = 0; j < str.length(); j++) {
                s[i][j] = str.charAt(j) == '#';
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                for (int k = -1; k <= 1; k++) {
                    for (int l = -1; l < 1; l++) {
                        if (k == 0 && l == 0 || k != 0 && l != 0) {
                            continue;
                        }
                        if (i + k < 0 || i + k >= h || j + l < 0 || j + l >= w) {
                            continue;
                        }
                        if (s[i][j] == s[i + k][j + l]) {
                            System.out.println("Yes");
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("No");
    }
}
