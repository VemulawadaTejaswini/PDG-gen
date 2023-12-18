import java.util.*;
import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n%27!=0){
      BigDecimal x=BigDecimal.valueOf(n*25);
      BigDecimal dia=new BigDecimal("27");
      BigDecimal mua=new BigDecimal("1.08");
      BigDecimal x1=x.divide(dia,0,BigDecimal.ROUND_HALF_UP);
      BigDecimal y=x1.multiply(mua);
      y=y.setScale(0,BigDecimal.ROUND_DOWN);
      int s=y.intValue();
      int w=x1.intValue();
      if(s==n){
        System.out.println(w);
      }else{
        System.out.println(":(");
      }
    }else{
      System.out.println(n/27*25);
    }
  }
}