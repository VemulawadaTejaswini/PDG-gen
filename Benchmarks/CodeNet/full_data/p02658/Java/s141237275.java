import java.util.*;
import java.math.BigInteger;
public class Main {
    public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    int t=s.nextInt();
     BigInteger f = new BigInteger("1");
    while(t-->0){
    BigInteger n = s.nextBigInteger();
      
   f=f.multiply(n);
    }
    BigInteger b = new BigInteger("1000000000000000000");

if (b.compareTo(f) < 0)  {
     System.out.println("-1");
}
 
   
  else
    System.out.println(f);
    }
}