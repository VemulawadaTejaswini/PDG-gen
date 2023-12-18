import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		System.out.println(gcd(a,b));

	}
	
	static long gcd(long a ,long b) {
		long count = 0;
		double c = Math.sqrt(Math.min(a, b));
		
		for(long i = 1 ; i <= c ; i++) {
			if(a % i == 0 && b % i == 0) {
				if(prime(i))
					count++;
			}
		}
		return count;
	}

	static boolean prime(long n) {
		if(n == 1) return true;
		if(n == 2) return true;
		
		double d = Math.sqrt(n);
		int temp = -1;
		
		for(long i = 2 ; i <= d ; i++) {
			if(n % i == 0) {
				temp = 0;
			    break;
			}
		}
		if(temp == 0) {
			return false;
		}
		return true;
	}
}
