import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        BigDecimal x = new BigDecimal("1");
        for (int i=1; i<=N; i++) {
            x = x.multiply(new BigDecimal(i));
        }
        BigDecimal ret = x.remainder(BigDecimal.valueOf(Math.pow(10, 9)).add(new BigDecimal("7")));
        System.out.println(ret);
    }
}