import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
        final int N = s.nextInt();
        long result = 1;
        long tmpA;

        for (int i = 0 ; i < N ; i++) {
            tmpA = s.nextLong();
            if (result * tmpA > 1000000000000000000l) {
                System.out.println(-1);
                return;
            }
            result = result * tmpA;
        }
            System.out.println(result);
    }
}