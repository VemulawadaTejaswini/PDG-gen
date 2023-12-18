
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        String[][] a = new String[h][w];
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            for (int j = 0; j < w; j++) {
                a[i][j] = s.substring(j, j + 1);
            }
        }
        boolean[][] b = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                b[i][j] = false;
            }
        }
        //横一列が.であるときにtrueを入れる。
        for (int i = 0; i < h; i++) {
            boolean isBlackContained = false;
            for (int j = 0; j < w; j++) {
                if (a[i][j].equals("#")) {
                    isBlackContained = true;
                }
            }
            if (!isBlackContained) {
                for (int j = 0; j < w; j++) {
                    b[i][j] = true;
                }
            }
        }

        //縦一列が.であるときにtrueを入れる。
        for (int i = 0; i < w; i++) {
            boolean isBlackContained = false;
            for (int j = 0; j < h; j++) {
                if (a[j][i].equals("#")) {
                    isBlackContained = true;
                }
            }
            if (!isBlackContained) {
                for (int j = 0; j < w; j++) {
                    b[j][i] = true;
                }
            }
        }

        for (int i = 0; i < h; i++) {
            int cnt = 0;
            for (int j = 0; j < w; j++) {
                if (!b[i][j]) {
                    System.out.print(a[i][j]);
                    cnt++;
                }
            }
            if (cnt > 0) {
                System.out.println("");
            }

        }
    }

}
