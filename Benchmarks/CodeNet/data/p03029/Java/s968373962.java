import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int a = sc.nextInt();
			int p = sc.nextInt();

			int result = (3 * a + p) / 2;
			System.out.println(result);
		}
	}
}