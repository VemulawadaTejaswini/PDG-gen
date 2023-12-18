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

		if ((c - (a + b)) > 0) {
			right = (long) Math.pow(c - (a + b), 2);
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
