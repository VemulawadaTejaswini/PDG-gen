
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int w = in.nextInt();
        int h = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();

        System.out.print(new BigDecimal(Integer.valueOf(w))
                .multiply(new BigDecimal(Integer.valueOf(h))
                        .divide(new BigDecimal("2"), 6, RoundingMode.CEILING)));
        System.out.print(" ");
        if (x * 2 == w && y * 2 == h) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}
