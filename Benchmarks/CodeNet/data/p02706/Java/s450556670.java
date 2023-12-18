import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m];
		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		int sum = 0;
		for (int i = 0; i < m; i++) {
			sum += a[i];
		}
		if (sum > n) {
			System.out.println(-1);
		} else {
			System.out.println(n - sum);
		}
	}
}
