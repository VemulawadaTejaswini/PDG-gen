import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int s = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        boolean judge = s <= w;
        String result = judge ? "unsafe" : "safe";

        // 出力
        System.out.println(result);
    }
}
