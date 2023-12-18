import java.math.*;
import java.util.Scanner;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Long> arr=new ArrayList<Long>();
		long a = scn.nextLong();
		if(prime(a)) {
			System.out.println(a-1);
			return;
		}
		long ans = 0;
		long d1=0;
		long d2=0;
		long min=Integer.MAX_VALUE;
		for(long i=1;i<=a/2;i++) {
			if(a%i==0) {
				if(i + a/i < min) {
					min = i + a/i;
				}
			}
		}System.out.println(min-2);
	}
	public static boolean prime(long n) {
		 if (n <= 1) 
	            return false; 
	        if (n <= 3) 
	            return true; 
	        if (n % 2 == 0 || n % 3 == 0) 
	            return false; 
	  
	        for (long i = 5; i * i <= n; i = i + 6) 
	            if (n % i == 0 || n % (i + 2) == 0) 
	                return false; 
	  
	        return true; 
	}
}