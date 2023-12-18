import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] b = new int[n - 1];

		for (int i = 0; i < n - 1; i++) {
			b[i] = sc.nextInt();
		}

		int a = 0;
		a += b[0];
		a += b[n - 2];
		for (int i = 0; i < n - 2; i++) {
			if (b[i] <= b[i + 1]) {
				a += b[i];
			} else {
				a += b[i + 1];
			}
		}
		System.out.println(a);
		sc.close();
	}
}
