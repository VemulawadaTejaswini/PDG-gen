import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[3 * n];

		for (int i = 0; i < 3 * n; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);

		long sum = 0;
		for (int i = 3 * n - 2; 0 < i; i -= 2) {
			sum += a[i];
		}

		System.out.println(sum);

		sc.close();
	}

}
