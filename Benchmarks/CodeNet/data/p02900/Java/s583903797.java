import java.util.Scanner;
public class Main{
	
	static long count = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		long n = prime1(a,b);
		
		System.out.println(n);
		
		
	}

	private static long prime1(long a,long b) {
		
		long p = (long)Math.floor(Math.sqrt(a));
		long q = (long)Math.floor(Math.sqrt(b));
		
		if(a == 1 || b == 1) {
			return 1;
		}
		for(long i = 1; i <= Math.min(p, q) ; i++) {
			if((a % i == 0) &&( b % i == 0)) {
				if(prime2(i)) {
					count++;
				}	
			}
		}
		return count;
		
	}
private static boolean prime2(long a) {
	
		long p = (long)Math.floor(Math.sqrt(a));
		
		if(a == 1) {
			return true;
		}
		if(a == 2) {
			return true;
		}
		
		int temp = -1;
		
		for(long i = 2; i <= p ; i++) {
			if(a % i == 0 ) {
				temp = 0;
				break;
			}	
		}
		if(temp == -1) {
			return true;
		}
		else {
			return false;
		}
		
}
	}
	



