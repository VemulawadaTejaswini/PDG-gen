
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        long jpy = 0L;
        BigDecimal btc = new BigDecimal("0");
        BigDecimal yenBtc = new BigDecimal("380000.0");

        for (int i = 0; i < N; i++) {
            String value = sc.next();
            String unit = sc.next();
            if (unit.equals("JPY")) {
                jpy += Long.valueOf(value);
            } else {
                BigDecimal bigDecimal = new BigDecimal(value);
                btc = btc.add(new BigDecimal(value));
            }
        }

        String result = btc.multiply(yenBtc).add(new BigDecimal(jpy)).toString();
        System.out.print(result);

    }
}