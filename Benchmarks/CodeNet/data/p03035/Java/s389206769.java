import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int a = sc.nextInt();
			int b = sc.nextInt();

			int p = b;
			if (a <= 5) {
				p = 0;
			} else if (a <= 12) {
				p = b / 2;
			}
			System.out.println(p);
		}
	}
}
