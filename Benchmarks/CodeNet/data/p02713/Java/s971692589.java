
import java.util.*;

class Main {
    
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        long sum = 0;
        
        for(int a=1; a <= K; a++) {
        	  for(int b=1; b <= K; b++) {
        		  for(int c=1; c <= K; c++) {
        		        sum += gcd(a, gcd(b,c));
        	        }
              	
              }
        	
        }


        System.out.print(sum);
        
       
	}
	
	
	private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
	
}
		
	
