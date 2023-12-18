import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, a[], psum[], psum2[], sum = 0;
		n = sc.nextInt();
		a = new int[n];
		psum = new int[n];
		psum2 = new int[n];
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
			sum += a[i];
			psum[i] = sum;
		}
		sc.close();

		sum = 0;

		for (int i = n - 1; i >= 0; --i) {
			sum += a[i];
			psum2[n - i - 1] = sum;
		}

		int min = 2000000001, sub;

		for (int i = 0; i < n - 1; ++i) {
			sub = Math.abs(psum[i] - psum2[n - i - 2]);
			min = Math.min(min, sub);
		}

		System.out.println(min);
	}

}
