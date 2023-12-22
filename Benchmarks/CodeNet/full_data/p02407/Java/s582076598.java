import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int d = n - 1; d > 0; d--) {
			System.out.printf("%d ", a[d]);
		}
		System.out.printf("%d", a[0]);
		System.out.println("");
		sc.close();
	}
}
