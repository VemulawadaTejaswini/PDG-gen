
import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int L = sc.nextInt();

		int a[] = new int[N];
		int sum = 0;

		for (int i = 0; i < N; i++) {
			a[i] = L + i;
			sum += a[i];
		}

		if (a[0] > 0) {
			System.out.print(sum - a[0]);
		} else if (a[N - 1] < 0) {
			System.out.print(sum - a[N - 1]);
		} else {
			System.out.print(sum);
		}

	}
}
