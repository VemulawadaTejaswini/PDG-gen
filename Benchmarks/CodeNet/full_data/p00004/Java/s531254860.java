import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            int f = sc.nextInt();
            double dev = a * e - b * d;
            double x = (c * e - b * f) / dev;
            double y = (f * a - c * d) / dev;

            System.out.println(new BigDecimal(x).setScale(3, RoundingMode.DOWN)
                    + " "
                    + new BigDecimal(y).setScale(3, RoundingMode.DOWN));
        }
    }
}

