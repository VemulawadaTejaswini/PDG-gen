import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

        int blue = K;
        int red = N - K;

        BigDecimal div = BigDecimal.valueOf((Math.pow(10, 9) + 7));

        for (int i = 0; i < blue; i++) {
            // 赤いボールの中に青いボールが入る位置の組み合わせ
            BigDecimal r = BigDecimal.ZERO;
            if (i <= red) {
                r = comb(red + 1, i + 1);
            }
            // 青いボールの分け方
            BigDecimal b = BigDecimal.ONE;
            if (i != 0 && i != blue - 1) {
                b = comb(blue - 1, i);
            }

            long ans = r.multiply(b).remainder(div).longValue();
            System.out.println(ans);
        }

    }

    private static BigDecimal factorial(int n) {
        if (n > 0) {
            return BigDecimal.valueOf(n).multiply(factorial(n - 1));
        } else {
            return BigDecimal.valueOf(1);
        }
    }

    private static BigDecimal comb(int a, int b) {
        if (a >= b) {
            BigDecimal denominator = factorial(b);
            BigDecimal numerator = BigDecimal.ONE;
            for (int i = a; i > a - b; i--) {
                BigDecimal bi = BigDecimal.valueOf(i);
                numerator = numerator.multiply(bi);
            }
            return numerator.divide(denominator);
        } else {
            return BigDecimal.ONE;
        }
    }
}