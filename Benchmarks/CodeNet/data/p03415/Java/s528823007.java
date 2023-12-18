import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String c1 = sc.next();
        String c2 = sc.next();
        String c3 = sc.next();

        // 主処理
        String result = "" + c1.charAt(0) + c2.charAt(1) + c3.charAt(2);

        // 出力
        System.out.println(result);
        sc.close();
    }
}
