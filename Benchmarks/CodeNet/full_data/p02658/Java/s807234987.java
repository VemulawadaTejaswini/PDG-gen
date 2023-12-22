
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        BigDecimal ans = BigDecimal.ONE;

        for (int i = 0; i < n; i++) {
            ans = ans.multiply(sc.nextBigDecimal());
        }

        if (ans.compareTo(BigDecimal.ONE.scaleByPowerOfTen(18)) <= 0) {
            System.out.println(ans);
        } else {
            System.out.println(-1);
        }

        sc.close();
    }
}