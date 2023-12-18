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
            for (int i = k; i <= n; i++) {
                for (int j = k + 1; j <= n; j++) {
                    if (i < j) {
                        result += n - i;
                        break;
                    }
                    if (k <= i % j) {
                        result++;
                    }
                }
            }
        }

        // 出力
        System.out.println(result);
    }
}
