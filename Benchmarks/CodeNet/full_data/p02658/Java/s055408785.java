// 提出時に消す


import java.math.BigDecimal;
import java.util.Scanner;

// 提出時にMainに変更する
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        BigDecimal ans = BigDecimal.ONE;
        BigDecimal[] a = new BigDecimal[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextBigDecimal();
            if (BigDecimal.ZERO.compareTo(a[i]) == 0) {
                System.out.println(0);
                System.exit(0);
            }
        }

        for (int i = 0; i < n; i++) {
            ans = ans.multiply(a[i]);
            if (ans.compareTo(BigDecimal.ONE.scaleByPowerOfTen(18)) > 0) {
                System.out.println(-1);
              System.exit(0);
            }
        }

        if (ans.compareTo(BigDecimal.ONE.scaleByPowerOfTen(18)) <= 0) {
            System.out.println(ans);
        } else {
            System.out.println(-1);
        }

        sc.close();
    }
}