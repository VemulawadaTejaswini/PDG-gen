import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int a[] = new int[N];
		int b[] = new int[N];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		int c = 0;
		for (int i = 0; i < N; i++) {
			c = 0;
			for (int j = 0; j < N; j++) {
				if (i != j) {
					b[j] = a[j];
				}
			}
			Arrays.sort(b);

			System.out.println(b[(N + 1) / 2]);
		}
	}

}