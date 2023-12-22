import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		if (n % 2 != 0) {
			n = n - 1;
		}

		int half = n / 2;

		for (int i = 0; i < m; i++) {
			int a = half - i;
			int b = half + 1 + i;
			System.out.println(a + " " + b);
		}
	}
}
