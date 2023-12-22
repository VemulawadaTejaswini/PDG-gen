import java.math.BigDecimal;
import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        long a = sc.nextLong();
        long b = (long)(sc.nextDouble()*100);
        System.out.println((long)(a*b/100));
    }
}

