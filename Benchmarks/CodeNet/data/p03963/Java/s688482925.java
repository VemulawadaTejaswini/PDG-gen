
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int i = 0;
		long ans = 1;

		for (i = 0; i < n-1; i++) {

			if (n == 1) {

			} else if (1 < n) {
				ans = ans * (k - 1);
			}

		}
		System.out.println(ans * k);

	}

}