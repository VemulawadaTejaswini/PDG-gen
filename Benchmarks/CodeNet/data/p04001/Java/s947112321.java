
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    static BigDecimal[] cache = new BigDecimal[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int length = str.length();
        BigDecimal result = new BigDecimal(0);
        for (int i = 1; i <= length; i++) {
            for (int from = 0; from + i <= length; from++) {
                int left = from == 0 ? 1 : from;
                int right = length - (from + i);
                right = right == 0 ? 1 : right;
                BigDecimal bigDecimal = new BigDecimal(str.substring(from, from + i));
                result = result.add(bigDecimal.multiply(c(left)).multiply(c(right)));
            }
        }
        System.out.println(result);

    }

    static BigDecimal c(int count) {
        if (cache[count] != null) {
            return cache[count];
        }
        if (count == 0 || count == 1) {
            return new BigDecimal(1);
        }
        int n = count - 1;
        int result = 0;
        for (int i = 1; i <= n; i++) {
            int r = 1;
            for (int j = 0; j < i; j++) {
                r = r * (n - j);
            }
            for (int j = 0; j < i; j++) {
                r = r / (i - j);
            }
            result += r;
        }
        cache[count] = new BigDecimal(result + 1);

        return cache[count];
    }

}
