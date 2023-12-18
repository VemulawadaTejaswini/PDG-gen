import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//input
		long a = scan.nextLong();
		long b = scan.nextLong();
		long c = scan.nextLong();
		long d = scan.nextLong();
		//a〜bの数
		long atob = b - a + 1;
		//cの約数の数
		long countC = b / c - a / c;
		//dの約数の数
		long countD = b / d - a / d;

		//gcd(c,d)
		long temp;
		long e = c;
		e *= d;
		while ((temp = c % d) != 0) {
			c = d;
			d = temp;
		}
		long gcd = (long) (e / d);
		//gcd(a,b)の数
		long countGCD = b / gcd - a / gcd;
		//cでもdでも割り切れない数
		long ans;
		ans = atob - (countC + (countD - countGCD));
		System.out.println(ans);
		scan.close();
	}

}