import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int h = Integer.parseInt(input.split(" ")[0]);
        int w = Integer.parseInt(input.split(" ")[1]);

        int odd = 0;
        int even = 0;
        if (w % 2 == 0) {
            odd = w / 2;
            even = w / 2;
        } else {
            odd = (w + 1) / 2;
            even = (w - 1) / 2;
        }

        if (h % 2 == 0) {
            BigDecimal result = BigDecimal.valueOf(h / 2).multiply((BigDecimal.valueOf(odd).add(BigDecimal.valueOf(even))));
            System.out.println(result);
        } else {
            BigDecimal oddbd = BigDecimal.valueOf((h + 1) / 2).multiply(BigDecimal.valueOf(odd));
            BigDecimal evenbd = BigDecimal.valueOf((h - 1) / 2).multiply(BigDecimal.valueOf(even));
            BigDecimal result = oddbd.add(evenbd);
            System.out.println(result);
        }
    }
}
