import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        // 主処理
        for (int i = 0; i < s.length(); i++) {
            String charS = String.valueOf(s.charAt(i));
            String charT = String.valueOf(t.charAt(i));
            if (!charS.equals(charT)) {
                s = s.replace(charS, "*").replace(charT, charS).replace("*", charT);
            }
        }

        boolean judge = s.equals(t);
        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
        sc.close();
    }
}
