import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long N = sc.nextLong();
        BigDecimal result = new BigDecimal(1);
        BigDecimal max = new BigDecimal(1000000000).multiply(new BigDecimal(1000000000));
        for(long i = 0; i<N; i++) {
            if (result.compareTo(max)==1) {
                if (sc.nextInt() == 0) {
                    System.out.println(0);
                    return;
                }
            }
            result = result.multiply(sc.nextBigDecimal());
        }
        if (result.compareTo(max)==1) {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }
    }
}
