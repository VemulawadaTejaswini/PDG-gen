import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			int x = a;
			while (x <= (a * b)) {
				if (x % b == c) {
					System.out.println("YES");
					return;
				}
				x += a;
			}
			System.out.println("NO");

		} finally {
			sc.close();
		}
	}
}