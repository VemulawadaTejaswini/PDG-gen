import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        BigDecimal bd1 = BigDecimal.valueOf(b / x).setScale(0, BigDecimal.ROUND_DOWN);
        BigDecimal bd2 = BigDecimal.valueOf(a / x).setScale(0, BigDecimal.ROUND_DOWN);
        int add = 0;
        if (a % x == 0) {
            add = 1;

        }
        System.out.println(bd1.subtract(bd2).longValue() + add);
    }
}