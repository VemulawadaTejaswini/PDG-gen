import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		long lcm = c * d / gcd(c , d);

		long u = b - a + 1;
		long cs = b / c - (a - 1) / c;
		long ds = b / d - (a - 1) / d;
		long lcms = b / lcm - (a - 1) / lcm;
		sc.close();
		System.out.println(u - cs - ds + lcms);

	}
	public static long gcd(long num1,long num2) {
        if(num2 == 0) return num1;
        else return gcd(num2 , num1 % num2 );
 }
}

