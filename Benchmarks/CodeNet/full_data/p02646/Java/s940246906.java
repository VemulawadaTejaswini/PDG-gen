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
        long dist = Math.abs(a - b);
        boolean judge = false;
        if (w < v) {
            long diff = v - w;
            judge = dist - diff * t <= 0;
        }
        String result = judge ? "YES" : "NO";

        // 出力
        System.out.println(result);
    }
}
