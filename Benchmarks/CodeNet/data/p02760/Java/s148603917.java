import java.util.Scanner;

class Main {
    static int[][] a = new int[3][3];
    static boolean[][] check = new boolean[3][3];

    static boolean containCheck(int b) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] == b) {
                    check[i][j] = true;
                    return true;
                }
            }
        }
        return false;
    }

    static boolean lineCheck() {
        for (int i = 0; i < 3; i++) {
            int j;
            for (j = 0; j < 3; j++) {
                if (!check[i][j]) {
                    break;
                }
            }
            if (j == 3) {
                return true;
            }
        }
        return false;
    }

    static boolean rowCheck() {
        for (int i = 0; i < 3; i++) {
            int j;
            for (j = 0; j < 3; j++) {
                if (!check[j][i]) {
                    break;
                }
            }
            if (j == 3) {
                return true;
            }
        }
        return false;
    }

    static boolean diagCheck() {
        if (check[0][0] == check[1][1] == check[2][2] == true) {
            return true;
        }
        if (check[0][2] == check[1][1] == check[2][0] == true) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = Integer.parseInt(stdIn.next());
            }
        }
        int n = Integer.parseInt(stdIn.next());
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(stdIn.next());
            containCheck(b[i]);
        }

        boolean bingo = false;
        bingo = lineCheck();
        if (!bingo) {
            bingo = rowCheck();
        }
        if (!bingo) {
            bingo = diagCheck();
        }
        if (bingo) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}