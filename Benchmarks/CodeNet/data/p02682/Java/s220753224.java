import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long c = Long.parseLong(sc.next());
        long k = Long.parseLong(sc.next());
        sc.close();

        // 主処理
        long result = 0;
        if (k <= a) {
            result = k;
        } else if (k <= a + b) {
            result = a;
        } else {
            long remain = k - (a + b);
            result = a - remain;
        }

        // 出力
        System.out.println(result);
    }
}
