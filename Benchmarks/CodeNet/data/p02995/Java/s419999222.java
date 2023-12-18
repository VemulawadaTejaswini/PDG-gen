
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long q = (b/c)-((a-1)/c);
	//	System.out.println(q);
	//	System.out.println(count);
//		if(q==1 && c<a) {
//			q=q-1;
//		}
//		else {
//			q=q;
//		}

		long r = (b/d)-((a-1)/d);
	//	System.out.println(r);
//		if(r==1 && d<a) {
//			r=r-1;
//		}
//		else {
//			r=r;
//		}
		long lcm = (c*d)/gcd(c,d);
		long s = (b/lcm)-((a-1)/lcm);
	//	System.out.println(s);
//		if(s==1 && lcm<a) {
//			s=s-1;
//		}
//		else {
//			s=s;
//		}
		//System.out.println(s);
		System.out.println((b-a+1)-(q+r-s));

	}
	public static long gcd(long a, long b) {
		if(b==0) {
			return a;
		}
		else {
			return gcd(b,a%b);
		}
	}

}
