import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        boolean isZero = a < 0 && 0 < b;

        String result = "Zero";
        if (!isZero) {
            boolean isNegative = (a < 0 && b < 0) && ((b - a) % 2 == 0);
            result = isNegative ? "Negative" : "Positive";
        }

        // 出力
        System.out.println(result);
    }
}
