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
		List primeList = new ArrayList<Long>();
		
		for (int i = 0; i < n; i++) {
			num = Long.parseLong(scanner.nextLine());
			
			if (isPrime(num, primeList)) {
				result++;
			}
			
		}
		
		
		
		System.out.println(result);
	}
	
	static boolean isPrime(long x, List<Long> primeList) {
		boolean result = true;
		
		for (Long prime : primeList) {
			if (x % prime == 0) {
				result = false;
				break;
			}
		}
		
		for (long j = 2; j < x; j++) {
			if (primeList.contains(j)) {
				continue;
			}
			
			if (x % j == 0) {
				result = false;
				primeList.add(j);
				break;
			}
		}
		
		
		return result;
	}
}
