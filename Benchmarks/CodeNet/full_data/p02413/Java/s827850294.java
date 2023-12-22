import java.util.Scanner;

public class Main {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        // 表の行数rと列数c、r × c の要素を持つ表
        int r = scan.nextInt();
        int c = scan.nextInt();
        int[][] hyou = new int[r+1][c+1];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                hyou[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < r +1; i++) {
            for (int j = 0; j < c + 1; j++) {
                if (j == c) {
                    System.out.println(hyou[i][c]);
                } else {
                    System.out.print(hyou[i][j] + " ");
                    hyou[i][c] += hyou[i][j];
                    hyou[r][j] += hyou[i][j];
                }
            }
        }
    }
}