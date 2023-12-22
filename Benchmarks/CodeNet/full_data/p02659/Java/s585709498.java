import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
        final long A = s.nextLong();
        final double B = s.nextDouble();

        BigDecimal bdA = new BigDecimal(String.valueOf(A));
        BigDecimal bdB = new BigDecimal(String.valueOf(B));

        BigDecimal bdResult = bdA.multiply(bdB);

        System.out.println(bdResult.setScale(0, RoundingMode.DOWN));
    }
}