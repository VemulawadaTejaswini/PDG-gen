import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long D = sc.nextLong();
		sc.close();
		long lcm =C*D/gcd(C,D);
		long sumA = (A-1) - (A-1)/C -(A-1)/D + (A-1)/lcm;
		long sumB = B - B/C -B/D + B/lcm;
		System.out.println(sumB - sumA);
	}

	private static long gcd(long a,long b) {
		if(a < b) {
			return gcd(b, a);
		}
		if(b==0) {
			return a;
		}
		return gcd(b,a%b);
	}
}