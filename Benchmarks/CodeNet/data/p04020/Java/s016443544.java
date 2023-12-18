import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		long ans = 0;
		int a = 0, b = 0;
		a = scanner.nextInt();
		for (int i = 0; i < N - 1; i++) {
			b = scanner.nextInt();
			ans = ans + (a + b) / 2;
			b = b - a;
			a = b % 2;
		}
		System.out.println(ans);
	}
}