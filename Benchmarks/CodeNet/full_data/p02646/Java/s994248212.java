import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long v = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long w = Long.parseLong(sc.next());
        int t = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        boolean judge = a == b;
        for (int i = 0; i < t; i++) {
            a += v;
            b += w;
            if (a == b) {
                judge = true;
                break;
            }
        }
        String result = judge ? "YES" : "NO";

        // 出力
        System.out.println(result);
    }
}
