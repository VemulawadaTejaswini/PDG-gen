import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			int tar = getTar(i);
			if (a <= tar && tar <= b)
				sum += i;
		}
		
		System.out.println(sum);

	}

	private static int getTar(int n) {
		int tar = 0;
		for (int i = n; i > 0; i /= 10) {
			tar += i % 10;
		}
		return tar;
	}

}
