import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		long left = 4 * a * b;
		long right = 0;
		long diff = c - (a + b);

		if (diff > 0) {
			right = diff * diff;
		} else { // 負の場合はNG
			System.out.println("No");
			return;
		}

		if (left < right) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
