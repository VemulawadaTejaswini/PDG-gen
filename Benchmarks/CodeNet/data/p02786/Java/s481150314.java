import java.math.BigInteger;
import java.util.*;
public class Main{
  public static void main(String[] args) throws java.lang.Exception{
    Scanner sc=new Scanner(System.in);
    long H = sc.nextLong();
    int log = (int) ((int) Math.log(H)/Math.log(2));
    long n = (int) Math.floor(log+1);
    long sum = (int) (Math.pow(2,n)-1);
    
    
    System.out.println(sum);
  }
}