import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(lcm(2,n));

	}

	public static long gcd(long x, long y) {
		long temp;
		while (x % y != 0) {
			temp = y;
			y = x % y;
			x = temp;
		}
		return y;
	}

	public static long lcm(long x, long y) {
		return (x*y)/gcd(x,y);
	}
}