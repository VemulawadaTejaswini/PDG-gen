import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        BigDecimal kaijo = BigDecimal.valueOf(1);
        for (long i = input; 1 <= i; i--) {
            kaijo = kaijo.multiply(BigDecimal.valueOf(i));
        }

        long count = 0;
        for (BigDecimal i = BigDecimal.valueOf(1); i.compareTo(kaijo) <= 0; i = i.add(BigDecimal.valueOf(1))) {
            BigDecimal result = kaijo.remainder(i);
            if ( result.compareTo(BigDecimal.valueOf(0)) == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
