import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();

		int result = 0;
		for (int j = 0; j < n; j++) {
			final int l = sc.nextInt();
			final int r = sc.nextInt();
			result = result + (r - l + 1);
		}

		System.out.println(result);

	}

}