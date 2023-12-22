import java.util.*; 
import java.math.*;
public class Main {
	public static void main(String[] args){ 
     BigInteger f = new BigInteger("1");
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt(); 
      
      while(n-->0) 
      { 
      int c = sc.nextInt();  
      f=f.multiply(BigInteger.valueOf(c));
      } 
    
     
      
      System.out.print(f);
      
    }}
