import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong(),b=sc.nextLong(),c=sc.nextLong(),d=sc.nextLong();
		long range=b-a+1, min=lcm(c,d);
		long c_div=b/c-(a-1)/c, d_div=b/d-(a-1)/d, common_div=b/min-(a-1)/min;
		System.out.println(range-(c_div+d_div-common_div));
	}

	static long lcm (long a, long b) {
		long temp;
		long c = a;
		c *= b;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return (long)(c/b);
	}
}
