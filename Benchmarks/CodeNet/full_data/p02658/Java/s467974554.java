import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        BigDecimal ans = BigDecimal.ONE;
        for (int i = 0; i < N; i++) {
            final long A = sc.nextLong();
            ans = ans.multiply(BigDecimal.valueOf(A));
        }

        System.out.println(ans.compareTo(BigDecimal.valueOf(Math.pow(10, 18))) > 0 ? -1 : ans);
    }
}
