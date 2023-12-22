import java.util.Scanner;
import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        BigDecimal ba = new BigDecimal(a);
        BigDecimal bb = new BigDecimal(b);

        int d = ba.divide(bb).intValue();
        int r = ba.remainder(bb).intValue();
        double f = ba.divide(bb, 3, BigDecimal.ROUND_HALF_UP).doubleValue();

        System.out.println(d+" "+r+" "+f);
    }
}