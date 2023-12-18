import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        String[][] s = new String[h][w];
        for (int i = 0; i < h; i++) {
            String[] line = sc.next().split("");
            for (int j = 0; j < w; j++) {
                s[i][j] = line[j];
            }
        }

        // 主処理
        boolean isAdjacent = true;
        for (int i = 0; i < h; i++) {

            if (!isAdjacent) {
                break;
            }

            for (int j = 0; j < w; j++) {

                if ("#".equals(s[i][j])) {

                    // 左右隣接判定
                    boolean isLine = true;
                    if (j == 0) {
                        isLine = s[i][j].equals(s[i][j + 1]);
                    } else if (j == w - 1) {
                        isLine = s[i][j].equals(s[i][j - 1]);
                    } else {
                        isLine = s[i][j].equals(s[i][j + 1]) || s[i][j].equals(s[i][j - 1]);
                    }

                    // 上下隣接判定
                    boolean isColumn = true;
                    if (i == 0) {
                        isColumn = s[i][j].equals(s[i + 1][j]);
                    } else if (i == h - 1) {
                        isColumn = s[i][j].equals(s[i - 1][j]);
                    } else {
                        isColumn = s[i][j].equals(s[i + 1][j]) || s[i][j].equals(s[i - 1][j]);
                    }

                    isAdjacent = isLine || isColumn;
                }

                if (!isAdjacent) {
                    break;
                }
            }
        }

        String result = isAdjacent ? "Yes" : "No";

        // 出力
        System.out.println(result);
        sc.close();
    }
}