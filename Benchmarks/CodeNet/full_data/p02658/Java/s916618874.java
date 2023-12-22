import java.util.*; 
import java.math.*;
public class Main {
	public static void main(String[] args){ 
     BigInteger f = new BigInteger("1");
     int n = sc.nextInt(); 
      
      while(n-->0) 
      { 
      int c = sc.nextInt();  
      f=f.multiply(BigInteger.valueOf(c));
      } 
    if(f>(Math.pow(10,18))) 
    {
    System.out.print("-1");
    } 
      else 
      {
      System.out.print(f);
      }
    }}