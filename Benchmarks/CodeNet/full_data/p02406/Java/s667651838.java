import java.util.Scanner;

public class Main {
	private static boolean inc3(int n) {
		while (n > 0) {
			if (n % 10 == 3) return true;
			n /= 10;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 1; i <= n; ++i) {
			if (i % 3 == 0 || inc3(i)) System.out.printf(" %d", i);
		}
		System.out.println();
	}
}

