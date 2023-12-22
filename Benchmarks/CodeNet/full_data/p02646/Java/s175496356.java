import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long v = sc.nextLong();
		long b = sc.nextLong();
		long w = sc.nextLong();
		long t = sc.nextLong();

		if (Math.abs(a - b) <= (v - w) * t) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}