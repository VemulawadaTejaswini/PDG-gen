import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        // 主処理
        if (s.charAt(s.length() - 1) == 's') {
            s += "es";
        } else {
            s += "s";
        }
        String result = s;

        // 出力
        System.out.println(result);
    }
}
