import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // 主処理
        String word = s.replace("x", "");
        StringBuffer sb = new StringBuffer(word);
        String reverse = sb.reverse().toString();

        int result = -1;
        if (word.equals(reverse)) {
            result = s.length() - word.length();
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
