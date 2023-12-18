import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        // 主処理
        boolean judge = 1000 <= n && n <= 1998;
        String result = judge ? "ABD" : "ABC";

        // 出力
        System.out.println(result);
        sc.close();
    }
}
