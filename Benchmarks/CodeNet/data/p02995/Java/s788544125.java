import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a =sc.nextLong();
		long b =sc.nextLong();
		long c =sc.nextLong();
		long d=sc.nextLong();
		long ans=0;
		long gcd=gcd(c,d);
		ans+=b-(b/c+b/d-b/(gcd*(c/gcd)*(d/gcd)));
		ans-=a-1-((a-1)/c+(a-1)/d-(a-1)/(gcd*(c/gcd)*(d/gcd)));
		System.out.println(ans);
	}
	private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
}
}

