import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long A = in.nextLong(), B = in.nextLong(), N = in.nextLong();
        long res = N >= B ? A - 1 : (new BigDecimal(N)).divide(new BigDecimal(B)).multiply(new BigDecimal(A)).longValue();
        System.out.println(res);
    }
}