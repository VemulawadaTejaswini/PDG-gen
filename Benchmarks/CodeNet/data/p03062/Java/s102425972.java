import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long[] a = new long[n];
		
		for(int i = 0; i < n; i++) a[i] = sc.nextLong();
		
		for(int i = 0; i < n-1; i++) {
			if(a[i] <= 0) {
				if(Math.abs(a[i]) >= Math.abs(a[i+1]) || a[i+1] <= 0) {
					a[i] = a[i]*-1;
					a[i+1] = a[i+1]*-1;
				}
			}
		}

		System.out.println(Arrays.stream(a).sum());

	}
	
	private static long gcd(long m, long n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}


}
