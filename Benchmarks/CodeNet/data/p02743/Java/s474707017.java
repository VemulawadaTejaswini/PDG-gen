import java.util.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        double a = s.nextInt();
        double b = s.nextInt();
        double c = s.nextInt();

        String flag = "No";

        a = Math.sqrt(a);
        b = Math.sqrt(b);
        c = Math.sqrt(c);
        BigDecimal A = new BigDecimal(a);
        BigDecimal B = new BigDecimal(b);
        BigDecimal C = new BigDecimal(c);

        BigDecimal result1 = B.add(A);
        
        if (C.compareTo(result1) > 0) {
            flag = "Yes";
        }
        System.out.println(flag);
    }
}