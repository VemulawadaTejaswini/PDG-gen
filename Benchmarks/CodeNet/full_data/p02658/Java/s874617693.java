import java.util.*;

public class Main {

    public static void main(String args[]) {


        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        BigDecimal sum = BigDecimal.valueOf(1);

        for (int i= 0; i< n; i++) {

            long x = scan.nextLong();
            if (x == 0) {
                System.out.println(0);
                return;
            }
            BigDecimal x2 = BigDecimal.valueOf(x);
            sum = sum.multiply(x2);
        }


        BigDecimal a = BigDecimal.valueOf(1.0e18);

        if (sum.compareTo(a) == 1) {
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
        }


    }


}