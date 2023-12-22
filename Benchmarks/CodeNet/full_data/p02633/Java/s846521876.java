import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int x = sc.nextInt();

			if (360 % x == 0) {
				System.out.println(360 / x);
			} else {
				System.out.println(360);
			}
		}
	}
}
