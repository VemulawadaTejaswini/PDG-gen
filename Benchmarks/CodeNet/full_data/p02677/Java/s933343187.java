import java.math.BigDecimal;
import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal a = new BigDecimal(sc.next());
        BigDecimal b = new BigDecimal(sc.next());
        BigDecimal h = new BigDecimal(sc.next());
        BigDecimal m = new BigDecimal(sc.next());

        BigDecimal circle = new BigDecimal("360");

        BigDecimal aTheta = circle.multiply(h.divide(new BigDecimal("12"), 10, BigDecimal.ROUND_HALF_EVEN)).add(new BigDecimal("30").multiply(m.divide(new BigDecimal("60"), 10, BigDecimal.ROUND_HALF_EVEN)));
        BigDecimal bTheta = circle.multiply(m.divide(new BigDecimal("60"), 10, BigDecimal.ROUND_HALF_EVEN));
        BigDecimal subAB = aTheta.subtract(bTheta).abs();
        BigDecimal theta = subAB.min(circle.subtract(subAB));
        double cos = Math.cos(Math.toRadians(theta.doubleValue()));
        double ansSq = Math.pow(a.doubleValue(), 2) + Math.pow(b.doubleValue(), 2) - 2 * a.doubleValue() * b.doubleValue() * cos;
        double ans = Math.sqrt(ansSq);

        System.out.println(ans);    
    }
}
