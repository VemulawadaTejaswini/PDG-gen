import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal a = new BigDecimal(scanner.next());
        BigDecimal b = new BigDecimal(scanner.next());
        a = a.multiply(b);
        a = a.setScale(0, BigDecimal.ROUND_DOWN);
        System.out.println(a.toString());
    }

}



