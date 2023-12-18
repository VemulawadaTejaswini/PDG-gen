import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        sc.close();

        // 主処理
        String result = "UNRESTORABLE";
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i <= s.length() - t.length(); i++) {
            String regex = sb.substring(i, i + t.length()).replaceAll("\\?", ".").toString();
            if (t.matches(regex)) {
                String word = sb.replace(i, i + t.length(), t).toString();
                result = word.replaceAll("\\?", "a").toString();
            }
        }

        // 出力
        System.out.println(result);
    }
}
