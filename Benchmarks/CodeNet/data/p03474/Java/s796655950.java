import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        String s = sc.next();
        sc.close();

        // 主処理
        String regex = "[0-9]{" + a + "}-[0-9]{" + b + "}";
        boolean judge = s.matches(regex);
        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
    }
}
