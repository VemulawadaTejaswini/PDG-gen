import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BigDecimal l = new BigDecimal(sc.nextLong());

        Set<BigDecimal> usedNum = new HashSet<>();
        long count = 0;
        while (l.longValue() != 1) {
            for (long i = 2; i <= l.longValue(); i++) {
                if (usedNum.contains(new BigDecimal(i))) {
                    continue;
                }
                if (l.divide(new BigDecimal(i), 1).doubleValue() % 1.0 == 0) {
                    l = l.divide(new BigDecimal(i), 0);
                    usedNum.add(new BigDecimal(i));
                    count++;
                }
            }
            break;

        }
        System.out.println(count);
        sc.close();
    }
}
