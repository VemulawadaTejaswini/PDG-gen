import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			long gcd = gcd(a, b);
			long lcm = (a * b) / gcd;
			System.out.println(gcd + " " + lcm);
		}
		sc.close();
	}

	static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}