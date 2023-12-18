import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long D = sc.nextLong();

		long cnum = divisornum((double)A,(double)B,(double)C);
		long dnum = divisornum((double)A,(double)B,(double)D);
		long cdnum = divisornum((double)A,(double)B,(double)lcm(C,D));

		long ans = (B-A+1) - (cnum + dnum - cdnum);
		System.out.println(ans);
	}

	public static long divisornum(double m,double n,double a) {
		long mindiv = (long) Math.ceil(m/a);
		long maxdiv = (long) Math.floor(n/a);
		return (maxdiv - mindiv) + 1;
	}

	public static long gcd(long a,long b) {
		if(b == 0) return a;
		else return gcd(b,a%b);
	}

	public static long lcm(long a,long b) {
		return a*b/gcd(a,b);
	}
}