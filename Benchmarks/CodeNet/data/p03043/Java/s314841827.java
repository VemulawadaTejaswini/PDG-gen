import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int k = sc.nextInt();

        BigDecimal ans = new BigDecimal(0);

        BigDecimal nbd = new BigDecimal(n);
        BigDecimal add;
        for (int i=1; i <= n; i++) {
            add = new BigDecimal("0.5").pow(countPowOf2(k, i)).divide(nbd, 12, BigDecimal.ROUND_HALF_UP);

            ans = ans.add(add);
        }

        System.out.println(ans.toString());
    }

    private static int countPowOf2(int target, int orig) {
        int pow = 0;
        while (orig < target) {
            orig *= 2;
            pow++;
        }
        return pow;
    }

}
