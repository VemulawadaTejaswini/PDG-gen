import java.util.*;

public class Main {
	public static void main(String[] args) {
		long i,j;
		Scanner sc = new Scanner(System.in);
		long a = Long.parseLong(sc.next());
		long b = Long.parseLong(sc.next());
		long c = Long.parseLong(sc.next());
		long d = Long.parseLong(sc.next());
		sc.close();
		long cd = c*d/gcd(c,d);
		long cnt = 0;
		cnt = b/c - (a-1)/c;
//		System.out.println(cnt);
		cnt += b/d - (a-1)/d;
//		System.out.println(cnt);
		cnt -= b/cd - (a-1)/cd;
//		System.out.println(cnt);
		System.out.println(b-a-cnt+1);
	}
	public static long gcd(long a, long b) {
		long t;
		while((t=a%b)!=0) {
			a = b;
			b = t;
		}
		return b;
	}
}
