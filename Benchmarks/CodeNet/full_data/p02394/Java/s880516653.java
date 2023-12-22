import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 変数の読み込み
        int w_x = sc.nextInt(); // 長方形の右上のx座標
        int h_y = sc.nextInt(); // 長方形の右上のy座標
        int circle_x = sc.nextInt(); // 円の中心のx座業
        int circle_y = sc.nextInt(); // 円の中心のy座業
        int circle_r = sc.nextInt(); // 円の半径

        // 判定に使用する変数
        boolean containsCircle = false;
        int circle_d = 2 * circle_r;

        // 円の内側の判定
        if (circle_x <= 0 || circle_y <= 0) {
            containsCircle = false;
        } else if (circle_x >= w_x || circle_y >= h_y) {
            containsCircle = false;
        } else if (w_x - circle_d >= 0 && h_y - circle_d >= 0) {
            containsCircle = true;
        }

        if (containsCircle) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}