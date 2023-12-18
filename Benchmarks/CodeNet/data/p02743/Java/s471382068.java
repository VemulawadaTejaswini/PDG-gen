import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double eps=0.00001;
        BigDecimal sqra=new BigDecimal(Math.sqrt(a));
        BigDecimal sqrb=new BigDecimal(Math.sqrt(b));
        BigDecimal sqrc=new BigDecimal(Math.sqrt(c));
        if(sqra.add(sqrb).compareTo(sqrc)<0)
        {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}