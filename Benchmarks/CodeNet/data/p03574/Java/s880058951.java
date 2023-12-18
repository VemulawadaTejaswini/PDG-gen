import java.util.Scanner;

public class Main {

    static int N;
    static int W;
    // @formatter:off
    static int[][] NEIGHBOR_GRID =
        { { -1, -1 }, {  0, -1 },  {  1, -1 },
          { -1,  0 },              {  1,  0 },
          { -1,  1 }, {  0,  1 },  {  1,  1 } };
    // @formatter:on


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] NW = sc.nextLine().split(" ");
        N = Integer.parseInt(NW[0]);
        W = Integer.parseInt(NW[1]);

        int[][] out = new int[N][W];
        String[][] ans = new String[N][W];

        // 数値をいったん埋める
        for (int i = 0; i < N; i++) {
            char[] row = sc.nextLine().toCharArray();
            for (int j = 0; j < W; j++) {

                if (row[j] == '#') {
                    fill8NeighborhoodsGrid(out, i, j);
                    ans[i][j] = "#";
                }
            }
        }

        // 埋めた場所を文字列化する
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < W; j++) {

                if (ans[i][j] == null) {
                    ans[i][j] = String.valueOf(out[i][j]);
                }
            }
        }

        // 出力
        for (String[] row : ans) {
            for (String column : row) {
                System.out.print(column);
            }
            System.out.println();
        }
    }

    private static void fill8NeighborhoodsGrid(int[][] out, int i, int j) {
        for (int[] site : NEIGHBOR_GRID) {
            int x = site[0];
            int y = site[1];

            // 8近傍を埋める
            fill(out, i + x, j + y);
        }
    }

    private static void fill(int[][] out, int i, int j) {
        if (i < 0 || j < 0 || N <= i || W <= j) {
            // 枠外の場合は終わり
            return;
        }

        out[i][j]++;
    }
}

