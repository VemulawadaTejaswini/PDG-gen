import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong()-1;
		long B = sc.nextLong();
		long C = sc.nextLong();
		long D = sc.nextLong();
		//最大公約数
		long plese = (C*D)/gcd(C, D);

		long n = (B-(B/C+B/D))+(B/plese);
		long m = (A-(A/C+A/D))+(A/plese);
		long anser = (n-m);
		System.out.println(anser);
	}
	private static long gcd(long a, long b) {
		if(b==0) {
			return a;
		}
		a = a%b;
		return gcd(b,a);
	}

}
