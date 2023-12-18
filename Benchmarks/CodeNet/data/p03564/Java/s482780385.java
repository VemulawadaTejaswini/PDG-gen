import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();
		final int k = sc.nextInt();

		int result = 1;
		for (int i = 0; i < n; i++) {
			if (result * 2 < result + k) {
				result = result * 2;
			} else {
				result = result + k;
			}
		}

		 System.out.print(result);

	}

}
