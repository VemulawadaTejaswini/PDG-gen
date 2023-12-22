import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        BigDecimal result = new BigDecimal("1");
        for (int i = 0; i < N; i++) {
            result = result.multiply(new BigDecimal(s.next()));
        }
        BigDecimal b = new BigDecimal("10");
        for (int i = 0; i < 18; i++) {
            b = b.multiply(new BigDecimal("10"));
        }
        System.out.println(result.compareTo(b) > 0 ? -1 : result);
    }
}