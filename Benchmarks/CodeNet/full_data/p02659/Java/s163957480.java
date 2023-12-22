import java.util.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        String A = scanner.next();
        String B = scanner.next();
        
        BigDecimal bA = new BigDecimal(A);
        BigDecimal bB = new BigDecimal(B);
        
        BigDecimal ans = bA.multiply(bB);
        BigDecimal Ans = ans.setScale(0,BigDecimal.ROUND_DOWN);
        
        System.out.println(Ans);
    }
}
