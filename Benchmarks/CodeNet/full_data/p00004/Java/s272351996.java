import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        while(sc.hasNext()){
 
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();
 
        BigDecimal x = new BigDecimal((c*e-b*f)/(a*e-b*d));
        BigDecimal y = new BigDecimal((c*d-a*f)/(b*d-a*e));
 
        x = x.setScale(3, BigDecimal.ROUND_HALF_UP);
        y = y.setScale(3, BigDecimal.ROUND_HALF_UP);
 
        System.out.printf("%.3f ",x);
        System.out.printf("%.3f\n",y);
 
    }
 
    }
}