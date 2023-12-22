import java.util.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main main = new Main();
        main.resolve(scan);
        scan.close();
    }

    final private void resolve(Scanner scan) {
        String a = scan.next(), b = scan.next();
        BigDecimal ab = new BigDecimal(a);
        BigDecimal bb = new BigDecimal(b);
        System.out.println(ab.multiply(bb).toBigInteger().toString());
    }
}
