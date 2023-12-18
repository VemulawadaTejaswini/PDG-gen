import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N=sc.nextLong(),X=sc.nextLong();
		long res=0L;

		for(long i=0L; i<N;i++) {
			long x1=sc.nextLong();
			long d1=Math.abs(x1-X);
			res=gcd(res,d1);
		}
		System.out.println(res);
	}

	public static long gcd(long n,long m) {
		if(n<m) {
			return gcd(m,n);
		}
		if(m==0) {
			return n;
		}
		return gcd(m,n%m);
	}
}