import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		sc.close();

		long right = c - (a + b);
		right = right * right;
		long left = 4 * a * b;
		if (left < right) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
