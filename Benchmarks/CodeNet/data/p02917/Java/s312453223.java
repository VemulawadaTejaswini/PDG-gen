import java.util.Scanner;

public class Main {

	static int n;
	static int a[] = new int[100];
	static int b[] = new int[100];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 0; i < n - 1; i++) {
			b[i] = sc.nextInt();
		}
		a[0] = b[0];
		a[1] = b[0];
		for (int i = 1; i < n - 1; i++) {
			a[i] = b[i];
			if (a[i] > b[i - 1]) {
				a[i] = b[i - 1];
			}
		}
		a[n-1] = b[n-2];

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
		}

		System.out.println(sum);

	}

	static int max(int n1, int n2) {
		int bigger = n1 >= n2 ? n1 : n2;
		return bigger;
	}

}
