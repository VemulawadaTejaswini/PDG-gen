import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next(), b = sc.next();
		int n = Integer.parseInt(a + b);
		sc.close();

		for (int i = 1; i < 100101; i++) {
			if (i * i == n) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
