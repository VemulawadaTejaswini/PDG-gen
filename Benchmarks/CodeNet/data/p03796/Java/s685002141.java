import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        final int MOD = 1000000007;
        long power = 1;
        for (int i = 1; i <= n; i++) {
            power *= i;
            power %= MOD;
        }
        long result = power;

        // 出力
        System.out.println(result);
    }
}
