import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		int gcd;
		
		while (sc.hasNext()) {
			a = sc.nextInt();
			b = sc.nextInt();
			gcd = gcd(Math.max(a, b), Math.min(a, b));
			System.out.println(gcd + " " + a / gcd * b);
		}
	}
	
	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}