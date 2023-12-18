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
        boolean judge = false;
        for (int i = a; i <= b; i++) {
            if (i % k == 0) {
                judge = true;
                break;
            }
        }
        String result = judge ? "OK" : "NG";

        // 出力
        System.out.println(result);
    }
}
