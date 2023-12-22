import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                return;
            }
            int w = sc.nextInt();
            int h = sc.nextInt();
            int[][] map = new int[h][w];
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt() - 1;
                int y = sc.nextInt() - 1;
                map[y][x] = 1;
            }
            int s = sc.nextInt();
            int t = sc.nextInt();
            int max = 0;
            for (int i = 0; i <= h - t; i++) {
                for (int j = 0; j <= w - s; j++) {
                    int c = 0;
                    for (int k = 0; k < t; k++) {
                        for (int l = 0; l < s; l++) {
                            c += map[i + k][j + l];
                        }
                    }
                    System.out.println(c);
                    max = Math.max(c, max);
                }
            }
            arrayDump(map);
            // System.out.println();
            // System.out.println(max);
            // System.out.println();
        }
    }

    public static void arrayDump(int[][] a) {
        for (int i = 0, l = a.length; i < l; i++) {
            for (int j = 0, l2 = a[0].length; j < l2; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}