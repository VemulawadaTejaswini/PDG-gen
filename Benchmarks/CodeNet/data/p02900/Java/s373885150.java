import java.util.*;
public class Main {
	public static boolean isPrime(int num) {
	    if (num < 2) return false;
	    else if (num == 2) return true;
	    else if (num % 2 == 0) return false;

	    double sqrtNum = Math.sqrt(num);
	    for (int i = 3; i <= sqrtNum; i += 2)
	    {
	        if (num % i == 0)
	        {
	            return false;
	        }
	    }

	    return true;
	}
	
	public static long gcd (long a, long b) {
		long temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long A = stdIn.nextLong();
		long B = stdIn.nextLong();
		long GCD = gcd(A,B);
		
		long count = 1;
		for(int i = 1; i <= GCD/2; i++) {
			if(GCD%i == 0 && isPrime(i)) count++;
		}
		
		System.out.println(count);

	}

}