import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.next());
        int g = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int result = 0;
        for (int i = 0; i <= n; i += r) {
            for (int j = 0; j <= n - i; j += g) {
                for (int j2 = 0; j2 <= n - j; j2 += b) {
                    if (i + j + j2 == n) {
                        result++;
                    }
                }
            }
        }

        // 出力
        System.out.println(result);
    }
}
