import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long temp = n;
		long x = sc.nextLong();
		n-=x;
//		System.out.println(n + " "+ x);
		long gcd = gcd(n,x);
		n/=gcd;
		x/=gcd;
		long a = n/x;
		long b = n%x;
		long ans = (2*a+2)*x+2*b-3;
		ans*=gcd;
		System.out.println(ans+temp);
	}
	static long gcd(long a, long b) {
		if(b==0) return a;
		return gcd(b,a%b);
	}
}
