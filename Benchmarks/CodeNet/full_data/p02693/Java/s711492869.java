import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int K = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		a = a/K;
		b = b/K;
		if (K == 1) {
			System.out.println("OK");
		} else if (b != a) {
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}
	}
}
