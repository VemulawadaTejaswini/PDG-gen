import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			Integer a[] = new Integer[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			int count = 0;
			for (int i = 0; i < n; i++) {
				while (a[i] % 2 == 0) {
					a[i] /= 2;
					count++;
				}
			}

			System.out.println(count);
		}

	}

}