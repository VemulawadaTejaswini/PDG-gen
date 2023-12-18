import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
		final int a = in.nextInt(), b = in.nextInt();
		if (isDivisor(a, b)) {
			System.out.println(a + b);
		} else {
			System.out.println(b - a);
		}

	}

	public static boolean isDivisor(int a, int b) {
		if (b % a == 0) return true;
		else return false;
	}
}
