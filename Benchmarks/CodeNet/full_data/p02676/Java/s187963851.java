import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.next());
        String s = sc.next();
        sc.close();

        // 主処理
        String result = s;
        if (k < s.length()) {
            result = s.substring(0, k) + "...";
        }

        // 出力
        System.out.println(result);
    }
}
