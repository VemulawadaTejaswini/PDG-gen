import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
      	int count = 0; 
        //BigInteger biga = new BigInteger(a); 
        //BigInteger first = new BigInteger("100"); 
        long f = 100;
      
      	while (a > f)
       	{ f*= 1.01;
          count++;
        }				
		System.out.println(count);
	}
}