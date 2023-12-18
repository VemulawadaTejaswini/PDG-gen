import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if (n == 1) {
			System.out.println("Hello World");
		} else if (n == 2) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int ans = a + b;
			System.out.println(ans);
		}

		sc.close();

	}
}