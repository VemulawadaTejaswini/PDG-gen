import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
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
		
	
	List<Long> list=new ArrayList<Long>();
 for (long i=1; i<=Math.sqrt(a); i++) 
    { 
        if (a%i == 0) 
        { 
            // If divisors are equal, print only one 
            if (a/i == i) 
            list.add(i);    //printf("%d ", i); 
  
            else {// Otherwise print both 
               // printf("%d %d ", i, a/i); 
            list.add(i);
            list.add(a/i);
        } }
    } 
 
 Collections.sort(list);
 
 for(int i=1;i<list.size();i++) {
	 
	if(list.get(i)*list.get(i-1)==a) {
		System.out.println(list.get(i)+list.get(i-1)-2);
	}
 }
} 
		
	
	
	
	
	static void check(long a) {
		List<Long> list =new ArrayList<Long>();
		
		for(long i=1;i<=a;i++) {
			for(long j=1;j<=a;j++) {
				
				if(i*j==a) {
					list.add(i+j-2);
					
				}
				
			}
			
		}
		System.out.println(Collections.min(list));

	}
		public static void main(String[] args) {
			
			Scanner sc =new Scanner(System.in);
			
			
			long a,b;
			a=sc.nextLong();
			
			
			
			if(a<100) {
				check(a);
				
			}
			else {
			
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
}
