import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int n;
            for(int c = 1; (n = scn.nextInt()) > 0; c++) {
                int cnt = 0;
                boolean dir = true;
                int[][] tbl = new int[n][n];

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j <= i; j++) {
                        if (dir) {
                            tbl[i - j][j] = ++cnt;
                        } else {
                            tbl[j][i - j] = ++cnt;
                        }
                    }
                    dir = !dir;
                }

                for (int i = 0; i < n; i++) {
                    for (int j = 1; j < n - i; j++) {
                        if (dir) {
                            tbl[n - j][i + j] = ++cnt;
                        } else {
                            tbl[i + j][n - j] = ++cnt;
                        }
                    }
                    dir = !dir;
                }

                System.out.println("Case " + c + ":");
                for (int[] ary : tbl) {
                    for (int elm : ary) {
                        System.out.format("%3d", elm);
                    }
                    System.out.println();
                }
            }
        }
    }
}