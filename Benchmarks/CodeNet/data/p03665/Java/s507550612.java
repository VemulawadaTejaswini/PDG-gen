import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int p = Integer.parseInt(sc.next());
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            if (a % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        sc.close();

        // 主処理
        long result = 0;
        if (p == 0) {
            for (int i = 0; i <= n; i++) {
                long count = combination(evenCount, i);
                result += count;
                for (int j = 2; j <= n; j += 2) {
                    result += count * combination(oddCount, j);
                }
            }
        } else {
            for (int i = 0; i <= n; i++) {
                long count = combination(evenCount, i);
                for (int j = 1; j <= n; j += 2) {
                    result += count * combination(oddCount, j);
                }
            }
        }

        // 出力
        System.out.println(result);
    }

    public static long combination(int n, int m) {
        if (n < m || m < 0) {
            return 0;
        }
        long c = 1;
        m = (n - m < m ? n - m : m);
        for (int ns = n - m + 1, ms = 1; ms <= m; ns++, ms++) {
            c *= ns;
            c /= ms;
        }
        return c;
    }
}
