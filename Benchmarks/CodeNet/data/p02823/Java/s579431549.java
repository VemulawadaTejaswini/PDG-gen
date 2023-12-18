import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());

        // 主処理
        long result = 0;

        long diff = b - a;
        if (diff % 2 == 0) {
            result = diff / 2;

        } else {
            long diffA = a - 1; // aから最下卓までの距離
            long diffB = n - b; // bから最上卓までの距離
            if (diffA < diffB) {
                result += diffA; // aを最下卓まで動かす
                result += (b - diffA) / 2; // 残りはお互いに近づく
            } else {
                result += diffB; // bを最上卓まで動かす
                result += (n - a - diffB + 1) / 2; // 残りはお互いに近づく
            }
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
