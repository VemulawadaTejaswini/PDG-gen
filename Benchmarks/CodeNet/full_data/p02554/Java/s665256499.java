import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(
                BigDecimal.TEN.pow(n)
                        .subtract(BigDecimal.valueOf(9).pow(n).multiply(BigDecimal.valueOf(2)))
                        .add(BigDecimal.valueOf(8).pow(n))
                .remainder(BigDecimal.TEN.pow(9).add(BigDecimal.valueOf(7)))
        );
    }
}
