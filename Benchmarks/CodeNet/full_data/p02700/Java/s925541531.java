import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        while (0 < a) {
            c -= b;
            if (0 < c) {
                a -= d;
            } else {
                break;
            }
        }
        boolean winTakahashi = c <= 0;
        String result = winTakahashi ? "Yes" : "No";

        // 出力
        System.out.println(result);
    }
}
