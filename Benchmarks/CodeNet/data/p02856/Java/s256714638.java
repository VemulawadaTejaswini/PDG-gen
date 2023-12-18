import java.math.BigDecimal;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int m = std.nextInt();
        BigDecimal sum = BigDecimal.ZERO;
        long baseCount = 0;
        long liftCount = 0;
        for (int i = 0; i < m; i++) {
            int d = std.nextInt();
            long c = std.nextLong();
            baseCount += c;
            sum = sum.add(BigDecimal.valueOf(d * c));
            BigDecimal lift = sum.divide(BigDecimal.TEN);
            liftCount += lift.longValue();
            sum = sum.remainder(BigDecimal.TEN);
        }
        long ans = baseCount - 1 + liftCount;
        System.out.println(ans);

    }
}
