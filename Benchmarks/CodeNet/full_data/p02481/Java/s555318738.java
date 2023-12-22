import java.util.Scanner;


/**
 * Rectangleのエントリポイントを持つメインクラスです。
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        // 縦の長さ
        int height = stdIn.nextInt();

        // 横の長さ
        int width = stdIn.nextInt();

        System.out.println(calcRectangleArea(height, width) + " " + calcRectangleLength(height, width));
    }

    /**
     * 縦と横の長さから長方形の面積を計算します。
     *
     * @param height 縦の長さ
     * @param width 横の長さ
     * @return 長方形の面積
     */
    private static int calcRectangleArea(int height, int width) {
        return height * width;
    }

    /**
     * 縦と横の長さから長方形の周の長さを計算します。
     *
     * @param height 縦の長さ
     * @param width 横の長さ
     * @return 長方形の周の長さ
     */
    private static int calcRectangleLength(int height, int width) {
        return (height + width) * 2;
    }
}