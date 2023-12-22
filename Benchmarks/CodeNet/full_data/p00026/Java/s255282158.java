import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    /**
     * 紙の大きさ
     */
    private final static int SIZE = 10;

    public static void main(String[] args) throws IOException {
        //空白の個数
        int blank = 0;

        //最も濃いマス目の濃さ
        int depth = 0;

        //用紙の生成
        int[][] paper = createPaper(SIZE);

        //画面からの入力
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));

        String line;

        while ((line = bufferedReader.readLine()) != null) {
            String[] target = line.split(",", 0);

            int x = Integer.parseInt(target[0]);
            int y = Integer.parseInt(target[1]);
            int inkType = Integer.parseInt(target[2]);

            if (inkType == 1) {
                paper = dropInkSmall(paper, x, y);
            } else if (inkType == 2) {
                paper = dropInkMedium(paper, x, y);
            } else if (inkType == 3) {
                paper = dropInkLarge(paper, x, y);
            }
            blank = 0;
            for (int i = 0; i < paper.length; i++) {
                for (int j = 0; j < paper[i].length; j++) {
                    if (paper[i][j] == 0) {
                        blank++;
                    }
                    if (depth < paper[i][j]) {
                        depth = paper[i][j];
                    }
                }
            }
            System.out.println(blank);
            System.out.println(depth);
        }
        bufferedReader.close();
    }

    public static int[][] dropInkSmall(int[][] paper, int x, int y) {
        //中心
        paper[x][y] += 1;
        //左
        if (0 <= (x - 1)) {
            paper[x - 1][y] += 1;
        }
        //右
        if ((x + 1) <= 9) {
            paper[x + 1][y] += 1;
        }
        //上
        if (0 <= (y - 1)) {
            paper[x][y - 1] += 1;
        }
        //下
        if ((y + 1) <= 9) {
            paper[x][y + 1] += 1;
        }

        return paper;

    }

    public static int[][] dropInkMedium(int[][] paper, int x, int y) {

        //インク小呼び出し
        paper = dropInkSmall(paper, x, y);
        //インク中

        //左上
        if (0 <= (x - 1) && 0 <= (y - 1)) {
            paper[x - 1][y - 1] += 1;
        }
        //右上
        if ((x + 1) <= 9 && 0 <= (y - 1)) {
            paper[x + 1][y - 1] += 1;
        }
        //左下
        if (0 <= (x - 1) && (y + 1) <= 9) {
            paper[x - 1][y + 1] += 1;
        }
        //右下
        if ((x + 1) <= 9 && (y + 1) <= 9) {
            paper[x + 1][y + 1] += 1;
        }

        return paper;

    }

    public static int[][] dropInkLarge(int[][] paper, int x, int y) {

        paper = dropInkMedium(paper, x, y);

        //左
        if (0 <= (x - 2)) {
            paper[x - 2][y] += 1;
        }
        //右
        if ((x + 2) <= 9) {
            paper[x + 2][y] += 1;
        }
        //上
        if (0 <= (y - 2)) {
            paper[x][y - 2] += 1;
        }
        //下
        if ((y + 2) <= 9) {
            paper[x][y + 2] += 1;
        }

        return paper;

    }

    public static int[][] createPaper(int size) {
        return new int[size][size];
    }

}