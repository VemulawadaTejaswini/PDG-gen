import java.util.*;
import java.math.BigInteger; 

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	BigInteger a = sc.nextBigInteger();
    BigInteger b = sc.nextBigInteger();
    BigInteger x = sc.nextBigInteger();
    BigInteger c = a.divide(x).add(BigInteger.valueOf(1));
    BigInteger d = b.divide(x).add(BigInteger.valueOf(1));
    BigInteger sa = d.subtract(c);
    
    if(a.mod(x).intValue() != 0){
      System.out.println(sa);
    } else{
      System.out.println(sa.add(BigInteger.valueOf(1))); 
    }
  }
}