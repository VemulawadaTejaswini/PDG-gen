import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        long w = std.nextLong();
        long h = std.nextLong();
        long x = std.nextLong();
        long y = std.nextLong();
        double weightX = Math.abs(w * 0.5 - x);
        double weightY = Math.abs(h * 0.5 - y);
        int multi = (weightX == weightY) ? 1 : 0;
        BigDecimal square;
        if (weightX < weightY) {
            square = BigDecimal.valueOf((w-x)).multiply(BigDecimal.valueOf(h));
        } else {
            square = BigDecimal.valueOf((h - y)).multiply(BigDecimal.valueOf(w));
        }

        System.out.println(String.format("%s %d", square.toPlainString(), multi));
    }
}