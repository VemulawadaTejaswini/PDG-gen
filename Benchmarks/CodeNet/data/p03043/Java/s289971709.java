import java.math.BigDecimal;
import java.util.*;
public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int k = sc.nextInt();
        Double d = 0.0;
        for (int i = 1; i <= n; i++) {
            if (i >= k) {
                d = 1 - d;
                break;
            }
            int t = 0;
            while (true) {
                if (i * (Math.pow(2, ++t)) >= k) {
                    double temp = (1.0d / n) * Math.pow(0.5, t);
                    d += temp;
                    break;
                }
            }
        }
        System.out.print(BigDecimal.valueOf(d).toPlainString());
    }
}