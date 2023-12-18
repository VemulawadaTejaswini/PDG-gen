import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();

        // 主処理
        boolean judge = a.equals(b);
        String result = judge ? "H" : "D";

        // 出力
        System.out.println(result);
    }
}
