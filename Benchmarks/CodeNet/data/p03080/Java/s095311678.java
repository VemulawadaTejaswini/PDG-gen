import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        sc.close();

        // 主処理
        int red = s.replaceAll("[^R]", "").length();
        int blue = s.replaceAll("[^B]", "").length();
        boolean judge = blue < red;
        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
    }
}
