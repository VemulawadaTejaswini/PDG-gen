import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        long num = 1;
        if (a < k && a + 1 < b) {
            num += a - 1;
            long remainK = k - (a - 1);

            long add = b - a;
            num += remainK / 2 * add;
            num += remainK % 2 == 0 ? 0 : 1;

        } else {
            num += k;
        }

        long result = num;

        // 出力
        System.out.println(result);
    }
}
