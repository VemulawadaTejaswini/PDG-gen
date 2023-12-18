import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();

        BigDecimal power = new BigDecimal("1");
        BigDecimal bd = new BigDecimal("1000000007");

        for (int i = 1; i <= n; i++) {
            power = power.multiply(new BigDecimal(i));
        }

        System.out.println(power.remainder(bd));
    }
}