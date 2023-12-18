import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static boolean isPerfectSquare(long x)  
    { 
          
        // Find floating point value of 
        // square root of x. 
        double sr = Math.sqrt(x); 
      
        // If square root is an integer 
        return ((sr - Math.floor(sr)) == 0); 
    } 
	
	
	 static boolean checkPrime(long n) 
	    { 
	        // Converting long to BigInteger 
	        BigInteger b = new BigInteger(String.valueOf(n)); 
	  
	        return b.isProbablePrime(1); 
	    } 
	
	static void canMultiply(long a) {
		
	
	long k=(long)Math.pow(10, 6);
	
	long prev=1,current;
	for(long i=1;i<(long)a/2;i++) {
			if(a%i==0) {
				current=i;
				
				if(prev*current==a) {
					System.out.println(prev+current-2);
						return;
				}
				prev=current;
				
			}
		
	}
		
	}
		public static void main(String[] args) {
			
			Scanner sc =new Scanner(System.in);
			
			
			long a,b;
			a=sc.nextLong();
			
			if(checkPrime(a)) {
				System.out.println(a-1);
			}
			else if(isPerfectSquare(a)) {
				System.out.println(2*(int)Math.sqrt(a)-2);

			}
			else {
			canMultiply(a);
			}
			
		
		
		
		}

}
