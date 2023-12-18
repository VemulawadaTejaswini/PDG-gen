import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		
		for(int i=0;i<n;i++) a[i] = sc.nextLong();
		
		long max = 0;
		
		if(n == 2) {
			max = Arrays.stream(a).max().getAsLong();
		}else{
			max = Math.max(max, gcd(a[0],a[1]));
			max = Math.max(max, gcd(a[1],a[2]));
			max = Math.max(max, gcd(a[0],a[2]));
		}
		
		System.out.println(max);
			
	}
	
	private static long gcd(long m, long n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}


}
