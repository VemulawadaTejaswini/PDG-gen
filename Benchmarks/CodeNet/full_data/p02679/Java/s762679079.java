import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 入力
        int n = sc.nextInt();
        BigDecimal[] a = new BigDecimal[n];
        BigDecimal[] b = new BigDecimal[n];
        for (int i = 0; i < n; i++) {
            a[i] = new BigDecimal(sc.nextLong());
            b[i] = new BigDecimal(sc.nextLong());
        }

        long ans = 0;
        int all = 1<<n;
        // 00...01（n桁） から 11...11（n桁） までループ(bit全探索)
        for (int mask = 1; mask < all; mask++) {
            if (check(mask, n, a, b)) {
                ans++;
            }
        }

        // 出力
        System.out.println(ans % 1000000007);
    }

    public static boolean check(int mask, int n, BigDecimal[] a, BigDecimal[] b) {
        for (int i = 0; i < n; i++) {
            // 各ビットでループ
            if (((mask>>i) & 0x1) == 1) {
                for (int j = i+1; j < n; j++) {
                    if (((mask>>j) & 0x1) == 1) {
                        if (a[i].multiply(a[j]).compareTo(b[i].multiply(b[j]).negate()) == 0) {
                            // 仲が悪い
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
