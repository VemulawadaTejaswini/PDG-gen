import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int result = 0;
        if (k <= a) {
            result = k;
        } else if (k <= a + b) {
            result = a;
        } else {
            result = a - (k - (a + b));
        }

        // 出力
        System.out.println(result);
    }
}
