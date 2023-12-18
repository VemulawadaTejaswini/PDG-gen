import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();

		int[] a = new int[n];
		boolean[] check = new boolean[n];
		int count = 0;

		int result = 0;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (a[i] <= x) {
				result += a[i];
				check[i] = true;
				count++;
			}
		}

		if (count == n) {
			System.out.println(result);
		}

		boolean checkN = check[n];
		for (int i = 0; i < n - 1; i++) {
			check[n + 1] = check[n];
		}
		check[0] = checkN;

		for (int i = 0; i < n; i++) {
			if (check[i] == false) {
				result += a[i];
			}
		}

		System.out.println(result);
		sc.close();
	}
}
