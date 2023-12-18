import java.util.Scanner;
public class Main {

//最小公倍数lcm
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
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		long a = stdIn.nextLong();
		long b = stdIn.nextLong();
		long c = stdIn.nextLong();
		long d = stdIn.nextLong();
		
		long cnt = b-b/c-b/d+b/lcm(c,d);
		
		long ccnt = (a-1)-(a-1)/c-(a-1)/d+(a-1)/lcm(c,d);
		
		long ans = cnt - ccnt;
		System.out.println(ans);
		
	}

}
