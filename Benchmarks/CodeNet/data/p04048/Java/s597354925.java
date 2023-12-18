import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();
		long X = sc.nextLong();
		
		System.out.println(N+solve(X, N-X));
		
		sc.close();
	}
	
	static long solve(long a, long b) {
		if(a>b) {
			long temp = a;
			a = b;
			b = temp;
		}
		
		if(gcd(a,b)==a)
			return (b/a*2-1)*a;
		
		return 2*(b/a)*a + solve(b%a, a);
	}
	
	static long gcd(long a, long b) {
		if(b%a==0)
			return a;
		else
			return gcd(b%a, a);
	}
}
