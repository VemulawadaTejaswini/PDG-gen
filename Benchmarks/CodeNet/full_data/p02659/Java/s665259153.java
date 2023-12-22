import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input
            BigDecimal A = new BigDecimal(sc.next());
            BigDecimal B = new BigDecimal(sc.next());
            System.out.println(A.multiply(B).longValue());
        }
    }
}
