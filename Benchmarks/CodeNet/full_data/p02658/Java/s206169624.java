import java.util.*;
import java.math.BigInteger;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    BigInteger ans  = BigInteger.ONE;
    long l = (long)Math.pow(10,18);
    BigInteger L = BigInteger.valueOf(l);
    while(sc.hasNext()){
      long a = sc.nextLong();
      if (a == 0) {
        ans = BigInteger.ZERO;
      } else if (ans.compareTo(L) <= 0) {
        ans = ans.multiply(BigInteger.valueOf(a));
      }
    }
    if(ans.compareTo(L) <= 0){
      System.out.println(ans);
    }else{
      System.out.println(-1);
    }
  }  
}