import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int[][] array = new int[w+1][h+1];

        int n = sc.nextInt();
        while (n-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();

            if (a == 1) {
                for (int i = 1; i <= h; i++) {
                    for (int j = 1; j <= x; j++) {
                        array[j][i] = 1;
                    }
                }
            } else if (a == 2) {
                for (int i = 1; i <= h; i++) {
                    for (int j = x+1; j <= w; j++) {
                        array[j][i] = 1;
                    }
                }
            } else if (a == 3) {
                for (int i = 1; i <= w; i++) {
                    for (int j = 1; j <= y; j++) {
                        array[i][j] = 1;
                    }
                }
            } else {
                for (int i = 1; i <= w; i++) {
                    for (int j = y+1; j <= h; j++) {
                        array[i][j] = 1;
                    }
                }
            }
        }

        int count = 0;
        for (int i = 1; i <= w; i++) {
            for (int j = 1; j <= h; j++) {
                if (array[i][j] == 1) count++;
            }
        }

        System.out.println(h * w - count);
    }
}