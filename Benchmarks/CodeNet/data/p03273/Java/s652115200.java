
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        boolean[][] a = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            for (int j = 0; j < w; j++) {
                if (s.charAt(j) == '.')
                    a[i][j] = true;
            }
        }

        while (true) {
            int x = -1;
            int y = -1;
            for (int i = 0; i < h; i++) {
                boolean check = true;
                for (int j = 0; j < w; j++) {
                    check &= a[i][j];
                }
                if (check)
                    y = i;
            }
            for (int i = 0; i < w; i++) {
                boolean check = true;
                for (int j = 0; j < h; j++) {
                    check &= a[j][i];
                }
                if (check)
                    x = i;
            }

            if (x != -1) {
                boolean[][] nex = new boolean[h][w - 1];
                for (int i = 0; i < h; i++) {
                    for (int j = 0; j < w; j++) {
                        if (j == x)
                            continue;
                        if (j > x)
                            nex[i][j - 1] = a[i][j];
                        else
                            nex[i][j] = a[i][j];
                    }
                }
                w--;
                a = nex;
            } else if (y != -1) {
                boolean[][] nex = new boolean[h - 1][w];
                for (int i = 0; i < h; i++) {
                    for (int j = 0; j < w; j++) {
                        if (i == y)
                            continue;
                        if (i > y)
                            nex[i - 1][j] = a[i][j];
                        else
                            nex[i][j] = a[i][j];
                    }
                }
                h--;
                a = nex;
            } else {
                break;
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(a[i][j] ? "." : "#");
            }
            System.out.println();
        }

    }

}
