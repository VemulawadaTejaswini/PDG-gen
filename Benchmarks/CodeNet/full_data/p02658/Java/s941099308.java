import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long N = sc.nextLong();
        Long result = 1L;
        Long max = 1000000000000000000L;
        for(long i = 0; i<N; i++) {
            Long f = sc.nextLong();
            if (result > max) {
                if (f == 0) {
                    result = 0L;
                }
                continue;
            }
            result *= f;
        }
        if (result > max) {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }
    }
}
