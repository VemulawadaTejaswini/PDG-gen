import java.math.BigDecimal;
import java.util.*;

public class Main {

    static BigDecimal MAX = new BigDecimal(1_000_000_000_000_000_000L);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = Long.valueOf(sc.next().replace(".", ""));
        long ans = a * b / 100;
        System.out.println(ans);
        sc.close();

    }

}
