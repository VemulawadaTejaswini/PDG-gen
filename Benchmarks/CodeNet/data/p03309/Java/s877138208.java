import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			Integer a[] = new Integer[n];
			Integer ai[] = new Integer[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				ai[i] = a[i] - i;
			}

			Arrays.sort(ai);
			int b = 0;
			if (n % 2 == 0) {
				b = (ai[n / 2] + ai[(n / 2) + 1]) / 2;
			} else {
				b = ai[(n / 2) + 1];
			}

			int result = 0;
			for (int i = 0; i < n; i++) {
				result += Math.abs(ai[i] - b);
			}
			
			System.out.println(result);

		}

	}

}
