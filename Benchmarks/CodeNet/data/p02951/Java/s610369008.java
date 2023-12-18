import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 数値
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int d = c - (a - b);
		if (d < 0) {
			c = 0;
		}

		System.out.println(c);

	}
}
