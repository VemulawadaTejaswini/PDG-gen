import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        BigDecimal A = new BigDecimal(scanner.next());
        BigDecimal B = new BigDecimal(scanner.next());

        BigDecimal ans = A.multiply(B);
        BigDecimal bd1 = ans.setScale(0, RoundingMode.DOWN);


        System.out.println(bd1.toString());
    }
}
