import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		
		long t[] = new long[N];
		for(int i = 0; i < N; i++) {
			t[i] = sc.nextLong();
		}
		
		long answer = 1;
		for(int i = 0; i < N; i++) {
			answer = lcm(t[i], answer); 
		}
		
		System.out.println(answer);
	}
	
	private static long lcm(long m, long n) {
	    return m * n / gcd(m, n);
	}
	
	private static long gcd(long m, long n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
}
