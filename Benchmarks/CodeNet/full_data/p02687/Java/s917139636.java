import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        // 主処理
        String result;
        switch (s) {
            case "ABC":
                result = "ARC";
                break;

            case "ARB":
                result = "ABC";
                break;

            default:
                result = "null";
                break;
        }

        // 出力
        System.out.println(result);
    }
}
