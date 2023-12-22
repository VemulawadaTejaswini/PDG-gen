import java.util.Map.Entry;
import java.util.*;
import java.math.*;
import org.w3c.dom.css.Counter;
  
public class Main{
    public static void main(final String[] args){
 
        final Scanner sc = new Scanner(System.in);
        BigDecimal Av = new BigDecimal(sc.next());
        BigDecimal Bv = new BigDecimal(sc.next());
        BigDecimal ans = Av.multiply(Bv);

       
            System.out.println(ans.setScale(0, BigDecimal.ROUND_DOWN));
        
    }
}