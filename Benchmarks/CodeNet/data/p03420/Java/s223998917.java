import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int result = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = k; i <= n; i++) {
            result += n - i; // 分母が分子(k)以上の場合は全てカウント
            result += Math.max((i - 1) / 2 - (k - 1), 0);
            for (int j = 1; j < Math.ceil(i / 2); j++) {
                if (k <= i % j) {
                    result++;
                }
            }
            map.put(i, result);
        }

        // 出力
        System.out.println(result);
    }
}
