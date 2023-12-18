import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int result = 0;
        if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0 && a == b && b == c && a == c) {
            result = -1;
        } else {
            while (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
                int halfA = a / 2;
                int halfB = b / 2;
                int halfC = c / 2;
                a = halfB + halfC;
                b = halfA + halfC;
                c = halfA + halfB;
                result++;
            }
        }

        // 出力
        System.out.println(result);
    }
}
