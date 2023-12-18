import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long all = b-a+1;
		
		long ca = (long) Math.ceil((double)a/(double)c);
		long cb = b/c;
		long cc = cb-ca+1;
		
		long da = (long) Math.ceil((double)a/(double)d);
		long db = b/d;
		long dd = db-da+1;
		
		long cd = lcm(c,d);
		long cda = (long) Math.ceil((double)a/(double)cd);
		long cdb = b/cd;
		long cdcd = cdb-cda+1;
		
		System.out.println(all-cc-dd+cdcd);
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