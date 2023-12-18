import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int min = a / 100;
        while (a % 100 < min / 10 % 10 * 10 + min / 100) {
            min--;
        }

        int max = b / 100;
        while (b % 100 < max / 10 % 10 * 10 + max / 100) {
            max--;
        }

        int result = max - min;

        // 出力
        System.out.println(result);
    }
}
