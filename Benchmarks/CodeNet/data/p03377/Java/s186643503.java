import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());

        // 主処理
        boolean judge = a <= x && x <= a + b;
        String result = judge ? "YES" : "NO";

        // 出力
        System.out.println(result);
        sc.close();
    }
}
