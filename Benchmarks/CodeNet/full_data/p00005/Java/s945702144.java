import java.util.Scanner;

public class Main {

	public static int gcd (int a, int b) {
		if (a == b) return a;
		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		return gcd(b, a - b);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int gcd = gcd(a, b);
			long lcm = a * (b / gcd);
			System.out.println(gcd + " " + lcm);
		}

	}

}