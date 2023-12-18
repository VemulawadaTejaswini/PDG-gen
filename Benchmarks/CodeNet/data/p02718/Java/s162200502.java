import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int aSum = 0;
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
			aSum += a[i];
		}

		Arrays.sort(a);
		double required = 1.0 * aSum / (4 * m);
		if (a[n - m] >= required) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
