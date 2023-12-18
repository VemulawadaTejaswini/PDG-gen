package main.grand;

import java.util.Scanner;

public class Main {

    private static int H = 0;
    private static int W = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] HW = sc.nextLine().split(" ");
        H = Integer.parseInt(HW[0]);
        W = Integer.parseInt(HW[1]);

        char[][] AHW = new char[H][W];
        for (int i = 0; i < H; i++) {
            String A = sc.nextLine();
            AHW[i] = A.toCharArray();
        }

        int times = 0;
        for (int i = 0; i < H; i++) {
            times += fill(AHW, 1);
        }
        System.out.println(times);
    }

    private static int fill(char[][] aHW, int cnt) {

        boolean isFill = false;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {

                char c = aHW[i][j];
                if (c == '#') {

                    // 横方向
                    if (j > 0 && j < W - 1) {
                        char L = aHW[i][j - 1];
                        char R = aHW[i][j + 1];

                        if (L == '.' || R == '.') {
                            aHW[i][j - 1] = '#';
                            aHW[i][j + 1] = '#';
                            isFill = true;
                        }
                    }
                    // 縦方向
                    if (i > 0 && i < H - 1) {
                        char T = aHW[i + 1][j];
                        char U = aHW[i - 1][j];

                        if (T == '.' || U == '.') {
                            aHW[i - 1][j] = '#';
                            aHW[i + 1][j] = '#';
                            isFill = true;
                        }
                    }
                }
            }
        }

        if (isFill) {
            return 1;
        } else {
            return 0;
        }
    }
}
