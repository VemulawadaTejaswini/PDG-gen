import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final long A = sc.nextLong();
        final double B = sc.nextDouble();

        System.out.println(BigDecimal.valueOf(A).multiply(BigDecimal.valueOf(B)).toString().replaceAll("\\.[0-9]*$", ""));
    }
}
