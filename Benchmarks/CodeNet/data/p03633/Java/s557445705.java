import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = (int)sc.nextLong();
		
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
	    return m / gcd(m, n) * n;
	}
	
	private static long gcd(long m, long n) {
	    long temp;
	    while(m % n != 0) {
	    	temp = n;
	    	n = m % n;
	    	m = temp;
	    }
	    return n;
	}
}
