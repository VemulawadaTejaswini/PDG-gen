import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        // 主処理
        int result = (int) Math.ceil(a / 0.08);
        if ((int) (result * 0.1) != b) {
            if ((int) (b * 10 * 0.08) == a) {
                result = b * 10;
            } else {
                result = -1;
            }
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
