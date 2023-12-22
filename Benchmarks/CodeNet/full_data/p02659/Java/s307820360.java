import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        var a = sc.nextDouble();
        var b = sc.nextDouble();

        var ans = a * b;

        System.out.println(BigDecimal.valueOf(ans).setScale(0, RoundingMode.DOWN));
        sc.close();
    }
}