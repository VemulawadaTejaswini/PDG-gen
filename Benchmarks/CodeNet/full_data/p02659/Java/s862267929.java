import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";
    private static final double eps = 0.0001;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        double B = sc.nextDouble();

        System.out.println(solve2(A, B));
    }

    private static String solve(long A, double B) {
        BigDecimal b = BigDecimal.valueOf(A);
        b = b.multiply(BigDecimal.valueOf(B));


        return b.setScale(0, RoundingMode.DOWN).toString();
    }

    private static long solve2(long A, double B) {
        int b100 = (int)(B*100 + eps);

        return A*b100/100;
    }
}