import java.util.Scanner;

class Main {
    static void containCheck(int[][] a, int b, boolean[][] c) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] == b) {
                    c[i][j] = true;
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int[][] a = new int[3][3];
        boolean[][] check = new boolean[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = Integer.parseInt(stdIn.next());
            }
        }
        int n = Integer.parseInt(stdIn.next());
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(stdIn.next());
            containCheck(a, b[i], check);
        }

        boolean bingo = false;
        for (int i = 0; i < 3; i++) {
            int j;
            for (j = 0; j < 3; j++) {
                if (!check[i][j]) {
                    break;
                }
            }
            if (j == 3) {
                bingo = true;
            }
        }

        if (!bingo) {
            for (int i = 0; i < 3; i++) {
                int j;
                for (j = 0; j < 3; j++) {
                    if (!check[j][i]) {
                        break;
                    }
                }
                if (j == 3) {
                    bingo = true;
                }
            }
        }

        if (!bingo) {
            int i;
            for (i = 0; i < 3; i++) {
                if (!check[i][i]) {
                    break;
                }
            }
            if (i == 3) {
                bingo = true;
            }
        }

        if (!bingo) {
            int i;
            for (i = 0; i < 3; i++) {
                if (!check[i][2 - i]) {
                    break;
                }
            }
            if (i == 3) {
                bingo = true;
            }
        }

        if (bingo) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}