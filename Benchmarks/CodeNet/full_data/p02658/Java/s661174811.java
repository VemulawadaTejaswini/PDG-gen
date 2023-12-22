import java.math.BigDecimal;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        try {
            double result = IntStream.range(0, n).mapToDouble(m -> sc.nextDouble()).reduce((v1, v2) -> v1 * v2).getAsDouble();
            if (result > Math.pow(10, 18)){
                System.out.println("-1");
            } else {
                System.out.println(BigDecimal.valueOf(result).toPlainString());
            }
        } catch (Exception e) {
            System.out.println("-1");
        }
    }
}
