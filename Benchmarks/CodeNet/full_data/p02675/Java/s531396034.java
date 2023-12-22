import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        sc.close();

        // 主処理
        int num = Integer.parseInt(String.valueOf(n.charAt(n.length() - 1)));

        String result;
        if (num == 3) {
            result = "bon";
        } else if (num == 0 || num == 1 || num == 6 || num == 8) {
            result = "pon";
        } else {
            result = "hon";
        }

        // 出力
        System.out.println(result);
    }
}
