import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a[] = new long[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		long sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				sum += a[i] * a[j] % 1000000007;;
				sum = sum % 1000000007;
			}
		}

		System.out.println(sum);

		sc.close();

	}

}