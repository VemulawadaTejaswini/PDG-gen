import java.util.*;
import java.math.BigDecimal;
import java.math.MathContext;

public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int x=sc.nextInt();
    double tt=1.0;
    double ans=1.0;
    if(x<=(a*a*b/2)){
      BigDecimal aa=BigDecimal.valueOf(a*b);
      BigDecimal xx=BigDecimal.valueOf(x*2);
      BigDecimal ttt=xx.divide(aa,8,BigDecimal.ROUND_HALF_UP);
      tt=ttt.doubleValue();
      ans=Math.atan2(b,tt);
      ans=Math.toDegrees(ans);
    }else{
      BigDecimal aa=BigDecimal.valueOf(a*a);
      BigDecimal xx=BigDecimal.valueOf((a*a*b-x)*2);
      BigDecimal ttt=xx.divide(aa,8,BigDecimal.ROUND_HALF_UP);
      tt=ttt.doubleValue();
      ans=Math.atan2(tt,a);
      ans=Math.toDegrees(ans);
    }
    System.out.println(ans);
  }
}