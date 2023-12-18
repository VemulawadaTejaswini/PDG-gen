import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        sc.close();

        // 主処理
        boolean isGood = false;
        for (int i = 0; i < n.length() - 2; i++) {
            if (n.charAt(i) == n.charAt(i + 1) && n.charAt(i + 1) == n.charAt(i + 2)) {
                isGood = true;
                break;
            }
        }
        String result = isGood ? "Yes" : "No";

        // 出力
        System.out.println(result);
    }
}
