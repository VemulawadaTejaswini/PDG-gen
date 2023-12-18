import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        long num = x * 2;
        long result = -1;
        if (x != y) {
            while (num % y == 0) {
                num += x;
            }
            result = num;
        }

        // 出力
        System.out.println(result);
    }
}
