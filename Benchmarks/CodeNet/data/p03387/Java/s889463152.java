import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] a = { sc.nextInt(), sc.nextInt(), sc.nextInt() };

		Arrays.sort(a);

		int sum = a[2] - a[0] + (a[1] - a[0]);

		if (sum % 2 == 0) {
			System.out.println(sum / 2);
		} else {
			System.out.println(sum / 2 + 2);
		}

		sc.close();
	}
}