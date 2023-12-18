import java.util.*;
import java.math.BigDecimal;
import java.math.MathContext;

public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    long bo=1;
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
      bo*=a[i];
    }
    long co=0;
    for(int i=0;i<n;i++){
      co=co+(bo/a[i]);
    }
    BigDecimal boo=BigDecimal.valueOf(bo);
    BigDecimal coo=BigDecimal.valueOf(co);
    BigDecimal ans=boo.divide(coo,7,BigDecimal.ROUND_HALF_UP);
    System.out.println(ans);
  }
}