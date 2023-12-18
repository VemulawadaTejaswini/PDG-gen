import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a, b;
		a = sc.nextLong();
		b = sc.nextLong();

		int height = 0;
		for (int i = 1; i <= (b - a); i++) {
			height += i;
		}

		System.out.println(height - b);
	}
}