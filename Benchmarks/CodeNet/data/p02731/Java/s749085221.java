import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int L = s.nextInt();
        BigDecimal ans = new BigDecimal(L * L * L / 27);

        System.out.println(ans);
        s.close();
    }
}