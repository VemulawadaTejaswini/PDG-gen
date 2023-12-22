import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long v = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long w = Long.parseLong(sc.next());
        long t = Long.parseLong(sc.next());
        sc.close();

        // 主処理
        a += v * t;
        b += w * t;
        boolean judge = b <= a;
        String result = judge ? "YES" : "NO";

        // 出力
        System.out.println(result);
    }
}
