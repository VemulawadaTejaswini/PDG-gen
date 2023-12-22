import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        BigDecimal BigA = new BigDecimal(A);
        String B = sc.next();
        BigDecimal BigB = new BigDecimal(B);
        System.out.println(BigA.multiply(BigB).setScale(0, RoundingMode.DOWN));
        sc.close();
    }
}