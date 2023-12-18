import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        String result;
        if (a + b == 15) {
            result = "+";
        } else if (a * b == 15) {
            result = "*";
        } else {
            result = "x";
        }

        // 出力
        System.out.println(result);
    }
}
