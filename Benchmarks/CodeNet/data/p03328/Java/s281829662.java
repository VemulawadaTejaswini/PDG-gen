import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();

		int n = 1;
		int m = 2;

		while (n - a < 0) {
			n = n + m;
			m++;
		}
		int A = n - a;
		System.out.println(A);
	}
}