import java.util.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal L = new BigDecimal(sc.next());
        BigDecimal three = new BigDecimal("3");
        
        L = L.divide(three, 6, BigDecimal.ROUND_HALF_UP);
        
        System.out.println(L.multiply(L).multiply(L));
    }
}