import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] x = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			if (x[i] <= k - x[i]) {
				sum += 2 * x[i];
			} else {
				sum += 2 * (k - x[i]);
			}
		}
		System.out.println(sum);
	}
}
