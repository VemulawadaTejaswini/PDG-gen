/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		long num;
		int result = 0;

		for (int i = 0; i < n; i++) {
			num = Long.parseLong(scanner.nextLine());
			
			if (isPrime(num)) {
				result++;
			}
			
		}
		
		
		
		System.out.println(result);
	}
	
	static boolean isPrime(long x) {
		boolean result = true;
		
		if (x == 2) {
			return result;
		}

		for (long j = 2; j <= Math.ceil(Math.sqrt(x)) ; j++) {
			
			if (x % j == 0) {
				result = false;
				
				break;
			}
		}
		
		
		return result;
	}
}
