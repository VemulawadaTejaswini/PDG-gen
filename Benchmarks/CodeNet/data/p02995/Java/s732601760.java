import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long D = sc.nextLong();
		
		long c = 0;
		long d = 0;
		long cd = 0;
		
		long koub = 0;
		
		koub = C * D / gcd(C, D);
		
		if(A == B) {
			if(A % C != 0 && A % D != 0) {
				System.out.println(1);
				return;
			} else {
				System.out.println(0);
				return;
			}
		}
		
		if(C == D) {
			long x = 0;
			if(A % C != 0) {
				x = (B - ((A - A % C) / C + 1) * C) / C + 1;
			} else {
				x = (B - A) / C + 1;
			}
			System.out.println(B - A + 1 - x);
			return;
		}
		
		if(A % C != 0) {
			c = (B - ((A - A % C) / C + 1) * C) / C + 1;
		} else {
			c = (B - A) / C + 1;
		}
		
		if(A % D != 0) {
			d = (B - ((A - A % D) / D + 1) * D) / D + 1;
		} else {
			d = (B - A) / D + 1;
		}
		
		if(A % koub != 0) {
			cd = (B - ((A - A % koub) / koub + 1) * koub) / koub + 1;
		} else {
			cd = (B - A) / koub + 1;
		}
		
		System.out.println(B - A + 1 - c - d + cd);
	}
	
	public static long gcd(long a, long b) {
		if(b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}
