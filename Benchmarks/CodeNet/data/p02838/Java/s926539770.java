import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Long[] a = new Long[n];
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(sc.next());
        }
        sc.close();

        // 主処理
        long result = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                result += a[i] ^ a[j];
            }
        }

        final long MOD = 1000000007;
        result %= MOD;

        // 出力
        System.out.println(result);
    }
}
