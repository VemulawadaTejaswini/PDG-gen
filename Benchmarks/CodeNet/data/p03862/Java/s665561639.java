import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();

		int a[] = new int[n];
		int count = 0;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int j = 0; j < n - 1; j++) {
			while ((a[j] + a[j + 1]) > x) {
				if (a[j] > a[j + 1]) {
					a[j]--;
				} else {
					a[j + 1]--;
				}
				count++;
			}
		}

		System.out.println(count);
	}

}
