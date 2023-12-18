import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 変数
        int[][] bingo  = new int[3][3]; // ビンゴシート
        int n = 0; // 表示される数字の数
        int x[] = null; // 数字リスト
        int count;
        boolean judge = false; // ビンゴ有無

        // 変数準備
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                bingo[i][j] = sc.nextInt();
            }
        }

        n = sc.nextInt();
        x = new int[n];

        for (int k = 0; k < n; k++) {
            x[k] = sc.nextInt();
        }

        // 判定準備
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < n; k++) {
                    if (x[k] == bingo[i][j]) {
                        bingo[i][j] = -1;
                    }
                }
            }
        }

        // 判定
        // 縦
        count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (bingo[i][j] == -1) {
                    count++;
                }
            }
            if (count == 3) {
                judge = true;
            }
            count= 0;
        }

        // 横
        if (!judge) {
            count = 0;
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 3; i++) {
                    if (bingo[i][j] == -1) {
                        count++;
                    }
                }
                if (count == 3) {
                    judge = true;
                }
                count= 0;
            }
        }

        // 斜め
        if (!judge) {
            count = 0;
            if (bingo[0][0] == -1) {
                count++;
            }
            if (bingo[1][1] == -1) {
                count++;
            }
            if (bingo[2][2] == -1) {
                count++;
            }
            if (count == 3) {
                judge = true;
            }
        }

        if (!judge) {
            count = 0;
            if (bingo[0][2] == -1) {
                count++;
            }
            if (bingo[1][1] == -1) {
                count++;
            }
            if (bingo[2][0] == -1) {
                count++;
            }
            if (count == 3) {
                judge = true;
            }
        }

        if(judge) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }

    }
}
