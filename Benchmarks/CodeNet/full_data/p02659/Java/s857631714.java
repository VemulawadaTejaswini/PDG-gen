import java.math.BigDecimal;
import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        BigDecimal a = BigDecimal.valueOf(sc.nextLong());
        BigDecimal b = BigDecimal.valueOf(sc.nextDouble());
        System.out.println(a.multiply(b).longValue());
    }
}

