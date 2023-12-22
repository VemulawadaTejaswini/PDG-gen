import java.util.*;
import java.math.BigInteger;
 
public class Main{
  
  public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    
      BigInteger ans  = BigInteger.ONE;
      while(sc.hasNext()){
        long a = sc.nextLong();
        ans = ans.multiply(BigInteger.valueOf(a));
      }
      long l = 1000000000000000000L;
      BigInteger L = BigInteger.valueOf(l);
    
      if(ans.compareTo(L) <= 0){
        System.out.println(ans);
      }else{
        System.out.println(-1);
      }
  }  
}