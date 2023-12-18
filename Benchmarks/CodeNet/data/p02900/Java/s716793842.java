/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public final class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		long a = s.nextLong();
		long b = s.nextLong();
		HashSet<Long> set = new HashSet<>();
        System.out.println(printAllDivisors(a,b,set)+1);
	}
    public static long gcd(long a, long b) 
    { 
    if (a == 0) 
        return b; 
    return gcd(b % a, a); 
    } 
    public static long printAllDivisors(long a,long b ,HashSet<Long> divisors) 
    {    
    long g = a; 
        g = gcd(b, g); 
 
        for (long i = 1; i * i <= g; i++) 
        { 
            if (g % i == 0)  
            { 
                divisors.add(i); 
                if (g / i != i) 
                    divisors.add(g / i); 
            } 
        }
        long ans = 0;
        for(long i : divisors){
            if(isPrime(i)){
                ans++;
            }
        }
        return ans;
    }
    static boolean isPrime(long n) 
    { 
        // Corner cases 
        if (n <= 1) return false; 
        if (n <= 3) return true; 
      
        // This is checked so that we can skip  
        // middle five numbers in below loop 
        if (n % 2 == 0 || n % 3 == 0) return false; 
      
        for (long i = 5; i * i <= n; i = i + 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
            return false; 
      
        return true; 
    }
}