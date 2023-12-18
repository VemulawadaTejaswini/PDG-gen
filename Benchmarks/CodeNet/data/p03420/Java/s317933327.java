import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        long result = 0;
        if (k == 0) {
            result = n * n;
        } else {
            int max = n - k;
            for (int j = 1; j <= max; j++) {
                result += j;
            }
            for (int i = 1; i <= n; i++) {
                long count = 0;
                for (int j = k + 1; j < i; j++) {
                    if (k <= i % j) {
                        count++;
                    }
                }
                result += count;
            }
        }

        // 出力
        System.out.println(result);
    }
}
