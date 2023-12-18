import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long num = gcd(a, b);
		long count = 0;
		for (long i = 2; i <= Math.sqrt(num); i++) {
		    if (num % i == 0 && isPrime(i)) {
		        count++;
		        while (num % i == 0) {
		            num /= i;
		        }
		    }
		}
		if (num > 1) {
		    count++;
		}
		System.out.println(count + 1);
   }
   
   static boolean isPrime(long x) {
       for (long i = 2; i <= Math.sqrt(x); i++) {
           if (x % i == 0) {
               return false;
           }
       }
       return true;
   }
   
   static long gcd(long x, long y) {
       if (x % y == 0) {
           return y;
       } else {
           return gcd(y, x % y);
       }
   }
}


