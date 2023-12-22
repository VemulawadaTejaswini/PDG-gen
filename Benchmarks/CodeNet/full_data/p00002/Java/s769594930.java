import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			int sum = a + b;

			String checkSumLength = String.valueOf(sum);

			System.out.println(checkSumLength.length());
		}
	}

}