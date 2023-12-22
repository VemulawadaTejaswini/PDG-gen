import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
    
        var a = new BigDecimal(sc.next());
        var b = new BigDecimal(sc.next());
    
        BigDecimal ans = a.multiply(b);
        System.out.println(ans.setScale(0, RoundingMode.FLOOR));
    }
}