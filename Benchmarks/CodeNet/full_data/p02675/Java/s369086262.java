import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int n = num % 10;
        String result = "hon";
        if (n == 3) {
            result = "bon";
        } else if (n == 0 || n == 1 || n == 6 || n == 8) {
            result = "pon";
        }

        // 出力
        System.out.println(result);
    }
}
