import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigDecimal x = new BigDecimal(in.next());
        BigDecimal y = new BigDecimal(in.next());
        System.out.println(x.multiply(y).setScale(0, RoundingMode.DOWN));
    }
}
