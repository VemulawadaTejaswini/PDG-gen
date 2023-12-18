import java.util.*;
import java.math.*;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
   	String n1=sc.next();
    String k1=sc.next();
    BigInteger n=new BigInteger(n1);
    BigInteger k=new BigInteger(k1);
    if(Integer.parseInt(k1)==1) System.out.println(0);
    else if(k.mod(n).equals(new BigInteger("0"))) System.out.println(n);
    else if(n.mod(k).equals(new BigInteger("0"))) System.out.println(0);
    else{
      BigInteger min=new BigInteger("0");
      if(k.compareTo(n)<0) min=n;
      else min=k;
      BigInteger x=n.subtract(k).abs();
      while(x.compareTo(min)<=0){
        x=(n.subtract(k)).abs();
        min=x;
        n=min;
        if(min.equals(new BigInteger("0"))) break;
      }
      System.out.println(min);
    }
  }
}