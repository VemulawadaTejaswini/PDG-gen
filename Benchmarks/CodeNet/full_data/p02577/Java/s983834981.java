import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        sc.close();

        // 主処理
        int sum = 0;
        for (String s : n.split("")) {
            int num = Integer.parseInt(s);
            sum += num;
        }
        boolean judge = sum % 9 == 0;
        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
    }
}
