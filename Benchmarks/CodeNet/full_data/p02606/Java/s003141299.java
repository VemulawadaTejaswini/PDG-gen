import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int l = Integer.parseInt(sc.next());
        int r = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int result = 0;
        for (int i = l; i <= r; i++) {
            if (i % d == 0) {
                result++;
            }
        }

        // 出力
        System.out.println(result);
    }
}
