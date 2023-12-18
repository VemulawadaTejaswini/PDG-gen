import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = n - 1; i >= 0; i--) {
			if ((a[i] + sum) % b[i] != 0) {
				sum += b[i] - ((a[i] + sum) % b[i]);
			}
		}
		System.out.println(sum);
	}
}
