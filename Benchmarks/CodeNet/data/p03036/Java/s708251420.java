import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) throws Exception {
		sc = new Scanner(System.in);
		int r = sc.nextInt();
		int D = sc.nextInt();
		int x = sc.nextInt();

		int a = 0;

		for (int i = 0; i < 10; i++) {
			if (i == 0) {
				a = r * x - D;
			} else {
				a = r * a - D;

			}
			System.out.println(a);
		}

	}
}
