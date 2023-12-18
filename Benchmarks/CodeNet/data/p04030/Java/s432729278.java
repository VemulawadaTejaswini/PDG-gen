import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // 主処理
        String result = s;
        while (0 <= result.indexOf("B")) {
            result = result.replaceAll("^B", "");
            result = result.replaceAll("[01]B", "");
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
