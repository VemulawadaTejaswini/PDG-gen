import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scan;

    private static void start() {
        scan = new Scanner(java.lang.System.in);

        scan = Input.getScanner();
        System.init();
    }

    private static void finish() {
        System.close();
    }


    public static void main(String[] args) {
        start();

        int h = scan.nextInt();
        int w = scan.nextInt();
        scan.nextLine();

        char[][] papan = new char[h][w];
        for (int i = 0; i < h; i++) {
            String s = scan.nextLine();
            for (int j = 0; j < w; j++) {
                papan[i][j] = s.charAt(j);
            }
        }
        char[][] papan2 = new char[2 * h][w];
        for (int i = 0; i < (2 * h); i++) {
            for (int j = 0; j < w; j++) {
                int floor = (int) Math.floor((i) / 2);
                papan2[i][j] = papan[floor][j];
            }
        }
        for (int i = 0; i < 2 * h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(papan2[i][j]);
            }
            System.out.println();
        }
        finish();
    }
}
